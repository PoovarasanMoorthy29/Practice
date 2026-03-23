package TwoPointer.src.Math;

public class FibonacciSeries {
    int getFiboSum(int num){
        //optimized solution Time Complexity : O(N).

        if(num<=1){
            return num;

        }
        int prev1=0;
        int prev2=1;
        for(int i=2;i<=num;i++){
            int curSum=prev1+prev2;
            prev1=prev2;
            prev2=curSum;
        }
        return prev2;
    }
    static void main() {
        FibonacciSeries obj=new FibonacciSeries();
        int n=5;
        System.out.println(obj.getFiboSum(n));
    }
}
