package src;

public class ReverseStringIII {
    public String reverseWords(String s) {
        String []ch=s.split("\\s");
        for(int i=0;i<ch.length;i++){
            ch[i]=reverseStr(ch[i]);
        }
        return String.join(" ",ch);

    }

    public static String reverseStr(String str){
        char []ch=str.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char c= ch[left];
            ch[left]=ch[right];
            ch[right]=c;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }

    static void main() {
        String str="Let's code using java";
        ReverseStringIII obj=new ReverseStringIII();
        System.out.println(obj.reverseWords(str));
    }
}
