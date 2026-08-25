import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DifferenceDaysBetweenDays {
    private int calculateDays(String str1,String str2){
        LocalDate d1=LocalDate.parse(str1);
        LocalDate d2=LocalDate.parse(str2);
        return (int)Math.abs(ChronoUnit.DAYS.between(d1,d2));
    }
    public static void main (String [] args){
        String str1="2019-06-20";
        String str2="2019-06-19";
        DifferenceDaysBetweenDays obj=new DifferenceDaysBetweenDays();
        System.out.println(obj.calculateDays(str1,str2));
    }
}
