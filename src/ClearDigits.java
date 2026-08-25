package src;
import java.util.Stack;
public class ClearDigits {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(Character.isDigit(s.charAt(i))){
                for(int j=1;j==1;j++){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                i++;
            }
            else{
                stack.push(s.charAt(i));
                i++;
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:stack){
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="cb34";
        ClearDigits obj=new ClearDigits();
        System.out.println(obj.clearDigits(str));
    }
}
