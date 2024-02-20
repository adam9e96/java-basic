package Project1;

import chapter22.hashSet_exam01.Member;
import chapter26_designPattern.mvc.AccountDAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountManager
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountManager implements IAccountManager{

    // Controll 역할을 하는 클래스
    private final Scanner stdIn;
    private final AccountDAO accountDAO;
    private ArrayList<Account> list;
    private Connection connection;


    public AccountManager() {
        this.accountDAO = new AccountDAO();  // AccountDAO 인스턴스 생성
        this.stdIn = new Scanner(System.in);
    }

    @Override
    public void addMember() {
           }

    @Override
    public void addAccount() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void viewHistory() {

    }

    @Override
    public void disConnect() {

    }

    @Override
    public boolean isMember(String memberId) {
        return false;
    }

    @Override
    public boolean isAccount(String accountId) {
        return false;
    }

    @Override
    public boolean isPart(Account account) {
        return false;
    }
}
