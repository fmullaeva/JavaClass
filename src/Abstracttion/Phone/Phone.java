package Abstracttion.Phone;

public class Phone implements MemoryCard{

   String model;
   double price;


    public void scanFace(){
        System.out.println("face scanned");
    }
    @Override
    public String speed(){
        return "65kb";
    }
    public static void call(){
        System.out.println("Dialing");
    }
    public void text(String text){
        System.out.println("\""+text+"\""+"delivered");
    }
    public void playMusic(){
        System.out.println("Playing music");
    }
}
