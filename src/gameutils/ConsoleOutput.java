package gameutils;

public class ConsoleOutput {
    public ConsoleOutput() { }

    public static void printWithDelay(String message, int delay) {
        for(char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delay);
            }
            catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            System.out.println();
    }

    public void gameTitle() {
        printWithDelay("------------- WELCOME TO ALTERED EGO --------------", 90);
        printWithDelay("----- Fight Your Other Side or Suffer Forever -----", 90);
    }

    public void playOrExitMenu() {
        System.out.print("      Press 'P' to Play or 'X' to Exit: ");
    }

    public void characterChoices() {
        System.out.println("\n--------------- Choose Your Character --------------");
        System.out.println("        [1] Cosmic Dassel");
        System.out.println("        [2] Khylle The Reaper");
        System.out.println("        [3] Earl");
        System.out.println("        [4] The One John");
        System.out.println("        [5] And Rew");
        System.out.print("      Enter choice (1, 2, 3, 4, or 5): ");
    }

    public void playerSkillChoices(Player player) {
        System.out.println("\n--------------- Choose Skill to use --------------");
        System.out.println("        [0] Basic Attack");
        System.out.println("        [1] Skill One: " + player.getSkillOneName());
        System.out.println("        [2] SKill Two: " + player.getSkillTwoName());
        System.out.println("        [3] Skill Three: " + player.getSkillThreeName());
        System.out.print("      Enter choice (0, 1, 2, or 3): ");
    }

    public void enemyModeChoice() {
        System.out.println("\n--------------- Choose Enemy Mode --------------");
        System.out.println("        [0] Random");
        System.out.println("        [1] User Selection");
    }

    public void enemyCharacterChoices() {
        System.out.println("\n--------------- Choose Your Enemy --------------");
        System.out.println("        [1] Kaniel Outis");
        System.out.println("        [2] Van Berksville");
        System.out.println("        [3] Asta Clover");
        System.out.println("        [4] JF Void");
        System.out.println("        [5] Deidre");
        System.out.print("      Enter (1, 2, 3, 4, or 5): ");
    }

    public void enemyRandomSkillChoice(Enemy enemy) {
        System.out.println("\n------------- "+enemy.getName()+"'s Skills: --------------");
        System.out.println("        [0] Basic Attack");
        System.out.println("        [1] Skill One: " + enemy.getSkillOneName());
        System.out.println("        [2] Skill Two: " + enemy.getSkillTwoName());
        System.out.println("        [3] Skill Three: " + enemy.getSkillThreeName());
        System.out.println();
        printWithDelay(enemy.getName()+ " is preparing for a counter attack..........", 200);
    }


}
