package hexlet.code;

import games.CalcGame;
import games.EvenGame;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");

        Scanner answer = new Scanner(System.in);

        switch (answer.next()) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                EvenGame.game();
                break;
            case "3":
                CalcGame.game();
                break;
            default:
                break;
        }
    }
}
