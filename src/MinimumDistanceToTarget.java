package src;

public class MinimumDistanceToTarget {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int index=0;index<nums.length;index++){
            if(nums[index]==target){
                min=Math.min(min,Math.abs(start-index));
            }
        }
        return min;
    }

    static void main() {
        int[] arr={1,2,3,4,5};
        int target=5;
        int start=3;
        MinimumDistanceToTarget obj=new MinimumDistanceToTarget();
        System.out.println(obj.getMinDistance(arr,target,start));
    }
}
