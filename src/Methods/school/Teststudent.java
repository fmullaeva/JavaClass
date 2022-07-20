package Methods.school;

import java.util.Scanner;

public class Teststudent {
    public static void main(String[] args) {
      STUDENT student=new STUDENT();
      Scanner scanner=new Scanner(System.in);
      int i=0;
        do{
            System.out.println("First name:");
            student.firstName=scanner.next();
            System.out.println("Last name:");
            student.lastName= scanner.next();
            System.out.println("Age: ");
            student.age= scanner.nextInt();
            student.addStudent();
            i++;
        }while(i<STUDENT.ages.length);
        student.printStudentInfo();
    }

}

