package src;

public class MaximumRepeatingNumber {
    private int getMaximumRepeatingNumber(int [] arr){
        int candidate=0;
        int count=0;
        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        MaximumRepeatingNumber obj =new MaximumRepeatingNumber();
        int [] arr={1,2,2,3,3,3,4,4};
        System.out.println(obj.getMaximumRepeatingNumber(arr));
    }
}
