package game.utils;

public class ConsoleOutput {
    public ConsoleOutput() { }

    public void gameTitle() {
        System.out.println("---------------WELCOME TO ALTERED EGO -------------");
        System.out.println("----- Fight Your Other Side or Suffer Forever -----");
        System.out.println("      Press 'P' to Play and 'X' to Exit: ");

    }

    public void characterChoices() {
        System.out.println("---------------Choose Your Character --------------");
        System.out.println("        [1] Cosmic Dassel");
        System.out.println("        [2] Khylle The Reaper");
        System.out.println("        [3] Earl");
        System.out.println("        [4] The One John");
        System.out.println("        [5] And Rew");
        System.out.println("        Enter choice (1, 2, 3, 4, 5): ");
    }
}
