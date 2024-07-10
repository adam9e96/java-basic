package chapter13.account2;


/**
 * Account 클래스는 은행 계좌를 나타내며, 잔고를 관리합니다.
 * 잔고는 음수값이 될 수 없으며, 최대 백만원까지 저장할 수 있습니다.
 */
public class Account {
    /*
    은행 계좌 객체인 Account 객체는 잔고 (balance) 필드만 가지고 있음.
    balance 필드는 음수값이 될 수 없고, 최대 백만원까지 저장할 수 있음.
    외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
    0 ~ 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성.

    1) Setter Getter 이용.
    2) 0과 1,000,000은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용.

    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 1000000;

    3) Setter 의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지.
    4) 생성자는 빈 생성자와 int 값을 받는 생성자 2가지.
     */
    /**
     * 최소 잔고 값 (0원)
     */
    final int MIN_BALANCE = 0;
    /**
     * 최대 잔고 값 (1,000,000만원)
     */
    final int MAX_BALANCE = 1000000;
    /**
     * 현재 잔고
     */
    private int balance;

    /**
     * 기본 생성자.
     * 잔고를 0으로 초기화합니다.
     */
    Account() {
        this.balance = MIN_BALANCE;
    }

    /**
     * 주어진 잔고로 초기화하는 생성자
     *
     * @param balance 초기 잔고
     */
    Account(int balance) { // 생서
        this.balance = balance;
    }

    /**
     * 현재 잔고를 반환
     *
     * @return 현재 잔고
     */
    public int getBalance() {
        return balance;
    }

    /**
     * 잔고를 설정합니다.
     * 잔고는 0원 이상, 1,000,000원 이하이어야 합니다.
     *
     * @param balance 설정할 잔고
     */
    public void setBalance(int balance) {
        if (MIN_BALANCE <= balance && MAX_BALANCE >= balance) {
            this.balance = balance;
        } else {
            System.out.println("잔고는 0원 이상, 1,000,000원 이하여야 합니다.");
        }
    }
//    @Override
//    public String toString(){
//        return "현재 잔고: " + this.balance;
//    }

    // Override 연습

    /**
     * 계좌의 현재 상태를 문자열로 반환합니다.
     *
     * @return 계좌의 현재 상태를 나타내는 문자열
     */
    @Override
    public String toString() {
        return "Account{" +
                ", balance=" + balance +
                '}';
    }
}
