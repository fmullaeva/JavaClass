package Abstracttion.Phone;

public class PhoneApp {
     public static void main(String[] args) {
          Iphone iphone=new Iphone();
          iphone.model="Apple iphone 13";
          iphone.price=700;
          iphone.applePay();
          iphone.playMusic();
          iphone.defaultPrint();
          Memory.staticPrint();
          iphone.scanFace();
          iphone.text("Hi everyone, glad to join group");
          iphone.call();
          System.out.println(iphone.speed());
     }
}
