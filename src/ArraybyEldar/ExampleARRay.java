package ArraybyEldar;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExampleARRay {
    public static void main(String[] args) {
        String[] emails = new String[5];
        for (int i = 0; i < emails.length; i++) {
            Scanner str = new Scanner(System.in);
            System.out.println("firstname?");
            String firstname = str.nextLine().toLowerCase();
            System.out.println("lastname");
            String lastname = str.nextLine().toLowerCase();
            emails[i] = lastname.charAt(0) + "." + firstname.concat("@techtorial.com");
        }
        Arrays.sort(emails);
        for (String email: emails) {
            System.out.println(email);

        }
    }
}