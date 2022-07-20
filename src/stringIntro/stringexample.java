package stringIntro;

import java.util.Locale;

public class stringexample {
    public static void main(String[] args) {
        String str1 = "I love Techtorial";
        System.out.println(str1.toUpperCase().substring(5).replace("T","t").trim().toLowerCase());


    }
}