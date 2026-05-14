import java.util.Scanner;
import java.time.*;
public class compare {
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.of(2005,8,26);
        LocalDate d2 = LocalDate.ṇof(2026,5,14);
    
        System.out.println(d1.isBefore(d2)); // true
        System.out.println(d1.isAfter(d2)); // false
        System.out.println(d1.equals(d2)); // false
    }
}
