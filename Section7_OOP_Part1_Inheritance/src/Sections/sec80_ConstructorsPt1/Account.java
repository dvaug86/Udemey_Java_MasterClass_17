package Sections.sec80_ConstructorsPt1;

public class Account { // This is the class declaration
    private String number;

    private double balance;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

//we are creating our own constructor here
public Account() {
    System.out.println("Empty constructor called");
}

//we are creating a constructor here with arguments:
public Account(String number, double balance, String customerName, String email, String phone ){
    System.out.println(" Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    customerEmail = email;
    customerPhone = phone;
}

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double withdrawlAmount) {
        if (balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawlAmount;
            System.out
                    .println("Withdrawl of $" + withdrawlAmount + " processed. Remaining balance is $" + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // public Account() { // this is the constructor declaration

        // Constructor code is code to be executed as the object is createde

    // }
}
