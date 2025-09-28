package game.utils;

public abstract class GameCharacter {
    private String name;
    private int hitpoints;
    private int mana;

    // if no value passed in the constructor
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
