package main;
import game.utils.*;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ConsoleOutput CO = new ConsoleOutput();

        CO.gameTitle();
        try {
            char playOrExit = scanner.next().charAt(0).toUpperCase();
            if(playOrExit == 'X') {
                System.exit(1);
            }
        } catch(InputMismatchException error) {
            System.out.println("Invalid Input. Try again!");
        }

        CO.characterChoices();

        try {
            int choice = scanner.nextInt();
        } catch(InputMismatchException error) {
            System.out.println("Invalid Input. Try again!");
        }

        switch(choice) {
            case 1 -> {
                Player player = new Player("Cosmic Dassel");
            }
            case 2 -> {
                Player player = new Player("Khylle The Reaper");
            }
            case 3 -> {
                Player player = new Player("Earl");
            }
            case 4-> {
                Player player = new Player("The One John");
            }
            case 5 -> {
                Player player = new Player("And Rew");
            }

        }


        scanner.close();
    }

}
