package Homeworkeldar;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 phrase ");
        String str1= input.next();
        System.out.println("Please enter one more");
        String str2= input.next();
        System.out.println("Please enter one more");
        String str3= input.next();
        System.out.println("Please enter one more");
        if (     (str1.length()==str2.length())
                && (str1.length()==str3.length())
                && (str1.contains("java"))
                && (str2.contains("java"))
                && (str3.contains("java"))
                && (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z')
                && (str2.charAt(0) >= 'A' && str2.charAt(0) <= 'Z')
                && (str3.charAt(0) >= 'A' && str3.charAt(0) <= 'Z'))


        {
            System.out.println("good");

        } else {
            System.out.println("noot");
        }
        }
        }


