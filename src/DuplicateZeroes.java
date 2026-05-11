package src;

import java.util.Arrays;
public class DuplicateZeroes {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;){
            if(arr[i]==0){
                shift(i,arr.length-1,arr);
                i+=2;
            }
            else{
                i++;
            }
        }
    }
    private static void shift(int left,int right,int[] arr){
        while(left<right){
            arr[right]=arr[right-1];
            right--;
        }
    }

    static void main() {
        int[]arr={1,0,2,3,0,4,5,0};
        DuplicateZeroes obj=new DuplicateZeroes();
        obj.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
