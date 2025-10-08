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
                System.out.println("\t\tInvalid Input. Try again!");
                scanner.nextLine();
            }
        }

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
                System.out.println("\t\tInvalid Input. Try again!");
                scanner.nextLine();
            }
        }

        switch(playerChoice) {
            case 1 -> player = new Player("Cosmic Dassel", "Provoked Punch", "Bug Overflow", "Overclock");
            case 2 -> player = new Player("Khylle The Reaper", "Karate Kick", "Flying Food", "Voice of Destruction");
            case 3 -> player = new Player("Earl", "Knee Strike", "Double Kick", "Dodge");
            case 4 -> player = new Player("The One John", "Upper Cut", "Counterpalm", "Flaring Punches");
            case 5 -> player = new Player("And Rew", "Dragon Fist", "Dragon First Missiles", "Dragon's Verdict of Demise");
        }

        int enemyChoice = 0;
        while(true) {
            try {
                CO.enemyCharacterChoices();
                enemyChoice = scanner.nextInt();
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("\t\tInvalid Input, Try Again!");
                scanner.nextLine();
            }
        }

        switch(enemyChoice) {
            case 1 -> enemy = new Enemy("Kaniel Outis", "Image Burn", "Spirit Compression", "Sanity Drain");
            case 2 -> enemy = new Enemy("Van Berskville", "Stab", "Parry", "Fang Sword Style");
            case 3 -> enemy = new Enemy("Asta Clover", "Arcane Blast", "Whirlwind", "Block");
            case 4 -> enemy = new Enemy("JF Void", "Void Chop", "Void Deflect", "Void Stagger Palm");
            case 5 -> enemy = new Enemy("Deidre", "Lightning Cut", "Thunder Cleave", "Final Turn");
        }

        boolean isRunning = true;
        do {
            int playerSkillChoice = 0, enemySkillChoice = 0, newPlayerMana = 0, newEnemyMana = 0;

            //Show player mana
            CO.printWithDelay("\n[" + player.getName() + "] Mana: " + player.getMana(), 20);

            // loop until the user gets the input right
            // Player user skill input
            while(true) {
                try {
                    CO.playerSkillChoices(player);
                    playerSkillChoice = scanner.nextInt();
                    if(playerSkillChoice < 0 || playerSkillChoice > 3) {
                        throw new InputMismatchException();
                    }
                    else {
                        break;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("\t\tInvalid Input, Try Again!");
                    scanner.nextLine();
                }
            }

            switch(playerSkillChoice) {
                case 0 -> {
                    enemy.setHitpoints(player.basicAttack());
                }
                case 1 -> {
                    //Change The swtich to be more functional in PLAYER!
                    if (player.getSkillOneCooldown() == 0) {
                        if (player.isSkillOneUsable()) {    //Check mana madafaka
                            enemy.setHitpoints(player.skillOne());
                            player.reduceMana(player.getSKillOneManaUsage());   //deduc mana
                            player.reduceSkillOneCooldown();
                        } else {
                            CO.printWithDelay("\nNot enough mana to use " + player.getSkillOneName() + "!", 30);//sheesh delay
                        }   //fuck system.out.println we use unknown stuff
                    } else {
                        CO.printWithDelay("\n" + player.getSkillOneName() + " is on cooldown!", 30);
                    }
                }
                case 2 -> {
                    if (player.getSkillTwoCooldown() == 0) {
                        if (player.isSkillTwoUsable()) {
                            enemy.setHitpoints(player.skillTwo());
                            player.reduceMana(player.getSKillTwoManaUsage());
                            player.reduceSkillTwoCooldown();
                        } else {
                            CO.printWithDelay("\nNot enough mana to use " + player.getSkillTwoName() + "!", 30);
                        }
                    } else {
                        CO.printWithDelay("\n" + player.getSkillTwoName() + " is on cooldown!", 30);
                    }
                }
                case 3 -> {
                    if (player.getSkillThreeCooldown() == 0) {
                        if (player.isSkillThreeUsable()) {
                            enemy.setHitpoints(player.skillThree());
                            player.reduceMana(player.getSKillThreeManaUsage());
                            player.reduceSkillThreeCooldown();
                        } else {
                            CO.printWithDelay("\nNot enough mana to use " + player.getSkillThreeName() + "!", 30);
                        }
                    } else {
                        CO.printWithDelay("\n" + player.getSkillThreeName() + " is on cooldown!", 30);
                    }
                }
            }

            //this gibberish line of code regen mana if player attack i think
            newPlayerMana = random.nextInt(25, 51);
            player.increaseMana(newPlayerMana);

            //pakita ang mana regen
            CO.printWithDelay("\n" + player.getName() + " regenerates " + newPlayerMana + " mana. (Mana: " + player.getMana() + ")", 30);

            //IPAKITA ANG ENEMY MANA
            CO.printWithDelay("\n[" + enemy.getName() + "] Mana: " + enemy.getMana(), 20);


            enemySkillChoice = random.nextInt(0, 4);
            CO.enemyRandomSkillChoice(enemy);


            //enemy style
            switch(enemySkillChoice) {
                case 0 -> {
                    player.setHitpoints(enemy.basicAttack());
                }
                case 1 -> {
                    //uh enemey mana usage
                    if (enemy.getSkillOneCooldown() == 0) {
                        if (enemy.isSkillOneUsable()) { //same sa player animal
                            player.setHitpoints(enemy.skillOne());
                            enemy.reduceMana(enemy.getSKillOneManaUsage()); //yawa ka dassel nganu uppercase ang letter K
                            enemy.reduceSkillOneCooldown();
                        } else {
                            CO.printWithDelay("\n" + enemy.getName() + " tried to use " + enemy.getSkillOneName() + " but didn't have enough mana.", 30);
                            player.setHitpoints(enemy.basicAttack()); //this shitty ass if u remove it the player become god mode so ya dont.
                        }
                    } else {
                        CO.printWithDelay("\n" + enemy.getName() + "'s " + enemy.getSkillOneName() + " is on cooldown!", 30);
                        player.setHitpoints(enemy.basicAttack());
                    }
                }
                case 2 -> {
                    if (enemy.getSkillTwoCooldown() == 0) {
                        if (enemy.isSkillTwoUsable()) {
                            player.setHitpoints(enemy.skillTwo());
                            enemy.reduceMana(enemy.getSKillTwoManaUsage());
                            enemy.reduceSkillTwoCooldown();
                        } else {
                            CO.printWithDelay("\n" + enemy.getName() + " tried to use " + enemy.getSkillTwoName() + " but didn't have enough mana.", 30);
                            player.setHitpoints(enemy.basicAttack());
                        }
                    } else {
                        CO.printWithDelay("\n" + enemy.getName() + "'s " + enemy.getSkillTwoName() + " is on cooldown!", 30);
                        player.setHitpoints(enemy.basicAttack());
                    }
                }
                case 3 -> {
                    if (enemy.getSkillThreeCooldown() == 0) {
                        if (enemy.isSkillThreeUsable()) {
                            player.setHitpoints(enemy.skillThree());
                            enemy.reduceMana(enemy.getSKillThreeManaUsage());
                            enemy.reduceSkillThreeCooldown();
                        } else {
                            CO.printWithDelay("\n" + enemy.getName() + " tried to use " + enemy.getSkillThreeName() + " but didn't have enough mana.", 30);
                            player.setHitpoints(enemy.basicAttack());
                        }
                    } else {
                        CO.printWithDelay("\n" + enemy.getName() + "'s " + enemy.getSkillThreeName() + " is on cooldown!", 30);
                        player.setHitpoints(enemy.basicAttack());
                    }
                }
            }

            //ang imong ex mo regen og mana taga kita og bag.ong babae
            newEnemyMana = random.nextInt(10, 21); // kamoy bahala ani pilay regen
            enemy.increaseMana(newEnemyMana);

            //display ang ex nimo na mana
            CO.printWithDelay("\n" + enemy.getName() + " regenerates " + newEnemyMana + " mana. (Mana: " + enemy.getMana() + ")", 30);

            if(player.getHitpoints() <= 0 || enemy.getHitpoints() <= 0) {
                isRunning = false;
            }

        } while(isRunning); //use while(true) brah >:) - jf

        if(player.getHitpoints() > 0) {
            CO.printWithDelay("\n" +player.getName()+ " wins!",90);
        } else {
            CO.printWithDelay("\n" +enemy.getName()+ " wins!",90);
        }

        scanner.close();
    }

}
