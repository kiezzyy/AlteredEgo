package gameutils;

public class ConsoleOutput {
    public ConsoleOutput() { }

    public void printWithDelay(String message, int delay) {
        for(char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delayInSeconds);
            }
            catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
            System.out.println();
    }

    public void gameTitle() {
        printWithDelay("------------- WELCOME TO ALTERED EGO --------------", 150);
        printWithDelay("----- Fight Your Other Side or Suffer Forever -----", 150);
    }

    public void playOrExitMenu() {
        System.out.print("      Press 'P' to Play or 'X' to Exit: ");
    }

    public void characterChoices() {
        System.out.println("---------------Choose Your Character --------------");
        System.out.println("        [1] Cosmic Dassel");
        System.out.println("        [2] Khylle The Reaper");
        System.out.println("        [3] Earl");
        System.out.println("        [4] The One John");
        System.out.println("        [5] And Rew");
        System.out.print("       Enter choice (1, 2, 3, 4, or 5): ");
    }

    public void playerSkillChoices(Player player) {
        System.out.println("------ Choose Skill to use -----");
        System.out.println("    [1] Skill One: " + player.getSkillOneName());
        System.out.println("    [2] SKill Two: " + player.getSkillTwoName());
        System.out.println("    [3] Skill Three: " + player.getSkillThreeName());
        System.out.print("  Enter choice (1, 2, or 3): ");
    }




}
