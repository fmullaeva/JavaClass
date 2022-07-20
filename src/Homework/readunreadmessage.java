package Homework;

import java.util.Scanner;

public class readunreadmessage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter amount unread ");
        int unread= input.nextInt();
        System.out.println("Please enter amount of read messages");
        int read= input.nextInt();
        do {
            --unread;
            ++read;
            System.out.println("reading message");
            System.out.println(unread + " unread messages");
            System.out.println(read + " read messages");
        }while (unread>0);


        }
    }

