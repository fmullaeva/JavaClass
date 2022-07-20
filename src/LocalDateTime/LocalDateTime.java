package LocalDateTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
   //it has private constructor that why we dont have to create object
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(java.time.LocalDateTime.now());
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("_____");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println(localDate.minusYears(2));
            }
        }
        System.out.println("________of()____");
        LocalDate localDate1 = LocalDate.of(2023, Month.DECEMBER, 23);
        //  System.out.println("using int:"+localDate1);
        System.out.println("_____LocalTime.of()_____");
        System.out.println(LocalTime.of(2, 35));
        System.out.println(LocalTime.of(2, 45, 15));
        System.out.println(LocalTime.of(2, 45, 15, 35264));
        LocalDate localdatex = LocalDate.of(2013, Month.APRIL, 28);
        try {
            System.out.println(java.time.LocalDateTime.of(1995, 13, 26, 23, 59));

        } catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("_____plus____");
        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate2);
        localDate2 = localDate2.plusDays(100);
        System.out.println(localDate2);
        System.out.println(localDate2.plusMonths(2));
        System.out.println(localDate2.plusYears(2));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.plusHours(1);
        System.out.println(time);
        System.out.println(time.plusMinutes(45));
        System.out.println(time.plusSeconds(55));

    //   LocalDateTime localDateTime = LocalDateTime.now();
      //  localDateTime=localDateTime.plusYears(2).plusMonth(2).plusHours(2).plusSeconds(50).plusNanos(1000);
      //  System.out.println(localDateTime);


        System.out.println("______minus____");
      //  LocalDateTime localDateTime1=LocalDateTime.of(2021,12,31,59);
      //  System.out.println(localDateTime1.minusYears(1).minusMonth(11).mimusDays(30).minusMinutes(58));
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy:mm:ss");
        System.out.println(localDate1);
    }

    }

