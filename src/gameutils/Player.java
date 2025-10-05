package gameutils;
import java.util.*;

public class Player extends GameCharacter implements Skills {
    public Random random = new Random();
    public ConsoleOutput CO = new ConsoleOutput();
    private String skillOneName;
    private String skillTwoName;
    private String skillThreeName;
    private int skillOneCooldown;
    private int skillTwoCooldown;
    private int skillThreeCooldown;

    public Player() {
        super("Unknown");
        this.skillOneName = "Unknown";
        this.skillTwoName = "Unknown";
        this.skillThreeName = "Unknown";
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public Player(String characterName) {
        super(characterName);
        this.skillOneName = "Unknown";
        this.skillTwoName = "Unknown";
        this.skillThreeName = "Unknown";
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public Player(String characterName, String skillOneName, String skillTwoName, String skillThreeName) {
        super(characterName);
        this.skillOneName = skillOneName;
        this.skillTwoName = skillTwoName;
        this.skillThreeName = skillThreeName;
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public String getSkillOneName() {
        return skillOneName;
    }

    public void setSkillOneGame(String skillOneName) {
        this.skillOneName = skillOneName;
    }

    public void setSkillTwoName(String skillTwoName) {
        this.skillTwoName = skillTwoName;
    }

    public void setSkillThreeName(String skillThreeName) {
        this.skillThreeName = skillThreeName;
    }

    public String getSkillTwoName() {
        return skillTwoName;
    }

    public String getSkillThreeName() {
        return skillThreeName;
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

    public void setSkillOneCoolDown() {
        this.skillOneCooldown++;
    }

    public void setSkillTwoCooldown() {
        this.skillTwoCooldown++;
    }

    public void setSkillThreeCooldown() {
        this.skillThreeCooldown++;
    }

    public int basicAttack() {
        int damage = random.nextInt(100, 201);
        CO.printWithDelay("\n"+getName()+ " used Basic Attack: worth " +damage+ ", worth of damage!", 150);
        return damage;
    }

    public int skillOne() {
        int damage = random.nextInt(20, 50);
        CO.printWithDelay("\n"+getName()+ " used Skill One: " +getSkillOneName()+ ", worth " +damage+ " of damage!", 150);
        return damage;
    }

    public int skillTwo() {
        int damage = random.nextInt(20, 50);
        CO.printWithDelay("\n"+getName()+ " used Skill Two: " +getSkillTwoName()+ ", worth " +damage+ " of damage!", 150);
        return damage;
    }

    public int skillThree() {
        int damage = random.nextInt(20, 50);
        CO.printWithDelay("\n"+getName()+ " used Skill Three: " +getSkillThreeName()+ ", worth " +damage+ " of damage!", 150);
        return damage;
    }

}
