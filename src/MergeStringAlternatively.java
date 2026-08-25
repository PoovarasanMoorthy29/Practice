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
        StringBuilder result= new StringBuilder();
        while(left<word1.length() || right<word2.length()){
            if(left==word1.length()){
                result.append(word2.charAt(right++));
            }
            else if(right==word2.length()){
                result.append(word1.charAt(left++));
            }
            else{
                result.append(word1.charAt(left++)).append(word2.charAt(right++));
            }
        }
        return result.toString();
    }
}
