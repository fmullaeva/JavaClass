package Homework;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String name = input.next();
        String reversed = "";
        for (int i = name.length() - 1; i > 0; i--) {
            reversed += name.charAt(i);
        }
        if (name.equalsIgnoreCase(reversed)) ;
        System.out.println("word is palindrome");
        {
            System.out.println("is not palindrome");
        }
    }
}