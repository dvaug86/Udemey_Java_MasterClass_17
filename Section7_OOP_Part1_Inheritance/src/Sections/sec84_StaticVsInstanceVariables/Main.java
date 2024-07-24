package Sections.sec84_StaticVsInstanceVariables;

public class Main {
    public static void main(String[] args) {
        
        // System.out.println(Dog.genus); //no instance of dog needs to exist in order to access a static variable.

        Dog rex = new Dog("rex"); //create instance (rex)
        Dog fluffy = new Dog("fluffy"); //create instance (fluffy);

        rex.printName();//prints fluffy
        fluffy.printName(); //prints fluffy.

        //both instances print fluffy b.c name is static in the dog class. when object dog gets a name it is the same 
        //name through out every instance of dog. when a new dog is created with a new name it changes the name to that name
        //for all the old dogs.

        //with the new code in Dog where it is no longer a static variable. The result of the code is how we want it.
    }
}
