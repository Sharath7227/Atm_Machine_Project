import java.util.Scanner;

public class CreateAccount extends Main {
    public static void createAccount(Scanner sc) {
        System.out.print("Enter a new account number: ");
        String newAccountNumber = sc.next();

        if (accounts.containsKey(newAccountNumber)) {
            System.out.println("Account number already exists! Please choose a different number.");
        } else {
            System.out.print("Enter your name: ");
            String name = sc.next();

            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = sc.nextDouble();

            if (initialDeposit > 0) {
                Account newAccount = new Account(name, initialDeposit);
                accounts.put(newAccountNumber, newAccount);
                System.out.println("Account created successfully! Welcome, " + name + ". Your current balance is: $" + initialDeposit);
            } else {
                System.out.println("Invalid deposit amount! Account not created.");
            }
        }
    }
}
