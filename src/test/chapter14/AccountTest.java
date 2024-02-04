package test.chapter14;

import chapter13.test.A;

import java.util.Arrays;
import java.util.Scanner;

public class AccountTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Account[] accountArray = new Account[100];

    public static void main(String[] args) {
        // 테스트 할 때 값 대입을 생략하는 코드.
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
    }

    private static void createAccount() {
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금금액: ");
        int balance = scanner.nextInt();
//        Account newAccount =
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account(ano, owner, balance);
                System.out.println("계좌가 생성되었습니다.");
                System.out.println(Arrays.toString(accountArray));
                System.out.println(accountArray[i]);
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("-----------------");
        System.out.println("계좌목록");
        System.out.println("-----------------");
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.println("계좌 번호 : " + accountArray[i].getAno());
                System.out.println("계좌 주 : " + accountArray[i].getOwner());
                System.out.println("금액 : " + accountArray[i].getBalance());
            } else {
                break;
            }
        }
    }

    private static void deposit() {
        System.out.println("------------------");
        System.out.println("예금");
        System.out.println("------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        account.setBalance(account.getBalance() + money);
//        for (int i = 0; i < accountArray.length; i++) {
//            if (accountArray[i] != null) {
//                if (ano.equals(accountArray[i].getAno())) {
//                    accountArray[i].setBalance(accountArray[i].getBalance() + money);
//                    System.out.println("결과 : 예금이 성공했습니다.");
//                }
//
//            } else {
//                break;
//            }
//        }
    }

    private static void whitdraw() {
        System.out.println("-------------------");
        System.out.println("출금");
        System.out.println("-------------------");
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
//            }
//        }

    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)) {
                    account =accountArray[i];
                }
            } else {
                break;
            }
        }
        return account;
    }
}
