package ArraybyEldar;

import java.util.Arrays;

public class merge2ArraySystemcopy {
    public static void main(String[] args) {
        String[] coffees={
                "Affogato","Americano","Cappuccino","Corretto","Cortado",
                "Doppio","Expresso","Frappucino","Freddo","Macchiato"};
        String[] teas={"earl grey","English Breakfast"};
        String[]result=new String[coffees.length+ teas.length];
        System.arraycopy(coffees,0,result,0,coffees.length);
        System.arraycopy(teas,0,result,coffees.length,teas.length);
        System.out.println(Arrays.toString(result));


        }
    }

