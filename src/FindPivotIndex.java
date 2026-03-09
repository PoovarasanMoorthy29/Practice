public class FindPivotIndex {
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
    }

    static void main() {
        FindPivotIndex obj=new FindPivotIndex();
        int[]arr={1,7,3,6,5,6};
        System.out.println(obj.pivotIndex(arr));

    }
}
