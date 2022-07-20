package Homeworkfromreplit.java;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = s.next();
        System.out.println("Enter string 2");
        String str2 = s.next();
        if (str1.length() == str2.length()) {
            System.out.println(str2.concat(str1));}
        if (str1.length()>str2.length()) {
            System.out.println((str1.substring(0,str2.length()).concat(str2)));}
            else if (str1.length() < str2.length()){
            System.out.println( str1.concat(str2.substring(0,str1.length())) );

        }
    }
}