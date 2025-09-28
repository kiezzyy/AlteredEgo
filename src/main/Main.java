package main;
import game.utils.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleOutput CO = new ConsoleOutput();

        CO.gameTitle();
        CO.characterChoices();

        int choice = scanner.nextInt()
        scanner.close();
    }

}
