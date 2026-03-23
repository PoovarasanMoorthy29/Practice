package TwoPointer.src.Math;

public class CalculateMoneyInLeetcodeBank {
    static void main() {
        CalculateMoneyInLeetcodeBank obj=new CalculateMoneyInLeetcodeBank();
        int n=10;
        System.out.println(obj.getTotalAmount(n));
    }
    private int getTotalAmount(int n){
        int total=0;
        int monday=1;
        for(int day=1;day<=n;day++){
            total+=monday+(day-1)%7;
            if(day%7==0){
                monday++;
            }
        }
        return total;
    }
}
