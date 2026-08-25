package src;

public class ArrayConcatValue {
    public long findTheArrayConcVal(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        long result = 0;
        while (left < right) {
            String cur = String.valueOf(nums[left++]) + String.valueOf(nums[right--]);
            result += Integer.parseInt(cur);
        }
        return (left==right)?result+=nums[left]:result;

    }

    public static void main(String[] args) {
        int[] arr={7,52,2,4};
        ArrayConcatValue obj=new ArrayConcatValue();
        System.out.println(obj.findTheArrayConcVal(arr));
    }

}
