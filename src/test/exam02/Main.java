package test.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int max = 3; // 허용 가능한 계좌 개수
    private static final Account[] accounts = new Account[max];
    private static final Scanner scanner = new Scanner(System.in);
    private static int idx = 0; // 생성된 계좌 수


    public static void main(String[] args) {

        accounts[0] = new Account("123", "홍길동", 1000);
        accounts[1] = new Account("234", "박수등", 2000);
        accounts[2] = new Account("345", "김길수", 3000);
        idx += 3;
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1 -> createAccount();
                case 2 -> viewAccountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> viewAccount();
                case 6 -> run = false;
            }

        }
        System.out.println("종료");
    }

    private static void createAccount() {
        if (idx == max) {
            System.out.println("생성 가능한 계좌의 범위를 초과했습니다.");
            return;
        }
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        Account newAccount = new Account(ano, owner, balance);
        accounts[idx++] = newAccount;
        System.out.println("계좌가 생성되었습니다.");
        System.out.println(Arrays.toString(accounts));
        System.out.println(idx);
    }

    private static void viewAccountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for (int i = 0; i < idx; i++) {
            System.out.print(accounts[i].getAno() + " ");
            System.out.print(accounts[i].getOwner() + " ");
            System.out.println(accounts[i].getBalance() + " ");
        }
    }

    private static void deposit() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if (account != null) {
            if (money > 0) {
                account.setBalance(account.getBalance() + money);
                System.out.println("결과 : 예금 성공");
            } else {
                System.out.println("0원 이상만 입금가능합니다.");
            }
        } else {
            System.out.println("계좌를 잘못 입력하였습니다.");
        }
    }


    private static void withdraw() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        if (account != null) {
            if (money > 0) {
                if (account.getBalance() > money) {
                    account.setBalance(account.getBalance() - money);
                    System.out.println("결과 : 출금이 성공되었습니다.");
                } else {
                    System.out.println("결과 : 잔액보다 출금액이 커서 출금에 실패했습니다.");
                }
            } else {
                System.out.println("0원 이상만 출금가능합니다.");
            }
        } else {
            System.out.println("계좌를 잘못입력하였습니다.");
        }
    }

    private static void viewAccount() {
        System.out.println("--------------");
        System.out.println("조회");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        Account account = findAccount(ano);
        if (account != null) {
            System.out.print(account.getAno() + " ");
            System.out.print(account.getOwner() + " ");
            System.out.println(account.getBalance() + " ");
        } else {
            System.out.println("결과: 계좌가 없습니다.");
        }
    }


    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < idx; i++) {
            if (ano.equals(accounts[i].getAno())) {
                account = accounts[i];
                break;
            }
        }
        return account;
    }
}


