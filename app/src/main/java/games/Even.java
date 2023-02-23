package games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Even {

    public static void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;
        int maxCount = 3;
        String currentAnswer = "yes";

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            int maxNumber = 10;
            int number = (int) (Math.random() * maxNumber);
            int denomForCheckNumber = 2;
            boolean checkAnswer = number % denomForCheckNumber == 0;

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

        if (count == maxCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
