import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Main {
    // HashMap to store account information (accountNumber -> Account object)
    static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to Mana Bank!!!");
            System.out.println("Please select an option below to continue:");
            System.out.println("1. Existing Account\n2. Create an Account\n3. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    UserAccount.existingAccount(sc);
                    break;
                case 2:
                    CreateAccount.createAccount(sc);
                    break;
                case 3:
                    System.out.println("Thank you for visiting! Have a great day.");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose a valid option!!!");
            }
        }
        sc.close();
    }
}
