package Homework;

import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        int exam1=70;
        int exam2=80;
        int exam3=90;

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your score for exam");
        int exam= input.nextInt();
        System.out.println("Please enter your score for exam1");
        int exam4=input.nextInt();
        System.out.println("Please enter your score for exam2");
        int exam5=input.nextInt();
        int average=(exam1+exam2+exam3)/3;
        if (average>=70){
           System.out.println("you have passed the class.Your score is"); }
               else{
                    System.out.println("you have failed the class.Your score is"); }
                }
            }



