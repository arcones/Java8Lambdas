package sw.arcones.unit2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise2 {

    private static final ThreadLocal<DateFormat> dateFormatThreadSafe = ThreadLocal.withInitial(()-> new SimpleDateFormat("dd-MMM-yyyy"));

    public static void main(String[] args) {
        System.out.println(dateFormatThreadSafe.get().format(new Date(0)));
        System.out.println(dateFormatThreadSafe.get().format(new Date()));

        Date myBirthday = new Date();
        myBirthday.setDate(24);
        myBirthday.setMonth(9);
        myBirthday.setYear(89);

        System.out.println(dateFormatThreadSafe.get().format(myBirthday));
    }
}