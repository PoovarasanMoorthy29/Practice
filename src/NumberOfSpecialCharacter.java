package src;

public class NumberOfSpecialCharacter {
    public static void main(String[] args) {
        String str="aBaAbcdC";
        NumberOfSpecialCharacter obj =new NumberOfSpecialCharacter();
        System.out.println(obj.numberOfCharacters(str));
    }
    public int numberOfCharacters(String str){
        int[] freq=new int[128];
        int count=0;
        for(int index=0;index<str.length();index++){
            freq[str.charAt(index)]++;
        }
        for(int index=65;index<=90;index++){
            if(freq[index] >0 && freq[index+('a'-'A')]>0){
                count++;
            }
        }
        return count;
    }
}
