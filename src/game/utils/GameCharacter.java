package game.utils;

public abstract class GameCharacter {
    String name;
    int health;
    int mana;

    public GameCharacter(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public abstract void displayStatus();
}
