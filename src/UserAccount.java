import java.util.Scanner;

public class UserAccount extends Main {
    public static void existingAccount(Scanner sc) {
        System.out.print("Enter your account number: ");
        String accountNumber = sc.next();

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("Welcome back, " + account.getName() + "!");
            boolean logout = false;

            while (!logout) {
                System.out.println("Please choose an option:");
                System.out.println("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. Logout");
                System.out.print("Enter Your Choice: ");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Your current balance is: $" + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        if (depositAmount > 0) {
                            account.setBalance(account.getBalance() + depositAmount);
                            System.out.println("Deposit successful! Your new balance is: $" + account.getBalance());
                        } else {
                            System.out.println("Please enter a valid amount.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        if (withdrawAmount > 0 && account.getBalance() >= withdrawAmount) {
                            account.setBalance(account.getBalance() - withdrawAmount);
                            System.out.println("Withdrawal successful! Your new balance is: $" + account.getBalance());
                        } else {
                            System.out.println("Insufficient funds or invalid amount entered.");
                        }
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        logout = true;
                        break;
                    default:
                        System.out.println("Please choose a valid option.");
                }
            }
        } else {
            System.out.println("Account not found! Please create an account first.");
        }
    }
}
