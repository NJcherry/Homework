package practice_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Сумма пополнения должна быть больше нуля"
            );
        }

        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Сумма снятия должна быть больше нуля"
            );
        }

        if (amount > this.balance) {
            throw new IllegalArgumentException(
                    "Недостаточно средств на счете"
            );
        }

        this.balance = this.balance - amount;
        return this.balance;
    }

    void printBalance() {
        System.out.println("Баланс средств клиента " + this.owner + ": " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mr Smith", 1500.25);

        account.printBalance();

        account.deposit(250.75);

        account.printBalance();

        account.withdraw(100.50);

        account.printBalance();
    }
}
