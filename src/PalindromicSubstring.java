package src;

public class PalindromicSubstring {
    //Brute force & time complexity :O(N^3)
    public int countSubstrings(String s) {
        int palindromeSubstringCount=s.length();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(isPalindromicSubString(s.substring(i,j+1))){
                    palindromeSubstringCount++;
                }
            }
        }
        return palindromeSubstringCount;
    }
    boolean isPalindromicSubString(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    static void main() {
        PalindromicSubstring obj=new PalindromicSubstring();
        String str="abc";
        System.out.println(obj.countSubstrings(str));
    }
}
