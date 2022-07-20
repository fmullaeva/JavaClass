package Homeworkfromreplit.java;

import java.util.Scanner;

public class loopmultiplication {
    public static void main(String[] args) {
        System.out.println("Please enter an integer number");
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + (i) + "=" + (num * i));


        }
    }}