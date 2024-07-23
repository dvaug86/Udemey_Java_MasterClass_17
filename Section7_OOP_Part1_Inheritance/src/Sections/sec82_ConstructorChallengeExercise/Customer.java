package Sections.sec82_ConstructorChallengeExercise;

public class Customer {
    private String name;
    private double creditLimit; // i set it as int they have it as double.
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Customer() {
        this("nobody", "nobody@email.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 1000, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
