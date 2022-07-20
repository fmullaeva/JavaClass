
package elseIfStatement;
import java.util.Scanner;
   public class elseIfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first name:");
        String firstName = input.next();
        System.out.println("Please input your last name:");
        String lastName = input.next();
        String userName = "";
        if (firstName.length() >= 3 && lastName.length() >= 3) {
            userName = firstName.substring(0, 3).concat(lastName.substring(lastName.length() - 3));
        } else {
            if (firstName.length() < 3) {
                if (lastName.length() < 3) {
                    userName = firstName + lastName;
                } else {
                    userName = firstName + lastName.substring(lastName.length() - 3);
                }
            } else {
                if (lastName.length() < 3) {
                    userName = firstName.substring(0, 3) + lastName;
                }
            }
        }

        System.out.println(userName);
    }
}