package projectDay5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number");
        System.out.println("number?");
        int number =s.nextInt();
        if(number==2 || number==3 || number==5 ||number==7) {
            System.out.println("Is prime");
        }else if (number%2==0 || number%3==0 || number%5==0 || number%7==0 ) {
            System.out.println("NOT");
        } else {
            System.out.println("YES");
        }


    }
}