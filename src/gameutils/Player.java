package gameutils;

public class Player extends GameCharacter implements SKills {
    private String skillOneName;
    private String skillTwoName;
    private String skillThreeName;
    private int skillOneCooldown;
    private int skillTwoCooldown;
    private int skillThreeCooldown;

    public Player() {
        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }

    public Player(String characterName, String skillOneName, String skillTwoName, String skillThreeName) {
        super(characterName);

        this.skillOneCooldown = 0;
        this.skillTwoCooldown = 0;
        this.skillThreeCooldown = 0;
    }
    public String getSkilOneName() { return skillOneName; }

    public String getSkillTwoName() { return skillTwoName; }

    public int getSkillOneCooldown() {
        return skillOneCooldown;
    }

    public int getSkillTwoCooldown() {
        return skillTwoCooldown;
    }

    public int getSkillThreeCooldown() {
        return skillThreeCooldown;
    }

    public int basicAttack() {
        int damage = random.nextInt(10, 20);
        printWithDelay(getName()+ "used basic attack worth " +damage+ " of damage!");
        return damage;
    }

    public int skillOne() {
        int damage = random.nextInt(20, 50);
        System.out.println(getName()+ "used Skill One: " +getSkillOneName()+ " worth " +damage+ " of damage!");
        return damage;
    }

    public int skillTwo() {

    }

    public int skillThree() {

    }

}
