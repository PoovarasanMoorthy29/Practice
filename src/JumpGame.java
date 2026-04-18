public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach=0;
        for(int index=0;index<nums.length;index++){
            if(index>reach){
                return false;
            }
            reach=Math.max(reach,index+nums[index]);

            if(reach==nums.length-1){
                return true;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int []arr={2,3,1,1,4};
        JumpGame obj=new JumpGame();
        System.out.println(obj.canJump(arr));
    }
}
