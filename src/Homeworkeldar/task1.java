package Homeworkeldar;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sentence= input.nextLine();
        System.out.println(("Please enter starting name"));
        int start=input.nextInt();
        System.out.println("Please enter ending name");
        int end=input.nextInt();
       System.out.println(sentence.substring(start-1,end));
    }
}
