package stringIntro;

import java.util.Scanner;

public class inclassStringmethod {
    public static void main(String[] args) {

             String word = "techtorial";

            System.out.println("Please enter a word: ");
            Scanner input = new Scanner(System.in);
            String word1 = input.next();
            System.out.println("Length of "+word+" is "+word.length());
            System.out.println("First letter of "+word+" is "+word.charAt(0));
            System.out.println("Last letter of "+word+" is "+word.charAt(word.length()-1));
            System.out.println("Middle letter of "+word+" is "+word.charAt(word.length()/2)); //10/2=5
            System.out.println("Please enter index: ");
            int index = input.nextInt();
            System.out.println("Char at index "+index+" is "+word.charAt(index));
            System.out.println("Please enter the char: ");
            String letter=input.next();
            System.out.println("Index of letter "+letter+" is "+word.indexOf(letter));
            System.out.println("Please enter second word to concatenate: ");
            input.nextLine();//   \n
            String word2= input.nextLine();
            String concatWords=word.concat(word2);
            System.out.println(concatWords);


    }
}
