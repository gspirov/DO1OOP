package bankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice Johnson", 500);
        Scanner sc = new Scanner(System.in);

        System.out.printf(account.displayInfo());

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println(BankAccountOperation.DEPOSIT + " - Deposit");
            System.out.println(BankAccountOperation.WITHDRAW + " - Withdraw");
            System.out.println(BankAccountOperation.CHECK_BALANCE + " - Check Balance");
            System.out.println("0 - Exit");
            System.out.print("Enter choice: ");

            int operation = sc.nextInt();

            if (operation == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (operation == BankAccountOperation.CHECK_BALANCE) {
                System.out.println(account.getBalance());
                break;
            }

            double amount = 0.0;
            boolean isValidMoneyInput = false;

            while (!isValidMoneyInput) {
                System.out.print("Enter amount: ");

                if (sc.hasNextDouble()) {
                    amount = sc.nextDouble();
                    if (amount > 0) {
                        isValidMoneyInput = true;
                    } else {
                        System.out.println("Amount must be positive.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                }
            }

            switch (operation) {
                case BankAccountOperation.DEPOSIT:
                    if (account.deposit(MoneyService.wholeToCents(amount))) {
                        System.out.println("Deposited Successfully.");
                    } else {
                        System.out.println("Deposit failed.");
                    }

                    break;

                case BankAccountOperation.WITHDRAW:
                    if (account.withdraw(MoneyService.wholeToCents(amount))) {
                        System.out.println("Withdraw successfully.");
                    } else {
                        System.out.println("Withdraw failed.");
                    }

                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println(account.displayInfo());
        }

        sc.close();
    }
}
