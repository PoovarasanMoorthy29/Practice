import java.util.Arrays;

public class ThirdLargestNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        for(int i = n-2; i >= 0; i--){
            if(nums[i] != nums[i+1]){
                count++;
                if(count == 3){
                    return nums[i];
                }
            }
        }
        return nums[n-1];
    }

    public static void main(String[] args) {
        ThirdLargestNumber obj=new ThirdLargestNumber();
        int [] arr={2,1,3};
        System.out.println(obj.thirdMax(arr));
    }
}
