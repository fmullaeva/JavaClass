package Methods;

public class numericMethod {

    public static double averageNUm(int num1, int num2) {
        double result = (num1 + num2) / 2;
        return result;
    }

    public static void main(String[] args) {

        //int number =123;
        //int  reversedNUm=0;
        //  for (; number >= 0; number /= 10) {
        //int digit = number % 10;
        //reversedNum = reversedNum * 10 + digit;}
    }

    /**
     *
     */
    public static int reverseNUmber(int number) {
        int reverseNUmber = 0;
        for (int i = 0; number != i; number /= 10) {
            int digit = number % 10;
            reverseNUmber = reverseNUmber * 10 + digit;

        }
        return reverseNUmber;
    }

    /**
     *
     * @param num
     * @return
     */
    public static boolean Palindrome(int num) {
    return num==reverseNUmber(num);
    }
}
 /* method which will check if num is palindrome

 ex:1991
  */

