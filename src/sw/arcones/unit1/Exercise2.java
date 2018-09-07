package sw.arcones.unit1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) {
        ThreadLocal<DateFormat> dateFormatThreadSafe = new ThreadLocal<>();
        dateFormatThreadSafe.set(new SimpleDateFormat("dd-MMM-yyyy"));

        System.out.println(dateFormatThreadSafe.get().format(new Date()));
    }
}