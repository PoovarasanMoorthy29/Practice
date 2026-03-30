package TwoPointers;

public class FirstPalindrome {
    public String firstPalindrome(String[] words) {
        for(int index=0;index<words.length;index++){
            if(isPalindrome(words[index])){
                return words[index];
            }
        }
        return "";


    }
    //helper method
    private boolean isPalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        FirstPalindrome obj=new FirstPalindrome();
        String[] arr={"abc","aba","grd"};
        System.out.println(obj.firstPalindrome(arr));
    }
}
