package theUser;

// User class should have basic information like account number, balance, name, gender etc. //

public class User {
    public String fullName;
    public double accountNumber;
    public String email;
    private double balance;
    private String pinNumber;

    public User(String fullName, double accountNumber, String email, double balance, String pinNumber){
    this.fullName = fullName;
    this.accountNumber = accountNumber;
    this.email = email;
    this.balance = balance;
    this.pinNumber = pinNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    }
