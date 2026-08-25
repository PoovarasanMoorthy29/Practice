package src;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                return nums1[left];
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else {
                right++;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int num1[]={1,2,3,4};
        int num2[]={2,4};
        MinimumCommonValue obj=new MinimumCommonValue();
        System.out.println(obj.getCommon(num1,num2));
    }
}
