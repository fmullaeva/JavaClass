package Project6;

import java.util.Scanner;

public class EmployeeAppRunner {

    static HRDepartment hrDepartment = new HRDepartment("Miami", "Techtorial");

    public static void main(String[] args) {
        // welcome();
        //  printOptions();
        //   Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
      /*  do {
            option = scanner.next();
            makeAChoice(option);
        } while (!option.equals("0"));
    }


    private static void makeAChoice(String choice) {
        switch (choice) {
            case "0":
                System.out.println("Thank you for using our application");
                break;
            case "1":
                // NOTE: Employee firstName and LastName can not include any digit or symbol only upper or lower cases letter and each of them length can not be less 3
                String firstName = goodName();

         //   NOTE: Employee email address can be only gmail or yahoo account.
             //   String emailAddress = goodEmail();
                // NOTE: Employee phone number must be 10 digit
            //    int phoneNumber = goodPhoneNumber();
                // NOTE: Employee Department can not be other than given 6 department.

           //     Employee employee = new Employee(firstName,lastName);
              //  if (hrDepartment.addEmployee(employee)) {
                    System.out.println("Employee successfully created!");
                    System.out.println("Employee creation failed.");
                }

                break;
            case "2":
                // NOTE: ask user order type of this list. There should be three types of order according to their name--> Default order, ascending or descending order
                // If the user enter:
                // "default" then the user should see the list in insertion order,
                // "ascending" print this list ascending order
                // "descending" print this list descending order
                break;
            case "3":
                // NOTE: ask user to enter Department Name then print all employee email addresses according to this email address
            case "4":
            case "5":
            case "6":

        }


    public static void welcome() {

        System.out.println("Welcome to the Employee Management System");
    }


    public static void printOptions() {

        System.out.println("Hello! Please choose one of the following options");
        System.out.println("1 - For new employee");
        System.out.println("2 - To print all employee names, titles and employee ids");
        System.out.println("3 - To print all employee email address");
        System.out.println("4 - To update the employee email address");
        System.out.println("5 - To update the employee phone number");
        System.out.println("6 - To update the employee title");
        System.out.println("7 - To search the employee with employee id and print all other employee information");
        System.out.println("8 - To remove the employee");
        System.out.println("9 - To print all the department names with department employee number");
        System.out.println("10 - To print available options");
        System.out.println("0 - To exit");
    }


    public static String goodName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name?");
        String name = scanner.next();

        // firstName can not include any digit or symbol only upper or lower cases letter and each of them length can not be less 3
        for (int i=0;i<name.length();i++) {
            int value=name.charAt(i);
            if(!(value<='A'&& value<='Z') || (value<'a' && value<='z')){

            }
        return name;
    }

    public static String goodLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name?");
        String lastName = scanner.next();

        // lastName can not include any digit or symbol only upper or lower cases letter and each of them length can not be less 3
        for () {
            if (name) {

            }
        }

        return lastName;
    }

    public static String goodEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name?");
        String email = scanner.next();
        if (email.contains("yahoo") || email.contains("gmail")) {
            return email;
        } else {
            goodEmail();
        }
       /*

        return email;
    }

    public static int goodPhoneNumber() {
        // NOTE: Employee phone number must be 10 digit
        return -1;
  }}


       */
    }}