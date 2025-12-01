import java.time.Duration;
import java.time.LocalTime;

public class TimeExercises {
    public static String timeCalculator(LocalTime start, LocalTime end){
        if(end.isBefore(start)){
            return "End time cannot be before start time";
        }

        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();

        return "Total Time: " + hours + " Hours" + " and "+ minutes + " Minutes";
    }

}
