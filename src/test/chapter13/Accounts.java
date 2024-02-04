package test.chapter13;

public class Accounts {
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    private int balance;
    Accounts(){

    }

    Accounts(int balance){
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (MIN_BALANCE< balance || MAX_BALANCE > balance){
        this.balance = balance;
        }
    }
}
