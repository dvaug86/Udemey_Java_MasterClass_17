package Sections.sec104_EncapsulationPt1;
//This will be the nonecapsulated class

// class:
// player
// ---------------------------------
// fields:
// name:String
// health: int
// weapon: String
// ----------------------------------
// methods:
// loseHealth(int damage)
// restoreHealth(int extraHealth)
// healthRemaining(): int

public class Player {

    // fields
    // notice they are public and not private like we have been doing.
    public String name;
    public int health;
    public String weapon;

    // methods
    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }

}
