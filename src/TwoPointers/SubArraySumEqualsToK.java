package TwoPointers;

public class SubArraySumEqualsToK {
    public int subarraySum(int[] nums, int k) {
        //Brute force & Time complexity :O(N^2)
        int subArrCount=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    subArrCount++;
                }

            }
        }
        return subArrCount;

    }

    static void main() {
        SubArraySumEqualsToK obj=new SubArraySumEqualsToK();
        int[] n={1,2,3};
        int k=3;
        System.out.println(obj.subarraySum(n,k));
    }
}
