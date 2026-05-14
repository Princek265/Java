import java.util.Scanner;
import java.time.LocalDateTime;

class local_date_time{
    public static void main(String[] args) {
        // Custom DateTime from user input


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter time (yyyy-mm-ddTHH:MM): ");
        // String s = sc.nextLine();
        // LocalDateTime dt = LocalDateTime.parse(s);
        // System.out.println("custom LocatDateTime: "+dt);

        // Current DateTime
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        // Custom set time

        LocalDateTime set = LocalDateTime.of(2024,12,31,21,55,4,5454); // yyyy,MM,dd,HH,mm,ss,ms
        System.out.println(set);
    }
}