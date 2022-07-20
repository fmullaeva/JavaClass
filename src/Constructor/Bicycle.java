package Constructor;

public class Bicycle {
    String model;//instance variables
    String make;// instance variable
    int amountOfWheels;//instance variable
    int price;
    //   System.out.println("Hi from constructor");

    Bicycle() {
        System.out.println("No Argument  Constructor");
    }

    Bicycle(String make, int priceOfBicycle) {
        this.make = make;
        price = priceOfBicycle;
    }

    void printPrice() {
        System.out.println(price);

    }
}
