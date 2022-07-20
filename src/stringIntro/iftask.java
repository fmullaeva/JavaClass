package stringIntro;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class iftask {
    public static void main(String[] args) {
        System.out.println("Please type a sentence");
        Scanner input=new Scanner(System.in);
   String sentence= input.nextLine() ;
   System.out.println("Lenght of"+sentence+ "is "+sentence.length());
   System.out.println("Uppercase is "+sentence.toUpperCase().substring(sentence.lastIndexOf(" ")+1));

   //String  word= input.next();
  // System.out.println( ""+ sentence.concat(word));







    }
}
