package game.utils;

public abstract class GameCharacter {
    private String name;
    private int hitpoints;
    private int mana;
    private int skillOneCooldown;
    private int skillTwoCooldown;
    private int skillThreeCooldown;

    // if no value passed int the constructor
    public GameCharacter() {
        this.name = "Unknown";
        this.hitpoints = 500;
        this.mana = 100;
    }

    public GameCharacter(String name) {
        this.name = name;
        this.hitpoints = 500;
        this.mana = 100;
    }


}
