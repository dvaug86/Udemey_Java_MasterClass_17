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
        System.out.println("customer 1");
        Customer customer1 = new Customer("Tim", 1000, "tim@email.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());

        System.out.println("");

        System.out.println("customer 2");
        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        System.out.println("");

        Customer customer3 = new Customer("Joe", "joe@email.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());

    }
}
