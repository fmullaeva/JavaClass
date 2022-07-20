package Homework;

import java.util.Scanner;

public class starttree {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        int b=0;
        String str="";
        while(num>0){
            str=str+"*";
            System.out.println(str);
            num--;

        }
    }
}
