package Sections.sec84_StaticVsInstanceVariables;

public class Dog {

    static String genus = "Canis";

    void printData(){
        Dog d = new Dog();
        System.out.println(d.genus); //confusing

        //It is considered best practice to  use the Class name and not a reference variable to access a static varible
        System.out.println(Dog.genus); //clearer
        //this makes it clear that the variable is associated iwth the class and not stored with the instance.
    }

}
