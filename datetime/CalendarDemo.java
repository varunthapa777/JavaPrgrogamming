package datetime;

import java.util.*;
public class CalendarDemo {
    
    public static void main(String[] args) {
        
        GregorianCalendar gc = new GregorianCalendar();

        // System.out.println(gc.isLeapYear(2004));
        // System.out.println(gc.getTime());
        System.out.println(gc.get(Calendar.DATE));

        TimeZone tz = gc.getTimeZone();

        System.out.println(tz.getID());
    }
}
