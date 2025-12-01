import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExercises {
    public static String getTimeBetween(LocalDateTime start, LocalDateTime end){
        if (start.isAfter(end)){
            return "Invalid Interval";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedStart = formatter.format(start);
        String formattedEnd = formatter.format(end);

        long days = ChronoUnit.DAYS.between(start, end);
        Duration duration = Duration.between(start, end);
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();

        return "Start: " + formattedStart +
                "\nEnd: " + formattedEnd +
                "\nDifference: " + days + " days " + hours + " hours " + minutes + " minutes";
    }
}
