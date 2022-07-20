package mentoringbyhmet;

public class UnaryAndCompund {
    /*Possible interview questions:
    loops questions require unary operators(i++,i--);
    ++i--->preincrement will immediately
    i++--->postincrement will increase value in the next line.


    Compund operators:
    way to make your arithmetic works shorter

    exp:x=x+y-->x+=y
        x=x*y-->x*y=y
        x=x/y-->x/=y

     */
    public static void main(String[] args) {
        int number=6;
        int secondnumber=number++;//6
        int thirdNumber=++number;//8
        System.out.println(number++ + thirdNumber);//8+8=16
        System.out.println(secondnumber);//6
    }

}
