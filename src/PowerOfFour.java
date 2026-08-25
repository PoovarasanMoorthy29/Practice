public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        return (n & (n-1))==0 && n%3 ==1;
    }
    public static void main(String[] a){
        int n=16;
        PowerOfFour obj=new PowerOfFour();
        System.out.println(obj.isPowerOfFour(n));
    }
}
