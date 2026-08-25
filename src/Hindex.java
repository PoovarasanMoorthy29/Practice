import java.util.Arrays;

public class Hindex {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for(int index=0;index<n;index++){
            if(citations[index]>=n-index){
                return n-index;
            }
        }
        return 0;

    }
    public static void main(String [] args){
        int [] arr={3,0,6,1,5};
        Hindex obj=new Hindex();
        System.out.println(obj.hIndex(arr));
    }
}
