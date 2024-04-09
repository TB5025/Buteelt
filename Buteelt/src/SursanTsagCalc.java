
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SursanTsagCalc {
//
    // Constants for session durations
    private static final int BagaSurguuli_1Tsag_Case1 = 45; // minutes
    private static final int DundSurguuli_1Tsag_Case1 = 45; // minutes
    private static final int Dund2Surguuli_1Tsag_Case1 = 45; // minutes
    
    private static final int DundSurguuli_1Tsag_Case2 = 30; // minutes
    private static final int Dund2Surguuli_1Tsag_Case2 = 35; // minutes
    
    private static final int DeedSurguuli_1Tsag = 90; // minutes

    // Constants for school system durations
    private static final int[] SurguuliinHicheelOrohTsag_Case1 = {3, 5, 2, 5}; // Junior High, Middle School, High School, University
    private static final int[] SurguuliinHicheelOrohTsag_Case2 = {0, 5, 7, 4}; // Junior High, Middle School, High School, University

    // Constants for days and sessions per week
    private static final int DoloonHonogtAjillahTsag_Case1 = 6;
    private static final int DoloonHonogtAjillahTsag_Case2 = 5;

    private static final int BagaSurguuliOrohTsag_Case1 = 4;
    private static final int DundSurguuliOrohTsagWeekly_Case1 = 4;
    private static final int Dund2SurguuliOrohTsag_Case1 = 6;

    private static final int DundSurguuliOrohTsag_Case2 = 4;
    private static final int Dund2SurguuliOrohTsag_Case2 = 6;

    private static final int DeedSurguuliOrohTsag = 3;

    public static void main(String[] args) {
        // Dates for the two scenarios
        LocalDate startDate_Case1 = LocalDate.of(1978, 9, 1);
        LocalDate endDate_Case1 = LocalDate.of(1993, 9, 1);
        LocalDate startDate_Case2 = LocalDate.of(2006, 9, 1);
        LocalDate endDate_Case2 = LocalDate.of(2022, 9, 1);
        
        
    }
}