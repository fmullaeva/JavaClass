package Homework;

import java.util.Scanner;

public class ternaryOperator {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num= scan.nextInt();
         if (num%3==0) {
             if (num % 5 == 0) {
                 System.out.println("FizzBuzz");
             } else
                 System.out.println("Buzz");
         }else
             System.out.println( num + "is not multiplier of 3 or 5");

    }
}
