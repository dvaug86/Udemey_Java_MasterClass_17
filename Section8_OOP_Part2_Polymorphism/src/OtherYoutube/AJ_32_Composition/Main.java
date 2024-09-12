package OtherYoutube.AJ_32_Composition;

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Spike", 2);
        Cat myCat = new Cat("Fluffy", 3);

        myDog.speak();
        myCat.speak();
        System.out.println();

        Person person1 = new Person("Andrew");
        Person person2 = new Person("Max");

        person1.setPet(myDog);
        person2.setPet(myCat);

        System.out.println(person1.getName() + " has a pet named " + person1.getPet().getName());
        System.out.println(person2.getName() + " has a pet named " + person2.getPet().getName());
    }
}
