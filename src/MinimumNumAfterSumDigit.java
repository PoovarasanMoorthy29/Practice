package src;

public class MinimumNumAfterSumDigit {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int index=0;index<nums.length;index++){
            int cur=nums[index];
            int count=0;
            while(cur>0){
                count+=cur%10;
                cur/=10;
            }
            min=Math.min(min,count);
        }
        return min;
    }

    public static void main(String[] args) {
        MinimumNumAfterSumDigit obj=new MinimumNumAfterSumDigit();
        int [] arr= {10,22,34,56};
        System.out.println(obj.minElement(arr));
    }
}
