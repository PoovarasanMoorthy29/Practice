package src;

import java.util.Set;
import java.util.HashSet;

public class SubArrayEqualSum {
    public boolean findSubarrays(int[] nums) {
        Set<Long> list = new HashSet<>();

        for (int i = 1; i < nums.length; i++) {
            long sum = nums[i - 1] + nums[i];
            if (list.contains(sum))
                return true;
            else if (!list.contains(sum))
                list.add(sum);
        }
        return false;

    }
    public static void main(String [] args){
        SubArrayEqualSum obj=new SubArrayEqualSum();
        int [] arr={4,2,4};
        System.out.println(obj.findSubarrays(arr));
    }
}
