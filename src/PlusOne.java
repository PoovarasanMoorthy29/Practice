package TwoPointer.src.Math;

import java.util.Arrays;
public class PlusOne {
    static void main() {
        PlusOne obj=new PlusOne();
        int [] nums={1,2,3};
        System.out.println(Arrays.toString(obj.getPlusOneArr(nums)));
    }
    public int[] getPlusOneArr(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1 !=10){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int [] result=new int[digits.length+1];
        result[0]=1;
        return result;

    }
}
