import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.LocalDateTime;
public class format {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String s = dt.format(f);
        System.out.println(s);

    }
}
