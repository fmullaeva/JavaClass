package stringIntro;

import java.util.Scanner;

public class Oddnumber {
    public static void main(String[] args){

    Scanner input= new Scanner(System.in);
    System.out.println( "Please enter any number");
    int number=input.nextInt();
    if (number%2==0){
        System.out.print(number+" Is even ");}
    if (number%2==1) {
        System.out.print(number + " Is odd ");
    }

    }
   }
