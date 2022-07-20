package Homework;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String studentList="";
        String answer;
        do {
            System.out.println("PLease enter student name");
            String name = input.next();
            studentList = studentList + name + "\n";
            System.out.println("Do you want to add new student");
            answer = input.next();
        }while(answer.equalsIgnoreCase("yes"));
       System.out.println(studentList);
        }
    }

