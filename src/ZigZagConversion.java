public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        int dir=-1;
        for(char c :s.toCharArray()){
            rows[row].append(c);
            if(row ==0 || row == numRows-1){
                dir*=-1;
            }
            row+=dir;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }
        return result.toString();
    }

    static void main() {
        String str="PAYPALISHIRING";
        int row=3;
        ZigZagConversion obj=new ZigZagConversion();
        System.out.println(obj.convert(str,row));
    }
}
