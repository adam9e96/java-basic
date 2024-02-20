package Project1;

/**
 * ===========================================================
 * fileName       : Account
 * date           : 2024-02-20
 * description    : Account DTO
 * ===========================================================
 */

public class Account {
    private int accountId;
    private int accountType;
    private int accountNumber;
    private double balance;
    private Double interestRate;
    private Double chargeRate;
    private String userId;

    // 기본 생성자
    public Account() {
    }

    // 매개변수가 있는 생성자
    public Account(int accountId, int accountType, int accountNumber, double balance, Double interestRate, Double chargeRate, String userId) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.chargeRate = chargeRate;
        this.userId = userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(Double chargeRate) {
        this.chargeRate = chargeRate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // toString() 메소드
    @Override
    public String toString() {
        return "AccountDTO{" +
                "accountId=" + accountId +
                ", accountType=" + accountType +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", chargeRate=" + chargeRate +
                ", userId='" + userId + '\'' +
                '}';
    }
}
