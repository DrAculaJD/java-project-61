package games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GCD {

    public static void game() {
        Cli.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;

        while (count < 3) {
            Scanner answer = new Scanner(System.in);
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
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

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
