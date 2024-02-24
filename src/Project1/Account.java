package Project1;

/**
 * ===========================================================
 * fileName       : Account
 * date           : 2024-02-20
 * description    : Account DTO
 * 테이블에 저장할 데이터를 미리 담아 놓는 용도
 * ===========================================================
 */

public class Account {
    private String userId; // 유저ID
    private int accountType; // 계좌 유형 (1 : 예금계좌, 2 : 대출계좌)
    private String accountId; // 계좌 번호
    private double balance; // 잔액
    private double typeRate; // 수수료율 / 이자율

    public Account(){}

    public Account(int accountType, String accountId, double balance, double typeRate) {
        this.accountType = accountType;
        this.accountId = accountId;
        this.balance = balance;
        this.typeRate = typeRate;
    }

    public Account(String userId, int accountType, String accountId, double balance, double typeRate) {
        this.userId = userId;
        this.accountType = accountType;
        this.accountId = accountId;
        this.balance = balance;
        this.typeRate = typeRate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTypeRate() {
        return typeRate;
    }

    public void setTypeRate(double typeRate) {
        this.typeRate = typeRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", accountType=" + accountType +
                ", accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", typeRate=" + typeRate +
                '}';
    }
}
