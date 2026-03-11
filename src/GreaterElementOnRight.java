import java.util.Arrays;
public class GreaterElementOnRight {
    public int[] replaceElements(int[] arr) {
        // Brute force & Time complexity : O(N^2)
        int[] rightElementGreaterArr=new int[arr.length];
        for(int index=0;index<arr.length-1;index++){
            int maxEle=arr[index+1];
            for(int idx=index+1;idx<arr.length;idx++){
                if(arr[idx]>maxEle){
                    maxEle=arr[idx];
                }
            }
            rightElementGreaterArr[index]=maxEle;
        }
        rightElementGreaterArr[arr.length-1]=-1;
        return rightElementGreaterArr;
    }

    static void main() {
        GreaterElementOnRight obj=new GreaterElementOnRight();
        int[] arr={17,18,5,4,6,1}; // o/p [18, 6, 6, 6, 1, -1]
        System.out.println("Result Array: "+Arrays.toString(obj.replaceElements(arr)));
    }
}
