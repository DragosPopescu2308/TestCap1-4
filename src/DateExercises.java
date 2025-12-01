import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateExercises {
    public static void howMuchTime(LocalDate past){
        if (past.isAfter(LocalDate.now())){
            System.out.println("This date is in the future");
            return;
        }

        LocalDate now = LocalDate.now();

        Period period = Period.between(past, now);
        long days = ChronoUnit.DAYS.between(past, now);

        System.out.printf("Current date is: " + now);
        System.out.printf("\nPeriod is: " + " \n "+
                " Days: " + period.getDays()+"\n "+
                " Moths: " + period.getMonths()+" \n "+
                " Years: " + period.getYears());
        System.out.printf("\nDays between past date and current date: " + days);
    }

    public String howMuchTime2(LocalDate past){
        if (past.isAfter(LocalDate.now())){
            return "This date is in the future";
        }
        LocalDate now = LocalDate.now();
        Period period = Period.between(past, now);
        long days = ChronoUnit.DAYS.between(past, now);

        return "Since date is: \n" +
                period.getYears()+ " Years\n"
                + period.getMonths()+ " Months\n"
                + period.getDays()+ " Days"+
                "\nTotal days: " + days;

    }

}
