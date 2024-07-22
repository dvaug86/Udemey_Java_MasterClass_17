package Sections.sec81_ConstructorsPt2;

public class Main {
    
    public static void main(String[] args) {

        // we can knockout everything we did with the setter in one bit of code below.
        // Account bobsAccount = new Account("12345", 1000.00, "Bob Brown",
        //         "bobsEmail@email.com", "(123)-456-7890");


        //This is for part 2 of constructors:
        Account bobsAccount = new Account();

                System.out.println(bobsAccount.getNumber());
                System.out.println(bobsAccount.getBalance());
        // Account bobsAccount = new Account();
        // bobsAccount.setNumber("12345");
        // bobsAccount.setBalance(1000.00);
        // bobsAccount.setCustomerName("Bob Brown");
        // bobsAccount.setCustomerEmail("bobsEmail@email.com");
        // bobsAccount.setCustomerPhone("(123)-456-7890");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());

    }
}
