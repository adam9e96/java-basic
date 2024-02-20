package Project1;

/**
 * ===========================================================
 * fileName       : Account DTO
 * date           : 2024-02-20
 * description    : // 여기에 필요한 필드 멤버 모두 때려 박나요?
 * ===========================================================
 */
public class Account {
    private int accountId;
    private int accountType ;
    private int accountNumber;
    private double balance;
    private double interestRate;
    private double chargeRate;

    private String userId; // 외래키
    public Account(){

    }

    public Account(int accountId, int accountType, int accountNumber, double balance, double interestRate, double chargeRate, String userId) {
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(double chargeRate) {
        this.chargeRate = chargeRate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
