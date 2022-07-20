package Homework;

import java.util.Scanner;

public class powerofNumberdowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base number");
        int base = input.nextInt();
        System.out.println("Please enter power number");
        int power = input.nextInt();
        int answer = 1;
        final int num=power;
        while (power > 0) {
             answer*= base;
             power--;
        }
        System.out.println(base + " to the power of " +num + " is " + answer);
    }
    }


