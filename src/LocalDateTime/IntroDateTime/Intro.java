package LocalDateTime.IntroDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Intro {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();// its not possible create object (for ex:new key word because it by default private)
        System.out.println(time);
        LocalDate date = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(changeFormat(localDateTime));
        //LocalDate().of(year,month(),date)
        //localDate.of(yyyy,Month.month.date)


    LocalDate localDate=LocalDate.of(1991,8,1);
        System.out.println(localDate);

        LocalDate localDate1=localDate.of(1991, Month.DECEMBER,01);
        System.out.println(localDate1);
    }
    public static String changeFormat(LocalDateTime localDateTime){
       return localDateTime.toString().replace("T"," ");
    }
}
