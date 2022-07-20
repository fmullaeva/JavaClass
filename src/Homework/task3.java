package Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName=scanner.nextLine();
        System.out.println("What is your last name?");
        String lastName=scanner.nextLine();
        System.out.println( "What is your address?");
        String adress=scanner.nextLine();
        System.out.println("What is your age?");
        int ageInput = scanner.nextInt();
        System.out.println("What is the temperature in farenheit?");
        int temperature = scanner.nextInt();
        // double fahrenheit = scanner.nextDouble();
        // System.out.println("What is the temperature in celcium?");
        double celcius = ((temperature - 32)*5)/9;
        System.out.println("In celcius is "+ celcius);




    }
}
