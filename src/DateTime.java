import java.time.LocalDate; // import the LocalDate class

public class DateTime {
    public static void main(String[] args) {

        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date
    }
}



//    LocalDate	          Represents a date (year, month, day (yyyy-MM-dd))
//    LocalTime	          Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//    LocalDateTime	      Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//    DateTimeFormatter	  Formatter for displaying and parsing date-time objects