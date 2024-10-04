package Sections.sec105_EncapsulationPt2;

public class Main {
    public static void main(String[] args) {
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println(tim.getFullName() + "'s initial health is " + tim.healthRemaining());
    }
}
