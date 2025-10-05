package main;
import gameutils.*;
import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        ConsoleOutput CO = new ConsoleOutput();
        Player player = new Player();
        Enemy enemy = new Enemy();

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

        int playerChoice = 0;
        while(true) {
            try {
                CO.characterChoices();
                playerChoice = scanner.nextInt();
                if(playerChoice < 1 || playerChoice > 5) {
                    throw new InputMismatchException();
                }
                else {
                    break;
                }
            }
            catch(InputMismatchException error) {
                System.out.println("        Invalid Input. Try again!");
                scanner.nextLine();
            }
        }

        switch(choice) {
            case 1 -> player = new Player("Cosmic Dassel", "Provoked Punch", "Bug Overflow", "Overclock");
            case 2 -> player = new Player("Khylle The Reaper", "Karate Kick", "Flying Food", "Voice of Destruction");
            case 3 -> player = new Player("Earl", "Knee Strike", "Double Kick", "Dodge");
            case 4 -> player = new Player("The One John", "Upper Cut", "Counterpalm", "Flaring Punches");
            case 5 -> player = new Player("And Rew", "Dragon Fist", "Dragon First Missiles", "Dragon's Verdict of Demise");
        }

        int enemyChoice = random.nextInt(1, 6);
        switch(enemyChoice) {
            case 1 -> enemy = new Enemy("Kaniel Outis", "Image Burn", "Spirit Compression", "Sanity Drain");
            case 2 -> enemy = new Enemy("Van Berskville", "Stab", "Parry", "Fang Sword Style");
            case 3 -> enemy = new Enemy("Asta Clover", "Arcane Blast", "Whirlwind", "Block");
            case 4 -> enemy = new Enemy("JF Void", "Void Chop", "Void Deflect", "Void Stagger Palm");
            case 5 -> enemy = new Enemy("Deidre", "Lightning Cult", "Thunder Cleave", "Final Turn");
        }

        boolean isRunning = true;
        do {
            // loop until the user gets the input right
            while(true) {
                try {
                    CO.playerSkillChoices(player);
                    int skillChoice = scanner.nextInt();
                    if(skillChoice < 0 || skillChoice > 3) {
                        throw new InputMismatchException();
                    }
                    else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("        Invalid Input, Try Again!");
                    scanner.nextLine();
                }
            }

            switch(skillChoice) {
                case 0 -> {
                    enemy.setHitPoints(player.basicAttack());
                }
                case 1 -> {
                    enemy.setHitPoints(player.skillOne());
                }
                case 2 -> {
                    enemy.setHitPoints(player.skillOne());
                }
                case 3 -> {
                    enemy.setHitPoints(player.skillOne());
                }
            }

            while(true) {
                try {
                    CO.enemySkillChoices(enemy);
                    int enemySkillChoice = scanner.nextInt();
                    if(enemySkillChoice < 0 || enemySkillChoice > 3) {
                        throw new InputMismatchException();
                    }
                    else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("        Invalid Input, Try Again!");
                    scanner.nextLine();
                }
            }

            // logic sa enemy skill



            if(player.getHitpoints() <= 0 || enemy.getHitpoints() <= 0) {
                isRunning = false;
            }


        } while(isRunning);


        scanner.close();
    }

}
