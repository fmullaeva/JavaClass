package Exception;

public class ExceptionIntro {
    public static void
    main(String[] args) {
        int [] numbers=new int[5];
        System.out.println(numbers[5]);//ArrayIndexOutofExection
        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is no such index in Array");
            System.out.println(e.getMessage());
        }
        System.out.println("After try catch block");
    }
}
