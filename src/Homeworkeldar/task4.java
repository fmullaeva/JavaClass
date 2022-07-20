package Homeworkeldar;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner change = new Scanner(System.in);
        System.out.println("Please enter dollar amount");
        double amount = change.nextDouble();
        int rem = (int) (amount * 100);
        int numQuarters = rem / 25;
        rem = rem % 25;
        int numNic = rem / 5;
        rem = rem % 5;
        int numDim = rem / 10;
        rem = rem % 10;
        int numPen = rem;
        System.out.println(numQuarters);
        System.out.println(numNic);
        System.out.println(numDim);
        System.out.println(numPen);
    }
}