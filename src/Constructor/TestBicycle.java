package Constructor;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle byke=new Bicycle("Ural", 100);
        System.out.println(byke.make);
        Bicycle byke2=new Bicycle("BMX",150);
        System.out.println(byke2.make);
        byke.printPrice();
        byke2.printPrice();
        Bicycle byke3= new Bicycle();
        byke3.make="Montra";
        System.out.println(byke3.make);





    }
}
