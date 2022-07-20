package Homework;

import java.util.Scanner;

public class examplewhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter  first number");
        int num1= input.nextInt();
        System.out.println("Please enter 2 number");
        int multiplication=0;
        int num2=input.nextInt();
        while (num1<=num2) {
            multiplication = multiplication * num1++;
        }

            System.out.println("multiplication of"+num1 +"and"+num2+"is"+multiplication);
        }

    }

