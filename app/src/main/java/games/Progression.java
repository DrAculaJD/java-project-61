package games;

import hexlet.code.Cli;
import java.util.Scanner;

public class Progression {

    public static void game() {
        Cli.greetings();
        System.out.println("What number is missing in the progression?");

        int count = 0;

        while (count < 3) {
            Scanner answer = new Scanner(System.in);
            String[] progression = new String[10];
            progression[0] = (int) (Math.random() * 100) + "";

            int delta = (int) (Math.random() * 10); // элемент с таким же индексом буду ислючать из прогрессии

            for (int i = 1; i < progression.length; i++) {
                progression[i] = Integer.parseInt(progression[i - 1]) + delta + "";
            }
            String answerNum = progression[delta];
            progression[delta] = "..";


            System.out.println("Question: " + String.join(" ", progression));
            String answerNext = answer.next();
            System.out.println("Your answer: " + answerNext);

            if (answerNext.equals(answerNum)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerNext + "' is wrong answer ;(. Correct answer was '" + answerNum
                        + ".\nLet's try again, " + Cli.getName() + "!");
                break;
            }

            count++;
        }

        if (count == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }

    }

}
