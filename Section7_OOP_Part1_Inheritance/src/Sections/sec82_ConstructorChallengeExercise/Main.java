/*
 * Create a new classs, called Customer, with three fields
 *      1. name
 *      2. credit limit
 *      3. email address
 * 
 * Create the getter methods only for each field. you don't need to create the setters.
 * 
 * Create 3 constructors for this class:
 *      -> 1. create a constructor for all three fields which should assign arguments directly to the instance fields
 *  
 *      -> 2. Create a no-args constructor that calls another constructor, passing some literal values for each argument.
 * 
 *      -> 3. Create a constructor with just the name and email parameters, which also calls another constructor.
 */



package Sections.sec82_ConstructorChallengeExercise;

public class Main {
    public static void main(String[] args) {
        Customer joeShmoo = new Customer();
        System.out.println("name: " + joeShmoo.getName() + " email: " + joeShmoo.getEmailAddress() + " His Credit: " + joeShmoo.getCreditLimit());
    }
}
