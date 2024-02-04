package test.chapter14.account;

import chapter13.test.A;
import chapter15.circle.Pizza;
import test.chapter14.Account;

import java.util.Scanner;

public class AccountTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Account[] accountArray = new Account[100];

    public static void main(String[] args) {
        accountArray[0] = new Account("123", "홍길동", 1000);
        accountArray[1] = new Account("234", "박수등", 2000);
        accountArray[2] = new Account("345", "김무식", 3000);

        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                whitdraw();
            } else if (selectNo == 5) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("---------------");
        System.out.println("계좌생성");
        System.out.println("---------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌 주: ");
        String owner = scanner.next();
        System.out.print("초기입금금액: ");
        int balance = scanner.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                System.out.println(accountArray[i]);
                break;
            }
        }
    }

    private static void accountList() {
        for (int i = 0; i < accountArray.length; i++) {
//        Account account = accountArray[i];
            if (accountArray[i] != null) {
                System.out.println("계좌번호: " + accountArray[i].getAno());
                System.out.println("계좌주: " + accountArray[i].getOwner());
                System.out.println("초기금액: " + accountArray[i].getBalance());
            } else {
                break;
            }
        }
    }

    private static void deposit() {
        System.out.println("----------------------");
        System.out.println("예금");
        System.out.println("----------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        account.setBalance(account.getBalance() + money);
//        for (int i = 0; i < accountArray.length; i++) {
////            Account account = accountArray[i];
//            if (accountArray[i] != null) {
//                if (ano.equals(accountArray[i].getAno())) {
//                    accountArray[i].setBalance(accountArray[i].getBalance() + money);
//                }
//            } else {
//                break;
//            }
//        }
    }

    private static void whitdraw() {
        System.out.println("------------------");
        System.out.println("출금");
        System.out.println("------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        account.setBalance(account.getBalance() - money);


//        for (int i = 0; i < accountArray.length; i++) {
//            if (accountArray[i] != null) {
//                if (ano.equals(accountArray[i].getAno())) {
//                    accountArray[i].setBalance(accountArray[i].getBalance() - money);
//                }
//            } else {
//                break;
//            }
//        }
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (ano.equals(accountArray[i].getAno())) {
                    account = accountArray[i];
                }
            } else {
                break;
            }
        }
        return account;
    }

}