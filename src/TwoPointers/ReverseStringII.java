package TwoPointers;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        if(s.length() <2){
            return s;
        }
        char []ch=s.toCharArray();
        for(int index=0;index<ch.length;index+=(k*2)){

            int left=index;
            int right=Math.min(index+k-1,ch.length-1);

            while(left<right){
                char c=ch[left];
                ch[left++]=ch[right];
                ch[right--]=c;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        ReverseStringII obj=new ReverseStringII();
        System.out.println(obj.reverseStr(s,k));
    }
}
