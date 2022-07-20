package projectDay5;

import java.util.Scanner;

    public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, input the min number: ");
            int num1 = scanner.nextInt();
            System.out.println("Please, input the max number: ");
            int num2 = scanner.nextInt();
            int result = 0;

            for (; num2 > num1; num1++) {
                if (num1 % 2 == 0 && num1 % 7 == 0) {
                    result = result + num1;
                }
            }
            System.out.println(result);

        }
    }


