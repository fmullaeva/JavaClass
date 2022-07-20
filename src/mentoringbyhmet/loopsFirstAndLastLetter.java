package mentoringbyhmet;

import java.util.Scanner;

//1.print first letter of each word
  //2.print last letter of each word index number
//3.
public class loopsFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please provide 3 words");// Java String test
        String words=scan.nextLine();
        String firstLetter="";
        String lastLetter="";
        String firstLetterIndex="";
        String lastletterIndex="";
        int firstLetterSum=0;
        int lastLetterSum=0;
        firstLetter+=words.charAt(0);
        firstLetterIndex+=words.indexOf(words.charAt(0))+" ";
        System.out.println(firstLetter);//J
        for(int i=0 ;i<words.length();i++){
            if(words.charAt(i)==' '){
                firstLetter+=words.charAt(i+1);
                lastLetter+=words.charAt(i-1);
                firstLetterIndex+=(i+1)+" ";
                lastletterIndex+=(i-1)+ " ";
                firstLetterSum+=(i+1);
                lastLetterSum+=(i-1);
            }
        }
        lastLetter+=words.charAt(words.length()-1);
        lastletterIndex+=words.length()-1;
        lastLetterSum+=words.length()-1;
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        System.out.println(firstLetterIndex);
        System.out.println(lastletterIndex);
        System.out.println(firstLetterSum);
        System.out.println(lastLetterSum);
    }
}
