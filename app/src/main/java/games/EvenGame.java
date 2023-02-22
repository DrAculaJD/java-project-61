package games;

import hexlet.code.Cli;
import java.util.Scanner;

public class EvenGame {

    public static void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        String currentAnswer = "yes";

        while (count < 3) {
            Scanner answer = new Scanner(System.in);
            int number = (int) (Math.random() * 10);
            boolean checkAnswer = number % 2 == 0;

            System.out.println("Question: " + number);
            String answerNext = answer.next();
            System.out.println("Your answer: " + answerNext);

            if (!(checkAnswer)) {
                currentAnswer = "no";
            }

            if (answerNext.equals(currentAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answerNext + " is wrong answer ;(. Correct answer was " + currentAnswer
                        + ".\nLet's try again, " + Cli.getName() + "!");
                break;
            }

            count++;
            currentAnswer = "yes";
        }

        if (count == 3) System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
