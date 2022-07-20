package Homeworkeldar;

import java.util.Scanner;

public class task4edition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find sum of digits:");
        int number = input.nextInt();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += number % 10;
            /* sum=(number%10)+sum */
            number /= 10;

        }
        System.out.println("Sum of digits is" + sum);

    }
}