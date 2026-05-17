package src;

public class AdjacentDigits {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        boolean isTrue=false;
        for(int i=1;i<s.length();i++){
            int n=Math.abs((s.charAt(i-1)-'0')-(s.charAt(i)-'0'));
            if(n<=2){
                isTrue=true;
            }
            else if(n>2){
                return false;
            }

        }
        return isTrue;
    }

    public static void main(String[] args) {
        String s="123";
        AdjacentDigits obj=new AdjacentDigits();
        System.out.println(obj.isAdjacentDiffAtMostTwo(s));
    }
}
