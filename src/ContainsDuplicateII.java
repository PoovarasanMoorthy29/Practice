import java.util.*;
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> list=new HashSet<>();
        for(int index=0;index<nums.length;index++){
            if(list.contains(nums[index])){
                return true;
            }

            list.add(nums[index]);

            if(list.size()>k){
                list.remove(nums[index-k]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicateII obj=new ContainsDuplicateII();
        int[] arr={1,0,1,1};
        int k=1;
        System.out.println(obj.containsNearbyDuplicate(arr , k ));
    }
}
