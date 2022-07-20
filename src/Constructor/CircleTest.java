package Constructor;

public class CircleTest {
    public static void main(String[] args) {
        CircleApp circle1=new CircleApp("black",2.2);
        System.out.println(circle1);
        CircleApp circle2=new CircleApp("red");
        System.out.println(circle2);
        circle2.setColor("blue");



    }

}
