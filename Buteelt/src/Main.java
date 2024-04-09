
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        int ehleh_on = 1978;
        int duusah_on = 1979;
        int butarhai_honog;
        

        DayOfWeek dayOfWeek;
        Hashtable<DayOfWeek, Integer>
        day_of_the_week = new Hashtable<DayOfWeek, Integer>();
        
        day_of_the_week.put(DayOfWeek.MONDAY, 1);
        day_of_the_week.put(DayOfWeek.TUESDAY, 2);
        day_of_the_week.put(DayOfWeek.WEDNESDAY, 3);
        day_of_the_week.put(DayOfWeek.THURSDAY, 4);
        day_of_the_week.put(DayOfWeek.FRIDAY, 5);
        day_of_the_week.put(DayOfWeek.SATURDAY, 6);
        day_of_the_week.put(DayOfWeek.SUNDAY, 7);


        
        LocalDate[] case2_ehleh_hugatsaa = new LocalDate[16];
        LocalDate[] case2_duusah_hugatsaa = new LocalDate[16];
        long[] case2_dund_sur = new long[12]; 
        long[] case2_ih_sur = new long[4]; 
        int[] buten_doloo_honog = new int[16];
        int[] hicheelleh_honog = new int[16];

        
 
        // Input the values
        

        // Initialize start and end dates for each academic term
        for (int i = 0; i < 16; i++) {
            case2_ehleh_hugatsaa[i] = LocalDate.of(ehleh_on, 9, 1);
            case2_duusah_hugatsaa[i] = LocalDate.of(duusah_on, 6, 1);
            ehleh_on++;
            duusah_on++;
        }

        // Calculate the duration of each academic term
        for (int i = 0; i < 12; i++) {
            case2_dund_sur[i] = ChronoUnit.DAYS.between(case2_ehleh_hugatsaa[i], case2_duusah_hugatsaa[i]);
        }
        for (int i = 0; i < 4; i++) {
            case2_ih_sur[i] = ChronoUnit.DAYS.between(case2_ehleh_hugatsaa[i+12], case2_duusah_hugatsaa[i+12]);
        }

        // Output the duration of each academic term
        // for (int i = 0; i < 12; i++) {
        //     System.out.println("Angi " + (i+1) + " duration: " +case2_dund_sur[i]);
        // }
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Kurs " + (i+1) + " duration: " +case2_dund_sur[i]);
        // }
        
        for (int i = 0; i < 12; i++) {
            dayOfWeek = case2_ehleh_hugatsaa[i].getDayOfWeek();

            butarhai_honog = 6-day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)>=6){
                butarhai_honog =0;
            }
            dayOfWeek = case2_duusah_hugatsaa[i].getDayOfWeek();
            butarhai_honog = butarhai_honog + 6 -day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)==7){
                butarhai_honog++;
            }
           buten_doloo_honog[i] = (int) (case2_dund_sur[i]-butarhai_honog)/7;
           hicheelleh_honog[i]=(buten_doloo_honog[i]*7)-(buten_doloo_honog[i]*2)+butarhai_honog;
           butarhai_honog =0;
 
        }
        for (int i = 0; i < 4; i++) {
            dayOfWeek = case2_ehleh_hugatsaa[i+12].getDayOfWeek();

            butarhai_honog = 6-day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)>=6){
                butarhai_honog =0;
            }
            dayOfWeek = case2_duusah_hugatsaa[i+12].getDayOfWeek();
            butarhai_honog = butarhai_honog + 6 -day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)==7){
                butarhai_honog++;
            }
           buten_doloo_honog[i+12] = (int) (case2_ih_sur[i]-butarhai_honog)/7;

           hicheelleh_honog[i+12]=(buten_doloo_honog[i+12]*7)-(buten_doloo_honog[i+12]*2)+butarhai_honog;

           butarhai_honog =0;
        }
        System.out.println("============================");
        for (int i = 0; i < 16; i++) {
            if(i<12){
            System.out.println("Анги " + (i+1) + " \nДолоо хоног: " +buten_doloo_honog[i]+ " \nСурсан өдөр:"+ hicheelleh_honog[i]);
            }else{
                System.out.println("Курс " + (i-11) + " \nДолоо хоног: " +buten_doloo_honog[i]+ " \nНийт өдөр:"+ hicheelleh_honog[i]);
            }
            System.out.println("============================");
        }
        long niit_honog=0;
        long niit_hugatsaa;
        long sonirholtoi_tsag=0;
        System.out.println("Дунд сургуулийн цаг");
        for(int i = 0; i<5; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
            sonirholtoi_tsag =sonirholtoi_tsag + buten_doloo_honog[i]*2;
            
        }
        niit_hugatsaa = niit_honog*120;
        
        niit_honog=0;
        for(int i = 5; i<12; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
            sonirholtoi_tsag =sonirholtoi_tsag + buten_doloo_honog[i]*140;
        }
        niit_hugatsaa = niit_hugatsaa + niit_honog*210;
        System.out.println(niit_hugatsaa/60);

        niit_honog=0;
        niit_hugatsaa=0;



        System.out.println("Их сургуулийн цаг");
        for(int i = 12; i<16; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
        }
        niit_hugatsaa = niit_honog*270;
        System.out.println(niit_hugatsaa/60);
        System.out.println("Сонирхолтой цаг");
        System.out.println(sonirholtoi_tsag/60);
        System.out.println("Нийт хоног: "+niit_honog);
        System.out.println("Эзлэх хувь: "+(double)40/niit_honog);

        // niit_honog=0;
        // niit_hugatsaa=0;

        // System.out.println("Дунд сургуулийн цаг");
        // for(int i = 0; i<5; i++){
        //     System.err.println(i+1 + "Ангид: " + buten_doloo_honog[i]*2 + " цаг");
        // }

        // for(int i = 5; i<12; i++){
        //     niit_honog =niit_honog + hicheelleh_honog[i];
        // }
        // niit_hugatsaa = niit_hugatsaa + niit_honog*210;
        // System.out.println(niit_hugatsaa/60);

        // niit_honog=0;
        // niit_hugatsaa=0;



    }
}
