package src;

import java.util.Arrays;

public class LeftRightSumDifference {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        if(n==1){
            return new int[]{0};
        }
        int [] leftSum=new int[nums.length];
        int [] rightSum=new int[nums.length];

        for(int i=0;i<n;i++){
            if(i==0){
                leftSum[i]=0;
            }
            else{
                leftSum[i]=leftSum[i-1]+nums[i-1];
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==nums.length-1){
                rightSum[i]=0;
            }
            else{
                rightSum[i]=rightSum[i+1]+nums[i+1];
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr={10,4,8,3};
        LeftRightSumDifference obj=new LeftRightSumDifference();
        System.out.println(Arrays.toString(obj.leftRightDifference(arr)));
    }
}
