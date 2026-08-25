package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestMissingMultipleOfK {
    public int missingMultiple(int[] nums, int k) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            max = Math.max(max, num);
            set.add(num);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 1; index <= max; index++) {
            map.put(index, index * k);
        }
        for (Integer value : map.values()) {
            if (!set.contains(value)) {
                return value;
            }
        }
        return max + 1;

    }

    static void main() {
        int[] arr={8,2,3,4,6};
        int k=2;
        SmallestMissingMultipleOfK obj=new SmallestMissingMultipleOfK();
        System.out.println(obj.missingMultiple(arr,k));
    }
}
