package Homeworkfromreplit.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumber {
    public static void main(String[] args) {
        int[] num = new int[]{10,4,3,55,32,145,443,234,98,32};
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter number from Array");
        int number = str.nextInt();
        boolean ArraycontainNUmber = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                num[i] = 0;
                ArraycontainNUmber = true;

            }
        }
        if(ArraycontainNUmber==false) {
            System.out.println("false");
        }else
        {System.out.println(Arrays.toString(num));
    }}}