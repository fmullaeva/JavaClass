package Inheritance.hierarchical.calculator;

import java.util.ArrayList;
import java.util.List;

public class TestCalculator {
    public static void main(String[] args) {
        BasicCalculator basicCalculator=new BasicCalculator();
        basicCalculator.addition(10,20);
        basicCalculator.multiply(3,5);
        basicCalculator.divide(10,5);
        AdvancedCalculator advancedCalculator=new AdvancedCalculator();
        advancedCalculator.calculatePower(2,5);
        advancedCalculator.CalculateRemaider(3,2);


    }
}
