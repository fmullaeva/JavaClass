package Homeworkeldar;

import java.util.Locale;

public class task2 {
    public static void main(String[] args) {
        String string1 = "  Snicker";
        String string2= "Cookie";
        System.out.println(string1.trim().toUpperCase().substring(0,7).charAt(3));
        System.out.println(string2.toLowerCase().replace("o","u").concat("s").startsWith("c"));


    }

}
