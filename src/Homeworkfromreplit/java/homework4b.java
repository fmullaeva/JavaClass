package Homeworkfromreplit.java;

import java.util.Scanner;

public class homework4b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        String stateCode = s.next();
        String city = s.next();
        String gender = s.next();
        int age = s.nextInt();
        // Please don't change anything on lines above.

        if ((age > 18) && (city.length() < 10))
            if ((fullName.startsWith("A") && fullName.startsWith("V") && stateCode.startsWith("I")
                    && stateCode.endsWith("L") && gender == "F")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
    }
}
