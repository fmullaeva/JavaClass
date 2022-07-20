package Homework;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("What is your first name ?");
        String firstName=scan.next();
        System.out.println("What is your last name ?");
        String lastName=scan.next();
        System.out.println(firstName.substring(0,3));
        System.out.println(lastName.substring(lastName.length()-3));




    }
}
