package ArraybyEldar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < number.length; i++) {
            number[i] = str.nextInt();
        }
        System.out.println("Which number remove you will pick?\n" + Arrays.toString(number));
        int expectedNUmber = str.nextInt();
        int matchCount = 0;
        for (int r = 0; r < number.length; r++) {
            if (number[r] == expectedNUmber) {
                matchCount++;
            }}
            int[] newNumber = new int[number.length - matchCount];
            for (int o = 0, u = 0; o < number.length; o++) {
                if (number[o] != expectedNUmber) {
                    newNumber[u++] = number[o];
                }
            }
            System.out.println(Arrays.toString(newNumber));
        }
    }



