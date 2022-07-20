package Homework;

import java.util.Scanner;

public class switchtask {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please input name of month:");
        String nameOfmonth= name.next();
        int totalDays=0;
        switch (nameOfmonth){

            case"December":
                totalDays+=31;
            case"November":
                totalDays+=30;

        }



    }
}
