package Homework;

import java.util.Scanner;

public class reversenumberdowhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number");
        int number= input.nextInt();
        int reversedNumber = 0;
        int multiplication = 1;
      do{
          int remainder=number%10;
          reversedNumber=reversedNumber*10+remainder;
          number/=10;
         // multiplication*=remainder;
      }while(number !=0);
        System.out.println(reversedNumber);
       // System.out.println("Multiplication is " + multiplication);
    }
}
