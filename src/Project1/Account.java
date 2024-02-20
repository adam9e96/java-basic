package Project1;

/**
 * ===========================================================
 * fileName       : Account
 * date           : 2024-02-20
 * description    : Account DTO
 * ===========================================================
 */

public class Account {
    private int memberid; // 유저ID // FK 이자 PK
    private int accountType; // 완성
    private int accountNumber; // 완성
    private double balance; // 완성
    private double typeRate; // 수수료율 / 이자율


    public Account(int memberid, int accountType, int accountNumber, double balance, double typeRate) {
        this.memberid = memberid;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.typeRate = typeRate;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
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

    public double getTypeRate() {
        return typeRate;
    }

    public void setTypeRate(double typeRate) {
        this.typeRate = typeRate;
    }
}
