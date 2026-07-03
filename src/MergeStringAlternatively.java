package src;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        MergeStringAlternatively obj=new MergeStringAlternatively();
        String word1="ab";
        String word2="pqrs";
        System.out.println(obj.mergeString(word1,word2));
    }

    private String mergeString(String word1,String word2){
        int left=0;
        int right=0;
        String result="";
        while(left<word1.length() || right<word2.length()){
            if(left==word1.length()){
                result+=""+word2.charAt(right++);
            }
            else if(right==word2.length()){
                result+=""+word1.charAt(left++);
            }
            else{
                result+=""+word1.charAt(left++)+word2.charAt(right++);
            }
        }
        return result;
    }
}
