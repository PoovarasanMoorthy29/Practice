import java.util.Arrays;
public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null||mat.length==0) return new int[0];
        int rows=mat.length;
        int cols=mat[0].length;
        int[]result=new int[rows*cols];
        int row=0;
        int col=0;
        boolean goingUp=true;
        for(int index=0;index<result.length;index++){
            result[index]=mat[row][col];
            if(goingUp==true){
                if(col==cols-1){
                    row++;
                    goingUp=false;
                }
                else if(row==0){
                    col++;
                    goingUp=false;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row==rows-1){
                    col++;
                    goingUp=true;
                }
                else if(col==0){
                    row++;
                    goingUp=true;
                }
                else{
                    col--;
                    row++;
                }
            }

        }
        return result;
    }
    public static void main(String[] args){
        int [] [] mat={{1,2,3},{4,5,6},{7,8,9}};
        DiagonalTraversal obj=new DiagonalTraversal();
        System.out.println(Arrays.toString(obj.findDiagonalOrder(mat)));
    }
}
