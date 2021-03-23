import theBank.Bank;
import theUser.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User("Madara Vanaga", 266263232, "vanaga@gmail.com", 9500, "556");
        //User user2 = new User("Ieva Bērziņa", 266263131, "berzina@gmail.com", 8500, "554");

        Bank bank = new Bank();
        bank.setActiveUser(user);
        bank.getUserBalance();
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Please write your pin:");
        String pinNumber2 = scanner.nextLine();
        pinNumber2 = "554";

        System.out.println("Welcome to SEB bank "+user2.fullName+"." +  "\nYour current balance in "+user2.getBalance()+ " EUR");
        String add = bank.creditUser(500.99);
        System.out.println(add);

        String take = bank.debitUser(0.99);
        System.out.println(take);
        System.out.println("Your current balance is "+ user2.getBalance()+ "EUR");*/

        System.out.println("\nWelcome to ARION BANK!" + " Please write your pin: ");

        String pinNumber = "556";

        while (!pinNumber.equals(556)) {
            pinNumber = scanner.nextLine();

            if (pinNumber.equals("556")) {
                break;
            } else {
                System.out.println("Incorrect PIN number, please try again.");
            } }
        System.out.println("Welcome to ARION BANK " + user.fullName +"\t account number " + user.accountNumber + " email:"+ user.email);
        System.out.println("Your current balance is " + user.getBalance()+ "EUR");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please choose your action: Add or Take ");
        String action = scanner.nextLine();

        switch (action){
            case "Add":
                String response = bank.creditUser( 200);
                System.out.println(response);
                System.out.println("Your current balance is " + bank.getUserBalance() + "EUR");
                break;
            case "Take":
                String withdraw = bank.debitUser(100.99);
                System.out.println(withdraw);
                System.out.println("Your current balance is " + bank.getUserBalance()+ "EUR");
                break;
            default:
                System.out.println("Log out");}

    }
}
