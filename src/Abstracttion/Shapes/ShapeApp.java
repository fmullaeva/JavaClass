package Abstracttion.Shapes;

public class ShapeApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red", 5, 10);
        triangle.printDetails();
        System.out.printf("Color of %s is %s%n", triangle.name, triangle.color);
        System.out.println("Area of" + triangle.name + "is" + triangle.CountArea());

    }
}