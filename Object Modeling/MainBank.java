class Customer {
    private String name;
    private Bank bank;

    public Customer(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public Bank getBank() {
        return bank;
    }

    public void viewBalance() {
        System.out.println("Viewing balance for " + name + " at " + bank.getName());
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void openAccount(Customer customer) {
        System.out.println("Opening account for " + customer.getName() + " at " + name);
    }
}

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer customer = new Customer("John Doe", bank);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}
