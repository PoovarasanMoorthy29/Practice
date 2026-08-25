package src;

public class MaximumTotalSubarray {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return (long) (max - min) * k;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        int k = 3;
        MaximumTotalSubarray obj = new MaximumTotalSubarray();
        System.out.println(obj.maxTotalValue(arr, k));
    }
}
