package Sections.sec80_ConstructorsPt1;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("bobsEmail@email.com");
        bobsAccount.setCustomerPhone("(123)-456-7890");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
    }
}
