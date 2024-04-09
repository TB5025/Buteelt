import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(1978, 9, 1);
        LocalDate endDate = LocalDate.of(1981, 6, 1);
        
        LocalDateTime startDateTime = LocalDateTime.of(startDate, LocalTime.MIDNIGHT);
        LocalDateTime endDateTime = LocalDateTime.of(endDate, LocalTime.MIDNIGHT);


        long weeksBetween = ChronoUnit.WEEKS.between(startDate, endDate);
        System.out.println("Number of days between " + startDate + " and " + endDate + " is: " + weeksBetween);
        
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Number of days between " + startDate + " and " + endDate + " is: " + daysBetween);
        
        long Days = daysBetween - weeksBetween;
        System.out.println(Days);
        
        long hoursBetween = ChronoUnit.HOURS.between(startDateTime, endDateTime);
        System.out.println("Number of hours between " + startDateTime + " and " + endDateTime + " is: " + hoursBetween);
        
        long hour = weeksBetween * 46 * 45 / 60;
        System.out.println(hour);
        
        
//
        LocalDate startDate1 = LocalDate.of(1981, 9, 1);
        LocalDate endDate1 = LocalDate.of(1986, 6, 1);
        
        LocalDateTime startDateTime1 = LocalDateTime.of(startDate1, LocalTime.MIDNIGHT);
        LocalDateTime endDateTime1 = LocalDateTime.of(endDate1, LocalTime.MIDNIGHT);


        long weeksBetween1 = ChronoUnit.WEEKS.between(startDate1, endDate1);
        System.out.println("Number of days between " + startDate1 + " and " + endDate1 + " is: " + weeksBetween1);
        
        long daysBetween1 = ChronoUnit.DAYS.between(startDate1, endDate1);
        System.out.println("Number of days between " + startDate1 + " and " + endDate1 + " is: " + daysBetween1);
        
        long Days1 = daysBetween1 - weeksBetween1;
        System.out.println(Days1);
        
        long hoursBetween1 = ChronoUnit.HOURS.between(startDateTime1, endDateTime1);
        System.out.println("Number of hours between " + startDateTime1 + " and " + endDateTime1 + " is: " + hoursBetween1);
        
        long hour1 = weeksBetween1 * 34 *45 /60;
        System.out.println(hour1);
    }
}

