package chapter13.account2;

import test.chapter13.Accounts;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(2000000); // 200백만원
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance()); // 300000

        Account account2 = new Account(20000);
        System.out.println("현재 잔고: " + account2.getBalance()); // 20000

        System.out.println(account);
        Account aCcounts = new Account(-10000); // 생성자를 이용하면 음수가능하긴함. setter를 안거침
        System.out.println(aCcounts.getBalance());

    }
}
