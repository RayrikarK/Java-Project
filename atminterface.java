# Java-Project
#ATM Interface
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;

        System.out.println("Welcome to the ATM!");
        System.out.println("Your current balance is $" + balance);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawalAmount = scanner.nextDouble();

                    if (withdrawalAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawalAmount;
                        System.out.println("Successfully withdrew $" + withdrawalAmount);
                        System.out.println("Your new balance is $" + balance);
                    }
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Successfully deposited $" + depositAmount);
                    System.out.println("Your new balance is $" + balance);
                    break;
                case 3:
                    System.out.println("Your current balance is $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}

