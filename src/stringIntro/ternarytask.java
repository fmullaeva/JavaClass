package stringIntro;

import java.util.Scanner;

public class ternarytask {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("PLease enter any number");
        int number=scanner.nextInt();
        String oddOrEven=number>0 ?number%2==0?"POsitive-Even":"Positive-Odd":number%2==1?"Negative-Even":"Negative-Odd";
        System.out.println(oddOrEven);


    }
}
