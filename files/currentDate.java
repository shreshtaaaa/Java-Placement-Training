//display current date and time
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentDate {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
