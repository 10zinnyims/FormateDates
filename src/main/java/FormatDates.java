import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDates {

    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date in "MM/dd/yyyy" format
        String formattedDate1 = now.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(formattedDate1);

        // Format the date in "yyyy-MM-dd" format
        String formattedDate2 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(formattedDate2);

        // Format the date in "MMMM d, yyyy" format
        String formattedDate3 = now.format(DateTimeFormatter.ofPattern("MMMM dd yyy"));
        System.out.println(formattedDate3);

        // Format the date and time in "EEEE, MMM d, yyyy HH:mm" format in GMT time zone
        String formattedDate4 = ZonedDateTime.of(now, ZoneId.of("GMT"))
                .format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm", Locale.US));
        System.out.println(formattedDate4);

        //challenge
        System.out.println("Challenge");
        String formattedDate5 = now.format(DateTimeFormatter.ofPattern("h:mm a 'on' dd-MMM-yyyy"));
        System.out.println(formattedDate5);
    }
}
