package hexlet.code;

import games.Calc;
import games.Even;
import games.GCD;
import games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "0 - Exit");

        Scanner answer = new Scanner(System.in);

        switch (answer.next()) {
            case "1" -> Cli.greetings();
            case "2" -> Even.game();
            case "3" -> Calc.game();
            case "4" -> GCD.game();
            case "5" -> Progression.game();
            default -> {
            }
        }
    }
}
