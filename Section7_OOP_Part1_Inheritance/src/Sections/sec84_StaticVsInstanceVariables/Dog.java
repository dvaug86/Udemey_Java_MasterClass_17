package Sections.sec84_StaticVsInstanceVariables;

public class Dog {

    // static String genus = "Canis";

    // void printData(){
    //     Dog d = new Dog();
    //   //  System.out.println(d.genus); //confusing and vsCode has issues with it.

    //     //It is considered best practice to  use the Class name and not a reference variable to access a static varible
    //     System.out.println(Dog.genus); //clearer
    //     //this makes it clear that the variable is associated iwth the class and not stored with the instance.
    // }
/*
This is an example of how static variables should not be used as this causes every instance of name to change in the main class
private static String name;
public Dog(String name){
    Dog.name = name;
}
public void printName(){
    System.out.println("name = " + name); // using Dog.name would have made this code less confusing.
}
*/
private String name; // field declared
public Dog(String name){
    this.name = name;
}

public void printName(){
    System.out.println("name = " + name);
}
}
