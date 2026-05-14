import java.util.Scanner;
import java.time.LocalDate;
class Local_date{
    public static void main(String[] args) {
        // Custom Date Entry By User-Input
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter date (yyyy-mm-dd): ");
        // String s = sc.nextLine();
        // LocalDate d = LocalDate.parse(s);
        // System.out.println(d);

        // Present Date - current date of the system clock
        // LocalDate current = LocalDate.now();
        // System.out.println("Current Date: "+current);

        // Custom Date Set in Code

        LocalDate fake = LocalDate.of(2032,11,29);
        System.out.println("Custom Date set in the code: "+ fake);

        System.out.println(fake.getYear()); // 2032
        System.out.println(fake.getMonth()); // NOVEMBER
        System.out.println(fake.getMonthValue()); // 11
        System.out.println(fake.getDayOfMonth()); // 29
        System.out.println(fake.getDayOfWeek()); // MONDAY

        System.out.println(d.plusDays(5));
        System.out.println(d.minusDays(5));

        System.out.println(d.plusMonths(2));
        System.out.println(d.minusMonths(2));

        System.out.println(d.plusYears(1));
        System.out.println(d.minusYears(1));

        /*Important Point

        LocalDate is immutable.
        Meaning:
        d.plusDays(5);
        does NOT change original object.
        
        Need to write:
        d = d.plusDays(5);
        */
    }
}