public class ReverseLetter {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();

        int left=0;
        int right=ch.length-1;
        while(left<right){
            if(Character.isAlphabetic(ch[left])&& Character.isAlphabetic(ch[right])){
                char c=ch[left];
                ch[left++]=ch[right];
                ch[right--]=c;
            }
            else if(Character.isAlphabetic(ch[left])){
                right--;
            }
            else{
                left++;
            }
        }

        return String.valueOf(ch);

    }

    public static void main(String[] args) {
        ReverseLetter obj=new ReverseLetter();
        String str="ab-cd";
        System.out.println(obj.reverseOnlyLetters(str));
    }
}
