package games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GCD {

    public static void game() {
        Cli.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        int maxCount = 3;

        while (count < maxCount) {
            Scanner answer = new Scanner(System.in);
            int maxNumber = 100;
            int forExcludeZero = 1;
            int number1 = (int) ((Math.random() * maxNumber) + forExcludeZero);
            int number2 = (int) ((Math.random() * maxNumber) + forExcludeZero);
            int result = gcd(number1, number2);

            System.out.println("Question: " + number1 + " " + number2);
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

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
