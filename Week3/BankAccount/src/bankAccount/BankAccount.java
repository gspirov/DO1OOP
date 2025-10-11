package bankAccount;

public class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }

        return false;
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }

        return false;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public String displayInfo() {
        String info = String.format(
                "Account Holder: %s\nCurrent Balance: $%.2f",
                accountHolder,
                MoneyService.centsToWhole(this.balance)
        );

        String[] lines = info.split("\n");
        int width = 40;

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(width)).append("\n");

        for (String line : lines) {
            sb.append("| ").append(String.format("%-" + (width - 4) + "s", line)).append(" |\n");
        }

        sb.append("-".repeat(width));

        return sb.toString();
    }
}
