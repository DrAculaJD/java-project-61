package games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Prime {

    public static void game() {
        Cli.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int count = 0;
        String currentAnswer = "yes";

        while (count < 3) {
            Scanner answer = new Scanner(System.in);
            String primeNumbers =  "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, "
                    + "59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, "
                    + "151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199";

            String question = (int) (Math.random() * 199) + "";
            boolean checkAnswer = primeNumbers.contains(question);


            System.out.println("Question: " + question);
            String answerNext = answer.next();
            System.out.println("Your answer: " + answerNext);

            if (!(checkAnswer) || question.equals("1")) {
                currentAnswer = "no";
            }

            if (answerNext.equals(currentAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerNext + "' is wrong answer ;(. Correct answer was '" + currentAnswer
                        + ".\nLet's try again, " + Cli.getName() + "!");
                break;
            }

            count++;
            currentAnswer = "yes";
        }

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }

}
