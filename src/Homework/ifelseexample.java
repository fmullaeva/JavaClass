package Homework;

import java.util.Scanner;

public class ifelseexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input  a word");
        String word = input.next();
        char firstLetter = word.charAt(0);
        if (firstLetter >= 65 && firstLetter <= 90) {
            System.out.println(firstLetter + "is capital");
        }else{
            System.out.println(firstLetter + "is not capital");
            char lastLetter=word.charAt(word.length()-1);
            if (lastLetter>=33 && lastLetter<=64){
                System.out.println(lastLetter+ "is special character");}
                else{
                    System.out.println(lastLetter + "is  not special character");
            }
        }
    }
}