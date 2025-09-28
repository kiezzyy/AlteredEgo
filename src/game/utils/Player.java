package game.utils;

public class Player extends GameCharacter implements Skills{
    private int skillOneCooldown;
    private int skillTwoCooldown;
    private int skillThreeCooldown;

    public Player() {
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public Player(String characterName) {
        super(characterName);
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public int getSkillOneCooldown() {
        return skillOneCooldown;
    }

    public int getSkillTwoCooldown() {
        return skillTwoCooldown;
    }

    public int getSkillThreeCooldown() {
        return skillThreeCooldown;
    }

    public int getSkillTwoCooldown() {
        return skillTwoCooldown;
    }

    public void skillOne() {

    }

    public void skillTwo() {

    }

    public void skillThree() {

    }

}
