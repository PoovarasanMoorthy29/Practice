public class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        for(int index=1;index<nums.length;index++){
            nums[index]=nums[index-1]+nums[index];
        }
        int totalSum=nums[nums.length-1];
        for(int index=0;index<nums.length;index++){
            int leftSum=(index==0)?0: nums[index-1];
            int rightSum=totalSum-nums[index];
            if(leftSum==rightSum){
                return index;
            }
        }
        return -1;

    }

    static void main() {
        int[] arr={2,3,-1,8,4};
        FindMiddleIndex obj=new FindMiddleIndex();
        System.out.println(obj.findMiddleIndex(arr));
    }
}
