package Homework;

import java.util.Scanner;

public class LeapYearTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year");
        double year = scanner.nextDouble();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + "If a year is leap");
            }
        } else { System.out.println(year+ "If a year is not leap");}


    }
}
