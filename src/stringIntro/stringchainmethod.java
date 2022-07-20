package stringIntro;

import java.util.Locale;
import java.util.Scanner;

public class stringchainmethod {
    //create a string containing 3 words;-concat,replace,substring,uppercase,trim.

    // create char and store one of the letters by chaining:
    // lowercase,replace,charAt.
    public static void main(String[] args) {

       // String wishForTheDay=" I Hate String Method ";
       // String space= "  ";
       // String result= wishForTheDay.concat(space).replace("a","*").toUpperCase().trim();

        Scanner scannerInput=new Scanner(System.in);
        System.out.println("Please ask two words");
        String words= scannerInput.nextLine();
        String word1=words.substring(0,words.indexOf(" "));
        String word2=words.substring(words.indexOf(" ")+1);




}
}