package Sections.sec81_ConstructorsPt2;

public class Account {
    private String number;

    private double balance;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

//we are creating our own constructor here
public Account() {
    this("56789", 2.50, //this() needs to be the first line in the constructor when calling another constructor
    "Default name", "Default address", "Default phone");
    System.out.println("Empty constructor called");
}

//we are creating a constructor here with arguments:
public Account(String number, double balance, String customerName, String email, String phone ){
    System.out.println(" Account constructor with parameters called");
    this.number = number; //if the field name is the same as parameter we use this before field name i.e this.number = number
    this.balance = balance;
    this.customerName = customerName;
    customerEmail = email;
    customerPhone = phone;
}



    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone );
    // this.customerName = customerName;
    // this.customerEmail = customerEmail;
    // this.customerPhone = customerPhone;
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
}
