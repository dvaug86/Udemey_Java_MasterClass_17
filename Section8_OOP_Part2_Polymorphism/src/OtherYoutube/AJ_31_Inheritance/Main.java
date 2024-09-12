package OtherYoutube.AJ_31_Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Dog myDog = new Dog("Spike", 2);
        Cat myCat = new Cat("Fluffy", 3);

        myDog.speak();
        myCat.speak();
        System.out.println();
    }
}
