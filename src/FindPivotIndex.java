import java.util.Arrays;

public class FindPivotIndex {
    /*
    Brute force & time complexity:O(N^2)
    public int pivotIndex(int[] nums) {

        for(int index=0;index<nums.length;index++){
            if(isPivot(index,nums)){
                return index;
            }
        }
        return -1;
    }
    // helper method
    private static boolean isPivot(int idx,int [] arr){
        int left=0;
        int right=0;
        // left Sum
        for(int index=0;index<idx;index++){
            left+=arr[index];
        }
        //right sum
        for(int index=idx+1;index<arr.length;index++){
            right+=arr[index];
        }
        return left==right;
    }*/

    // Optimal time complexity : O(N)
    // Space complexity :O(N).
    /*
    public int pivotIndex(int[]nums){
        int[] prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];

        for(int index=1;index<nums.length;index++){
            prefixSum[index]=prefixSum[index-1] + nums[index];

        }
        System.out.println(Arrays.toString(prefixSum));
        //find the pivot
        for(int index=0;index<nums.length;index++){
            int left=(index==0)?0:prefixSum[index-1];
            int right=prefixSum[nums.length-1]-prefixSum[index];
            if(left==right){
                return index;
            }

        }
        return -1;
    }*/
    public int pivotIndex(int[]nums){
        for(int index=1;index<nums.length;index++){
            nums[index]=nums[index-1] + nums[index];
//            System.out.println(index+" th Step: "+Arrays.toString(nums));
        }
//        System.out.println(Arrays.toString(nums));
        //find the pivot
        for(int index=0;index<nums.length;index++){
            int leftSum=(index==0)?0:nums[index-1];
            int rightSum=nums[nums.length-1]-nums[index];
            if(leftSum==rightSum){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] a) {
        FindPivotIndex obj=new FindPivotIndex();
        int[]arr={1,7,3,6,5,6};
        System.out.println(obj.pivotIndex(arr));

    }
}
