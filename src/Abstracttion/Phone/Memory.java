package Abstracttion.Phone;

public interface Memory {
    byte CAPACITY=Byte.MAX_VALUE;
     String speed();
    static void staticPrint() {
        System.out.println("Print from static method in  interface memory");
    }

    default void defaultPrint(){
        System.out.println();
    }
}

