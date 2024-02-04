package chapter13.account2;

public class Account {
    /*
    은행 계좌 객체인 Account 객체는 잔고 (balance) 필드만 가지고 있음.
    balance 필드는 음수값이 될 수 없고, 최대 백만원까지 저장할 수 있음.
    외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
    0 ~ 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성.

    1) Setter와 Getter를 이용.
    2) 0과 1,000,000은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용.

    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;

    3) Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지.
    4) 생성자는 빈 생성자와 int 값을 받는 생성자 2가지.
     */
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;
    private int balance;

    Account() {

    }

    Account(int balance) { // 생서
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (MIN_BALANCE < balance || MAX_BALANCE > balance) {
            this.balance = balance;
        }
//        this.balance = (MIN_BALANCE < balance || MAX_BALANCE > balance)?this.balance : balance;
    }
//    @Override
//    public String toString(){
//        return "현재 잔고: " + this.balance;
//    }

    // Override 연습
    @Override
    public String toString() {
        return "Account{" +
                ", balance=" + balance +
                '}';
    }
}
