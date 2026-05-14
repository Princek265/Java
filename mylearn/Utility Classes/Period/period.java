import java.time.LocalDate;
import java.time.Period;
public class period {
    public static void main(String[] args) {
        // Period is basically gap/difference between 2 dates
        LocalDate d1 = LocalDate.of(2005,8,26);
        LocalDate d2 = LocalDate.now();
    
        Period p = Period.between(d1,d2);
    
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
    }
}
