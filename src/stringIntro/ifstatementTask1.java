package stringIntro;

import java.util.Scanner;

public class ifstatementTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please type input number");
        double number = input.nextDouble();
        if (number < 0) {
            System.out.println(number + "is negative number");
        }
        if (number > 0) {
            System.out.println(number + "is positive number");
        }
    }
}


