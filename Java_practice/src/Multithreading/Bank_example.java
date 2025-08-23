package Multithreading;

class BankAccount {
    private int balance = 1000;
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited ₹" + amount + " | Balance: ₹" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdraw ₹" + amount + " | Balance: ₹" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to withdraw ₹" + amount + " | Insufficient funds!");
        }
    }
}

public class Bank_example {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.deposit(500);
        }, "Depositor");

        Thread t2 = new Thread(() -> {
            account.withdraw(700);
        }, "Withdrawer");

        Thread t3 = new Thread(() -> {
            account.withdraw(1000);
        }, "Withdrawer-2");

        t1.start();
        t2.start();
        t3.start();
    }
}