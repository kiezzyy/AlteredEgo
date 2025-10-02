package game;
import gameutils.*;
import java.util.*;

public class Game {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        ConsoleOutput CO = new ConsoleOutput();

        CO.gameTitle();

        while(true) {
            try {
                CO.playOrExitMenu();
                char playOrExit = scanner.next().charAt(0);
                playOrExit = Character.toUpperCase(playOrExit);
                if(playOrExit == 'X') {
                    System.exit(1);
                }
                else if(playOrExit == 'P'){
                    break;
                }
                else {
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException error) {
                System.out.println("      Invalid Input. Try again!");
                scanner.nextLine();
            }
        }

        CO.characterChoices();

        int choice = 0;
        while(true) {
            try {
                CO.characterChoices();
                choice = scanner.nextInt();
                if(choice < 1 || choice > 5) {
                    throw new InputMismatchException();
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException error) {
                System.out.println("Invalid Input. Try again!");
                scanner.nextLine();
            }
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

        boolean isRunning = true;
        do {
            while(true) {
                try {
                    CO.playerSkillChoices();
                    int skillChoice = scanner.nextInt();
                    if(skillChoice < 0 || skillChoice > 3) {
                        throw new InputMismatchExcpetion();
                    }
                    else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid Input, Try Again!");
                    scanner.nextLine();
                }
            }
        } while(isRunning);


        scanner.close();
    }
}
