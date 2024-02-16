package exam.exam03_1;
/*
 * ===========================================================
 * fileName       : BankAccount
 * date           : 2024-01-30
 * description    :
 * ===========================================================
 */

abstract public class BankAccount implements IBankAccount {
    private String accountNumber;   // 계좌 번호
    private String accountHolder;   // 계좌 소유주 이름
    private double balance; // 현재 잔액 (실수)

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//    @Override
//    public void deposit(String accountNumber, double amount) {
//
//    }
//
//    @Override
//    public void withdraw(String accountNumber, double amount) {
//
//    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
