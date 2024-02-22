package Project1;

/**
 * ===========================================================
 * fileName       : AccountHistory
 * date           : 2024-02-20
 * description    : AccountHistory DTO
 * ===========================================================
 */
public class AccountHistory {
    private int accountHistoryId;  // 거래내역 일련 번호
    private int transactionType;    // 거래유형
    private double amount;
    private double balanceAfter;
    private String accountId;

    public AccountHistory(){}

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