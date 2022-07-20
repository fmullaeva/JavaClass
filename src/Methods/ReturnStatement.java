package Methods;

public class ReturnStatement {
    public static void main(String[] args) {
    printAMessage();
   int sum=add(5,4);
        System.out.println(sum);
        String shouting=caps("why are you reading my dairy");
        System.out.println(shouting);

}
  public static void printAMessage(){
      System.out.println("This is our first method");
  }
   public static int add(int a,int b) { // return by variable
       return a + b;

   }
   public static String caps(String s){
        return s.toUpperCase();

}}