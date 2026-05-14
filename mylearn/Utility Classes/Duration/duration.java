import java.time.Duration;
import java.time.LocalTime;
public class duration {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(2,30);
        LocalTime t2 = LocalTime.of(14,30);
        Duration d = Duration.between(t1, t2);
        System.out.println(d.toHours()); // 12
        System.out.println(d.toMinutes()); // 720
        System.out.println(d.toSeconds()); // 43200

    }
}
