package Project1;

/**
 * ===========================================================
 * fileName       : AccountHistory
 * date           : 2024-02-20
 * description    : AccountHistory DTO
 * ===========================================================
 */
public class AccountHistory {
    private int accountHistoryId;
    private int transactionType;
    private int accountId;
    private double Transaction_amount;

    public AccountHistory(int accountHistoryId, int transactionType, int accountId, double transaction_amount) {
        this.accountHistoryId = accountHistoryId;
        this.transactionType = transactionType;
        this.accountId = accountId;
        Transaction_amount = transaction_amount;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getTransaction_amount() {
        return Transaction_amount;
    }

    public void setTransaction_amount(double transaction_amount) {
        Transaction_amount = transaction_amount;
    }
}
