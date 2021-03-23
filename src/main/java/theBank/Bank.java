package theBank;
import theUser.User;

//Bank class should be able to accept a single user at a time-
// have methods to credit and debit the user as well as show the user balance,
// should be a method to replace existing users with new one in the bank.//

public class Bank {
    private User user;

    public String setActiveUser (User user){
        this.user = user;
        return "User update successful";
    }

    public double getUserBalance(){
        return user.getBalance();
    }

    public String creditUser(double amount){
        double newBalance = user.getBalance()+ amount;
        this.user.setBalance(newBalance);
        return amount + " EUR you have added to your bank account";
    }

    public String debitUser( double amount){
        double newDebit = user.getBalance() - amount;
        this.user.setBalance(newDebit);
        return amount + " EUR you have taken out of your bank account";
    }


}
