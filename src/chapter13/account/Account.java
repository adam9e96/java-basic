package chapter13.account;


// 접근 제어자 연습

/**
 * Account 클래스는 은행 계좌를 나타내며, 계좌 번호, 이름, 잔액을 관리합니다.
 * 필드는 적절한 접근 제어자를 사용하여 캡슐화합니다.
 */
public class Account {
    // 필드가 모두 private 로 선언, 클래스 내부에서만 사용 가능.
    /**
     * 계좌 번호 (private로 선언되어 클래스 내부에서만 접근 가능)
     */
    private int regNumber;
    /**
     * 계좌 소유자 이름 (default 접근 제어자로 같은 패키지 내에서만 접근 가능)
     */
    String name;
    /**
     * 계좌 잔액 (private로 선언되어 클래스 내부에서만 접근 가능)
     */
    private int balance;


    // 접근자와 설정자를 사용. regNumber 필드에 관한 내용은 없어서 클래스 외부에서 접근, 설정이 안됨..

    /**
     * 계좌 소유자의 이름을 반환합니다.
     *
     * @return 계좌 소유자의 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 계좌 소유자의 이름을 설정합니다.
     *
     * @param name 계좌 소유자의 이름
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 계좌 잔액을 반환합니다.
     *
     * @return 계좌 잔액
     */
    public int getBalance() {
        return balance;
    }

    /**
     * 계좌 잔액을 설정합니다. 잔액은 0원 이상이어야 합니다.
     *
     * @param balance 계좌 잔액
     */
    public void setBalance(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("0원 미만은 넣을 수 없습니다.");
        }
    }

    /**
     * 계좌 번호를 반환합니다.
     *
     * @return 계좌 번호
     */
    public int getRegNumber() {
        return regNumber;
    }

    /**
     * 계좌 번호를 설정합니다.
     *
     * @param regNumber 계좌 번호
     */
    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }
}
