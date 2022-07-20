package Project6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HRDepartment {


    private String location;
    private String companyName;
    private ArrayList<Employee> allCards;
    ArrayList<String> departments = new ArrayList<>(Arrays.asList(new String[]{"Finance", " Marketing", "IT", "HR",
            "Purchasing", "Sales"}));

    int[] countOfEmployees = {0, 0, 0, 0, 0, 0};

    public HRDepartment(String location, String companyName) {
        this.location = location;
        this.companyName = companyName;
        this.allCards = new ArrayList<Employee>();
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<Employee> getAllCards() {
        return allCards;
    }


    public boolean addEmployee(Employee card) {
        /*
        This method will take the parameter as a Employee object and
        if the Employee is not added to the list before it will add to the arraylist.
        To be able to understand employee is registered or not you need to check employeeId.
        Because employee id is unique value.
        Also, This company can hold up to 30 employee.
        NOTE: The company has 6 department and in each department can have max 5 employee.

         */
        allCards.add(card);
        return false;
    }

    public void printEmailAddress(String departmentName) {

        /*
        this method is taking one parameter department name and it will print all the email address.
         which is available in this list related with department id
         */
    }

    public boolean updateEmailAddress(String employeeId, String newEmailAddress) {
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getId().equalsIgnoreCase(employeeId)) {
                allCards.get(i).setEmail(newEmailAddress);
                return true;
            }
            return false;
        }
        /*
        This method is taking parameter as employeeId and email address.
        According to the employeeId, you will update the old email address with new email.
        if it is updated this method will return true else return false
         */
        return false;
    }


    /*
    REST OF THE METHODS
        1- Create the method will take parameter as employeeId and new phone number, it will update old phone number with new phone number.
        2- Create the method will take parameter as emailAddress and newTitle, it will update old title with new title.
        3- Create the method will take one parameter as a employeeId and it will print all other information of employee like
        name, email, phone, title, department etc.
        4- Create the method will take one parameter as a employeeId and it will remove the employee from the list.
        5- Create the method will take no parameter and it will print all the department names with employee numbers
        The Company has 6 different department Finance, Marketing, IT, HR, Purchasing and Sales department.
        For example:
        Finance department - 10 employee
        Marketing department - 10 employee
        IT department - 10 employee
        ...
        .
        */
}