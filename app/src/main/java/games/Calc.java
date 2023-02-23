package games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Calc {

    public static void game() {
        Cli.greetings();
        System.out.println("What is the result of the expression?");

        int count = 0;
        int maxCount = 3;

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            int maxNumber = 100;
            int number1 = (int) (Math.random() * maxNumber);
            int number2 = (int) (Math.random() * maxNumber);
            int maxAmountActions = 3;
            int actionChoice = (int) (Math.random() * maxAmountActions);
            int result = 0;
            String action = " + ";

            if (actionChoice == 0) {
                action = " - ";
                result = number1 - number2;
            } else if (actionChoice == 1) {
                action = " * ";
                result = number1 * number2;
            } else {
                result = number1 + number2;
            }

            System.out.println("Question: " + number1 + action + number2);
            int answerNext = answer.nextInt();
            System.out.println("Your answer: " + answerNext);

            if (answerNext == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerNext + "' is wrong answer ;(. Correct answer was '" + result
                        + ".\nLet's try again, " + Cli.getName() + "!");
                break;
            }

            count++;
        }

        if (count == maxCount) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
