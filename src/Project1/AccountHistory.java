package Project1;

/**
 * ===========================================================
 * fileName       : AccountHistory
 * date           : 2024-02-20
 * description    : AccountHistory DTO
 * ===========================================================
 */
public class AccountHistory {
    private int accountHistoryId;  // 거래내역번호
    private int transactionType;    // 거래 유형
    private double amount; // 거래 금액
    private double balanceAfter; // 거래 후 잔액
    private String accountId; //  accountId

    public AccountHistory(){}

    public AccountHistory(int transactionType, double amount, double balanceAfter, String accountId) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.accountId = accountId;
    }

    public AccountHistory(int accountHistoryId, int transactionType, double amount, double balanceAfter, String accountId) {
        this.accountHistoryId = accountHistoryId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.accountId = accountId;
    }

    public int getAccountHistoryId() {
        return accountHistoryId;
    }

    public void setAccountHistoryId(int accountHistoryId) {
        this.accountHistoryId = accountHistoryId;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(double balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "AccountHistory{" +
                "accountHistoryId=" + accountHistoryId +
                ", transactionType=" + transactionType +
                ", amount=" + amount +
                ", balanceAfter=" + balanceAfter +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}