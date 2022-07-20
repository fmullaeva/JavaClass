package mentoringbyhmet;

public class ArraysPractice2 {
    // Possible interview questions:
    // Print out smallest and largest number from array
    public static void main(String[] args) {
        int[] numbers = {100, 300, 200, 450, 350};
        //use loops find smallest and largest num
        int smallestnum = numbers[0];
        int largestnum = numbers[1];
        for (int number : numbers) {
            if (number < smallestnum) {
                smallestnum = number;
            } else if (number > largestnum) {
                largestnum = number;
                System.out.println("The smallest numbesr is" + smallestnum + "The largest number is" + largestnum);
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < smallestnum) {
                    smallestnum = numbers[i];
                } else if (numbers[i] > largestnum) {
                    largestnum = numbers[i];

                }
                System.out.println("The smallest number is" + smallestnum + "Tge largest number is" + largestnum);
            }
        }
    }}
