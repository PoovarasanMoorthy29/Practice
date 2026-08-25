package src;
import java.util.Arrays;
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,4,3,3};
        SingleNumber obj=new SingleNumber();
        System.out.println(obj.getSingleNumber(nums));

    }
    private int getSingleNumber(int[] arr){
        int uniqueNumber=0;
        for(int index=0;index<arr.length;index++){
            uniqueNumber^=arr[index];
        }
        return uniqueNumber;
    }
}
