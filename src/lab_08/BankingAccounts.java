package lab_08;

class LessBalanceException extends Exception {
    public LessBalanceException(double amount) {
        System.out.println("Less Balance");
    }
}

class Account{
    double balance;
    final int MIN_BALANCE = 500;

    public Account(){
        balance = MIN_BALANCE;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + " Rs. New balance: " + balance + " Rs");
    }

    public void withdraw(double amount) throws LessBalanceException{
        if(balance-amount < MIN_BALANCE){
            throw new LessBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " Rs. New balance: " + balance + "Rs");
    }
}

public class BankingAccounts {
    public static void main(String[] args) {
        Account A = new Account();
        Account B = new Account();

        A.deposit(1000.00);
        B.deposit(2000.00);

        try {
            A.withdraw(400.00);  // may fail if goes below ₹500
        } catch (LessBalanceException e) {
            System.out.println("Exception in A: " + e.getMessage());
        }
        try {
            A.withdraw(1600.00);  // may fail if goes below ₹500
        } catch (LessBalanceException e) {
            System.out.println("Exception in B: " + e.getMessage());
        }

    }
}
