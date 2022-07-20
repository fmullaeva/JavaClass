package COLLECTION.Encapsulation;

public class Student {
    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private int phoneNumber;

    //Getter Methods are used to retrieve the value of encapsulated instance variables

    String getFirstName() {
        return firstName;
    }
    void setFirstName(String value){
        firstName=value;//this.firstName=firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

     void setSsn(String ssn) {
        this.ssn = ssn;
    }

     void setEmail(String email) {
        this.email = email;
    }

   void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
