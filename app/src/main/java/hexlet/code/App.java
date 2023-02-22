package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");

        Scanner answer = new Scanner(System.in);

        switch (answer.next()) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                EvenGame.even();
                break;
            default:
                break;
        }
    }
}
