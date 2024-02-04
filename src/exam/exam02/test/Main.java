package exam.exam02.test;/*
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
interface Bank{

}

class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ano='" + ano + '\'' +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Main {

    private static final int max = 3;// 허용가능한 계좌 개수
    private static final Account[] accounts = new Account[max];
    private static final ArrayList<Account> accountList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    private static int idx = 0;

    public static void main(String[] args) {
        accountList.add(new Account("123", "홍길동", 1000));
        accountList.add(new Account("234", "박수동", 2000));
        accountList.add(new Account("345", "김길수", 3000));
//        accounts[0] = new Account("123", "홍길동", 1000);
//        accounts[1] = new Account("234", "박수등", 2000);
//        accounts[2] = new Account("345", "김길수", 3000);
        System.out.println(accountList);
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
            System.out.println("종료되었습니다.");
    }


    private static void createAccount() {
        if (idx == max) {
            System.out.println("생성 가능한 계좌의 범위를 초과했습니다.");
            return;
        }
        System.out.println("---------------------");
        System.out.println("계좌생성");
        System.out.println("---------------------");
        System.out.print("게좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금금액: ");
        int balance = scanner.nextInt();
        Account account = new Account(ano, owner, balance);
        accountList.add(account);
        idx++;
//        accounts[idx++] = account;
        System.out.println("계좌가 생성되었습니다.");
        System.out.println(accountList);
//        idx++;
        System.out.println(idx);
    }

    private static void viewAccountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
//        for (int i = 0; i < idx; i++) {
//            System.out.print(accounts[i].getAno() + " ");
//            System.out.print(accounts[i].getOwner() + " ");
//            System.out.print(accounts[i].getBalance() + " \n");
//        }
        for (int i = 0; i < idx; i++) {
            System.out.print(accountList.get(i).getAno()+ " ");
            System.out.print(accountList.get(i).getOwner()+ " ");
            System.out.print(accountList.get(i).getBalance()+ " \n");
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

        if (!(account == null)) {
            if (money > 0) {
                account.setBalance(account.getBalance() + money);
                System.out.println("결과:예금 성공");
            } else {
                System.out.println("0원 이상만 입급 가능");
            }
        } else {
            System.out.println("결과 : 계좌가 없습니다.");
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
                    System.out.println("출금 성공");
                } else {
                    System.out.println("결과 출금액이 가진돈보다 커서 실패");
                }
            } else { // 0원이나 마이너스 금액 입력시
                System.out.println("0원 이상만 출금ㄱ ㅏ능");

            }
        } else {
            System.out.println("계좌를 잘못 입려했다.");
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
            System.out.println(account.getBalance());
        } else {
            System.out.println("계좌가 없다.");
        }
    }

    private static Account findAccount(String ano) {
         Account account = null;
//        for (int i = 0; i < idx; i++) {
//            if (ano.equals(accounts[i].getAno())) {
//                account = accounts[i];
//                break;
//            }
//        }
//        return account;
        for (int i = 0; i < idx; i++) {
            if (accountList.get(i).getAno().equals(ano)){
                account = accountList.get(i);
                break;
            }
        }
        return  account;
    }
}
