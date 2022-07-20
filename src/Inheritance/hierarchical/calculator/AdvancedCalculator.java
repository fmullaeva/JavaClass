package Inheritance.hierarchical.calculator;

public class AdvancedCalculator extends BasicCalculator {
    /*
    method to get remainder
    method to calculate power of n number 2,4
     */
 void CalculateRemaider(int x,int y){
    if(y==0){
        System.out.println("you cannot divide by 0");

    }else{
        System.out.println("Remainder of"+x+"and"+y+"is"+(x%y));

    }
    }
    void calculatePower(int x,int y){
        int result=1;
        int exponent=y;
        while(exponent!=0){
            result+=x;
            exponent--;
        }
        System.out.println(result+exponent);
    }
}