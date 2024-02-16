package exam.exam03_1;
/*
 * ===========================================================
 * fileName       : SavingAccount
 * date           : 2024-01-30
 * description    : 예금계좌를 의미하는 클래스, BankAccount 를 상속받음
 * ===========================================================
 */

public class SavingAccount extends BankAccount {
    // 입금 시에 이자율을 계산해 추가로 잔액을 더함
    private double interestRate;    // 이자율 (실수)

    public SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount + ((amount * this.interestRate) / 100));
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    @Override
    public String toString() {
        return "계좌 번호: " + super.getAccountNumber() + " / 계좌 소유주 이름: "
                + super.getAccountHolder() + " / 현재 잔액: " + super.getBalance() +
                " / 이자율: " + interestRate + "\n";
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
