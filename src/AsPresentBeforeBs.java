package src;

public class AsPresentBeforeBs {
    public boolean checkString(String s) {

        boolean bSeen=false;
        for(char ch: s.toCharArray()){
            if(ch=='a' && bSeen){
                return false;
            }
            else if(ch=='b' ){
                bSeen=true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aaababb";
        AsPresentBeforeBs obj=new AsPresentBeforeBs();
        System.out.println(obj.checkString(s));

    }
}
