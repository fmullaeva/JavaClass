package FotimaExamplestuding;

import java.util.Scanner;

public class bubblemusic {
    public static void main(String[] args) {
        String question = "What is the biggest planet in solar system?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";
        String correctAnswer = choiceTwo;
        //What a pirnt statement asking a question
        System.out.println(question);
        // Write a statement giving the answer choices

        //Have user input an answer
        Scanner sc = new Scanner(System.in);
        //REtrive the user input
        String input = sc.next();
        if (correctAnswer.equals(input)) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Incorrect");
        }

    }
}
