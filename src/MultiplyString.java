import java.math.BigInteger;

public class MultiplyString {
    public String getResult(String num1,String num2){
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        n1=n1.multiply(n2);
        return String.valueOf(n1);
    }

    public static void main(String[] args) {
        String num1="2";
        String num2="6";
        MultiplyString obj=new MultiplyString();
        System.out.println(obj.getResult(num1,num2));
    }
}
