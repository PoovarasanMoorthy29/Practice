package TwoPointers;
import java.util.Arrays;
public class RotatedArrayWithK {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
    //Helper method...
    private static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;

        }
    }

    static void main() {
        RotatedArrayWithK obj =new RotatedArrayWithK();
        int[] n={1,2,3,4,5,6,7};
        int k=3;
        obj.rotate(n,k);
        System.out.println(Arrays.toString(n));
    }
}
