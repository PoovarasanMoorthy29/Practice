package TwoPointers;
import java.util.Arrays;
public class LargestPositiveInteger {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] == (-1 * nums[j])) {
                    return nums[i];
                }

            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[] arr= {-1,2,-3,3};
        LargestPositiveInteger obj=new LargestPositiveInteger();
        System.out.println(obj.findMaxK(arr));
    }
}
