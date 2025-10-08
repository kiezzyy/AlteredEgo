package gameutils;

public class Enemy extends Player implements Skills {

    public Enemy() {
        super();
    }

    public Enemy(String characterName) {
        super(characterName);
    }

    public Enemy(String characterName, String skillOneName, String skillTwoName, String skillThreeName) {
        super(characterName, skillOneName, skillTwoName, skillThreeName);
    }

}
