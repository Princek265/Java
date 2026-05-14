import java.util.Scanner;
import java.time.LocalTime;
public class local_time {
    public static void main(String[] args) {
        // User input time

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter time (HH-mm): ");
        // String s = sc.nextLine();
        // LocalTime t = LocalTime.parse(s);
        // System.out.println("Time: "+t);

        // current Time
        LocalTime t = LocalTime.now();
        System.out.println(t);
        
        // Set time
        LocalTime set = LocalTime.of(4,5,33);
        System.out.println(set);

        System.out.println(t.minusMinutes(15));
        System.out.println(t.plusMinutes(15));
        System.out.println(t.plusHours(2));
        System.out.println(t.minusHours(2));
    }
}
