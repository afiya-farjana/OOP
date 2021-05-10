package FirstPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateAndTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        String s;
        s = df.format(date);
        System.out.println(s);
//        Time
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter neww = DateTimeFormatter.ofPattern("hh:mm:ss");
        s = time.format(neww);
        System.out.println(s);
    }
}
