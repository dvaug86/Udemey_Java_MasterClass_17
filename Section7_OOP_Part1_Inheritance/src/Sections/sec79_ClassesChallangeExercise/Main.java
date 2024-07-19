/*
 * Create a new class for a bank account
 * 
 * Create fields for account characteristics like:
 *      -> account number
 *      -> account balance
 *      -> customer name
 *      -> email
 *      -> phone number
 *
 * Create getters and setters for each field
 * 
 * create 2 additional methods
 *      -1. depositing funds into the account
 *      -2. withdraw funds for the account
 *              -customer should not be allowed to withdraw funds if that takes their balance negative
 *      
 */


package Sections.sec79_ClassesChallangeExercise;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
bobsAccount.setCustomerEmail("bobsEmail@email.com");
bobsAccount.setCustomerPhone("123-456-7890");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
    }
}
