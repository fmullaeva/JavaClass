package Inheritance.hierarchical;

public class TestClass {
    public static void main(String[] args) {
        Child1 child1=new Child1("Jonamthan");
        child1.id=101;
        child1.name="Jonathan";
        child1.methodFromParent();
        System.out.println(child1.id);
        System.out.println(child1.name);
        System.out.println(child1.SchoolName);


        child2 child2=new child2("Alice");
        child2.id=102;
        child2.methodFromParent();
        System.out.println(child2.id);
        System.out.println(child2.name);
        child2.methodFromChild2();

        Child3 child3=new Child3("Robert");
        child3.id=103;
        child3.methodFromParent();
        System.out.println(child3.id);
        System.out.println(child3.name);
        child3.methodFromChild3();


    }
}
