public class FindMaximumConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int curCount = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1) {
                curCount++;
            } else if (nums[index] == 0) {
                if (maxCount < curCount) {
                    maxCount = curCount;
                }
                curCount = 0;
            }
        }
        return Math.max(maxCount, curCount);
    }
    public static void main(String[] a) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        FindMaximumConsecutiveOnes obj = new FindMaximumConsecutiveOnes();
        System.out.println(obj.findMaxConsecutiveOnes(arr));
    }
}
