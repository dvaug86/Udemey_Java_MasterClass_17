package OtherYoutube.AJ_32_Composition;

public class Person {
    String name;
    Pet pet; // this is composition it creates a 'has a' relationship

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

}
