import java.util.Arrays;
public class HeightChecker {
    public int checkHeight(int[] heights) {
        int [] expected=new int[heights.length];
        for(int index=0;index<heights.length;index++){
            expected[index]=heights[index];
        }
        Arrays.sort(expected);
        int count=0;
        for(int index=0;index<expected.length;index++){
            if(expected[index]!=heights[index]){
                count++;
            }
        }
        return count;

    }

    static void main(String [] args) {
        int[] heights={1,1,4,2,1,3};
        HeightChecker obj=new HeightChecker();
        System.out.println(obj.checkHeight(heights));


    }
}
