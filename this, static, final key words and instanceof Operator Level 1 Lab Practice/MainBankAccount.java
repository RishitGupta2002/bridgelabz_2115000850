class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "123456789", 1000.00);
        BankAccount account2 = new BankAccount("Bob", "987654321", 2000.00);

        account1.displayDetails();
        account2.displayDetails();
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
