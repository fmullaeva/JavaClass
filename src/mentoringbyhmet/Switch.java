package mentoringbyhmet;

import java.util.Scanner;

public class Switch {
    /*
    possible interview questions
    Questions:
    in what condition should i use switch or if conditions?
    note:limited option use switch statement(bank of america there is limited options i used switch statement)
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int options=scan.nextInt();
        switch(options){
            case 1:
            System.out.println("you are talking to Ahmet");
            break;
            case 2:
                System.out.println("you are talking to Beck");
                break;
            case 3:
                System.out.println("you are talking to Rima");
                break;
            case 4:
                System.out.println("you are talking Ana");


        }
    }
}



