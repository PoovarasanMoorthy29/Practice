public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int [] sArr=new int[256];
        int [] tArr=new int[256];
        for(int index=0;index<s.length();index++){
            sArr[s.charAt(index)]++;
        }
        for(int index=0;index<t.length();index++){
            tArr[t.charAt(index)]++;
        }
        for(int index=0;index<sArr.length;index++){
            if(sArr[index]!=tArr[index] ){
                return (char)index;
            }
        }
        return '0';

    }
    public static void main(String[] args) {
        FindTheDifference obj=new FindTheDifference();
        String str1="abcde";
        String str2="abcd";
        System.out.println(obj.findTheDifference(str1,str2));
    }

}
