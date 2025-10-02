package gameutils;

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

    public String getName() { return name; }

    public int getHitpoints() { return hitpoints; }

    public int getMana() { return mana; }

    public int setHitpoints(int newHitpoints) {
        this.hitpoints = newHitpoints;
    }

    public int setMana(int newMana) {
        this.mana = newMana;
    }

}
