package Sections.sec90_InheritancePt3;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "huge", 400);
        doAnimalStuff(animal, "slow");

        Dog myDog = new Dog();
        doAnimalStuff(myDog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast" );

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer" );
        doAnimalStuff(retriever, "slow");
    
        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");
    }

    

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _");
    }
}
