package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greetings() {
        System.out.println("May I have your name?");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello, " + name.next() + "!");
    }

}
