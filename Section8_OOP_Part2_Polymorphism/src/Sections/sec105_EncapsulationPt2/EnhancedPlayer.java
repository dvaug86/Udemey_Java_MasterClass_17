package Sections.sec105_EncapsulationPt2;

public class EnhancedPlayer {

    // fields
    // instead of refactoring use rename symbol. ********************************
    private String fullName;
    private int healthPercentage;
    private String weapon;

    // overloaded constructor
    // this makes it a default player with only needing to add a name
    public EnhancedPlayer(String name) {
        this(name, 100, "sword");
    }

    // constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public String getFullName() {
        return fullName;
    }

    public String getWeapon() {
        return weapon;
    }

    // methods
    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
