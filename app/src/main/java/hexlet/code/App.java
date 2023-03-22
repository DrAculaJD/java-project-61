package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner answer = new Scanner(System.in);
        changeGame(answer.next());

    }

    public static void changeGame(String numberOfGame) {

        switch (numberOfGame) {
            case "1" -> Cli.greetings();
            case "2" -> Even.game();
            case "3" -> Calc.game();
            case "4" -> GCD.game();
            case "5" -> Progression.game();
            case "6" -> Prime.game();
            default -> System.out.println("You entered an invalid value, let's try again.");
        }

    }
}
