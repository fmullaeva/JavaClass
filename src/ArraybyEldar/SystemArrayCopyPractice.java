package ArraybyEldar;

import java.util.Arrays;
import java.util.Scanner;

public class SystemArrayCopyPractice {
    public static void main(String[] args) {
        int[] source = {12, 3, 4, 5, 6, 6, 5, 6, 7};
        int[] destination = new int[source.length / 2];
        System.arraycopy(source, 0, destination, 0, source.length);
        System.out.println(Arrays.toString(destination));
        /*

        create an array and store users input of numbers into it(20)
        copy numbers from users input starting from input 5 till 15
         */
            int[] destination1 = new int[10];
            int[] source1 = new int[20];
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter 20 numbers");
            for (int i =0; i< source.length; i++)
              source1[i] = sc.nextInt();
            System.arraycopy(source1, 5, destination1, 0, 10);
            System.out.println(Arrays.toString(destination1));

        }
    }
