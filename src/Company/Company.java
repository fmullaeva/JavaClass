package Company;

public class Company {

    String companyName;
    int beginYear;
    public Company(){

        System.out.println("Compaby class no argument");
    }
     public Company(String companyName,int beginYear){
        this();
        this.companyName=companyName;
        this.beginYear=beginYear;
         System.out.println("Company class 2 argument constructor");
     }
   public boolean isHiring() {
    return false;
     }
    public void service(){
        System.out.println("Company service.");
     }
    }