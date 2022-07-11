package DateandCalendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class CalendarEx1 {

    public void Execute() {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        System.out.println(today.getDayOfMonth());
        System.out.println(today.toString() + ", " + now.toString());
    }

}
