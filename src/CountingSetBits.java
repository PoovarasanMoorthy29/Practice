package src;
import java.util.Arrays;
public class CountingSetBits {
    public static void main(String[] args) {
        int n=5;
        CountingSetBits obj=new CountingSetBits();
        System.out.println(Arrays.toString(obj.countSetBit(n)));
    }
    private int[] countSetBit(int n){
        int[] result=new int[n+1];
        for(int i=0;i<=n;i++){
            result[i]=Integer.bitCount(i);
        }
        return result;
    }
}
