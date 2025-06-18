import java.time.LocalDate;
import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.isLeapYear());

        LocalTime t =LocalTime.now();
        System.out.println(t);
        System.out.println(t.getHour());
    }
}
