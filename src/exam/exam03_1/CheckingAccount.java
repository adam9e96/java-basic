package exam.exam03_1;/*
 * ===========================================================
 * fileName       : CheckingAccount
 * date           : 2024-01-30
 * description    : 대출계좌를 의미하는 클래스.
 출금 시에 수수료율을 계산해 추가로 잔액에서 뺍니다.
 * ===========================================================
 */

public class CheckingAccount extends BankAccount {
    private double chargeRate;  // 수수료율 (실수)

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double chargeRate) {
        super(accountNumber, accountHolder, balance);
        this.chargeRate = chargeRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - (amount + (amount * this.chargeRate)));
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    @Override
    public String toString() {
        return "계좌 번호: " + super.getAccountNumber() + " / 계좌 소유주 이름: " + super.getAccountHolder()
                + " / 현재 잔액: " + super.getBalance() + " / 수수료율: " + chargeRate + "\n";
    }

    public String getAccountNumber() {
        return super.getAccountNumber();
    }


    public String getAccountHolder() {
        return super.getAccountHolder();
    }


    public double getBalance() {
        return super.getBalance();
    }

}
