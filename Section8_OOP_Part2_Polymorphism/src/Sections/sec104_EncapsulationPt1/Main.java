package Sections.sec104_EncapsulationPt1;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        // setting player health to 200 here causes the program to miss the no over 100
        // for player health set in player class
        // with the resotre health method.
        player.health = 200;

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

    }

}
