package Sections.sec89_InheritancePt2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog myDog = new Dog();
        doAnimalStuff(myDog, "fast");

    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _");
    }
}
