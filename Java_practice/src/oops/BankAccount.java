package oops;

public class BankAccount {
	private double balance = 0;

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited = " + amt);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    private void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            for(int i=0;i<(int)amt;i++) {
            	System.out.println("*");  
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);  
        account.showBalance();
    }

}
