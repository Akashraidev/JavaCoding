import java.time.LocalDateTime; //  Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // // Import the DateTimeFormatter class
public class FormattingDateAndTime {
    public static void main(String[] args) {
        // Before Formatting
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        // After formatting:
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}

//    LocalDate	          Represents a date (year, month, day (yyyy-MM-dd))
//    LocalTime	          Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//    LocalDateTime	      Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//    DateTimeFormatter	  Formatter for displaying and parsing date-time objects
