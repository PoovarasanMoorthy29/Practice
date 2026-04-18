public class PerfectNumber {
    private static boolean isPerfect(int num){
        int sum=0;
        for(int index=1;index<=num/2;index++){
            if(num%index==0){
                sum+=index;
            }
        }
        return (sum==num)? true:false;
    }
    public static void main(String[] args){
        int num=28;
        System.out.println(isPerfect(num));
    }
}
