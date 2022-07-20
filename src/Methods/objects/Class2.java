package Methods.objects;

public class Class2 {
    public static void main(String[] args) {
        Class1 object1=new Class1();
        Class1 object2=new Class1();
        object1.name="Batch1";
        object2.name="Batch2";
        System.out.println(object1.name);
        System.out.println(object2.name);
        object1.average=100;
        System.out.println(object1.average);
        System.out.println(object2.average);
        object2.average=1000;
        System.out.println(object1.average);
        System.out.println(object2.average);
        object1.result=200;
        object2.result=500;
        System.out.println(object1.result);
        System.out.println(object2.result);

    }
}
//