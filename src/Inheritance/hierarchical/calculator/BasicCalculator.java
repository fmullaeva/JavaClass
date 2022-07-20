package Inheritance.hierarchical.calculator;

public class BasicCalculator {
    /*
    adding 2 variables
    substracting 1 variable from another one
    multiply 1 variable to another
    divide 1 variable to another
     */
    int number;
    int number2;

   protected void addition(int x, int y) {
        System.out.println("The sum of "+x+" and "+y+" is"+(x+y));

    }
      protected void substract(int x,int y){
          System.out.println("The substract "+x+" and "+y+" is"+(x-y));
    }
   protected void multiply(int x,int y){
       System.out.println("The multiplication "+x+" and "+y+" is"+(x*y));
   }
   protected void divide(int x,int y) {
       System.out.println("The multiplication " + x + " and " + y + " is" + (x / y));
   }
}