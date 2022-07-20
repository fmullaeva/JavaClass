package Homework;

import java.util.Scanner;

public class reversedowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        int index = word.length() - 1;
        String reversedWord = "";
        index--;
        do {
            reversedWord += word.charAt(word.length() - 1);

            index--;

        } while (index >= 0);
        System.out.println(reversedWord);
    }}