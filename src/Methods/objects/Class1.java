package Methods.objects;

public class Class1 {
    String name;//instance
    int result=900;//instance
    static int average;//instance variable,that reflect to other object as well.
    public static void main(String[] args) {
        Class1 class1=new Class1();
        class1.print();
        System.out.println(class1.sum(1000));
        System.out.println(average);
        String word="techtorial";//local variable,locked in this variable cant reuse
    }
    void print(){
        System.out.println("Hello from class1");
        result=100;
        System.out.println(result);
    }
    static void printStatic() {
        System.out.println("static method");
    }
   int sum(int num) {
       int r =num;
       result += r;
       return result;
   }}
