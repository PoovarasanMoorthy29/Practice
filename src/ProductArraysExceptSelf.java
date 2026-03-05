import java.util.Arrays;
public class ProductArraysExceptSelf {
    //Brute force & time complexity :O(N^2)

    public int[] productExceptSelf(int[] nums) {
        /*
        int [] productArr=new int[nums.length];
        for(int outer=0;outer<nums.length;outer++){
            int curProduct=1;
            for(int inner =0;inner<nums.length;inner++){
                if(inner!=outer){
                    curProduct*=nums[inner];
                }
            }
            productArr[outer]=curProduct;
        }
        return productArr;

     */
    int result[]=new int[nums.length];
    result[0]=1;
        for(int index=1;index<nums.length;index++){
        result[index]=result[index-1]*nums[index-1];

    }
    int suffix=1;
        for(int j=nums.length-1;j>=0;j--){
        result[j]*=suffix;
        suffix*=nums[j];
    }
        return result;

    }
    public static void main(String[] a){
        int[] input={1,2,3,4};
        ProductArraysExceptSelf obj=new ProductArraysExceptSelf();
        System.out.println(Arrays.toString(obj.productExceptSelf(input)));
    }
}
