package Inheritance;

public class TestClass {
    public static void main(String[] args) {
        Subclass sub=new Subclass();
        sub.name="Edward";
        sub.id=1234;
        System.out.println(sub.name);
        System.out.println(sub.id);
        sub.printSalary();
        sub.isHired=true;


    }
}
