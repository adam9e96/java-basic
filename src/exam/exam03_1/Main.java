package exam.exam03_1;
/*
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-30
 * description    :
 `while` 문과 `Scanner`를 이용해서 키보드로 입력된 데이터로 계좌생성, 계좌목록, 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성
 * ===========================================================
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<BankAccount> accountList = new ArrayList<>();
// String accountNumber, String accountHolder, double balance, double chargeRate
    public static void main(String[] args) {
        accountList.add( new CheckingAccount("3033","김홍철",10000,10));
        accountList.add( new SavingAccount("3034","김문도",10000,10));

        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            switch (selectNo) {
                case 1 -> createAccount();  // 계좌 생성
                case 2 -> viewAccountList(); // 계좌목록
                case 3 -> deposit(); // 예금
                case 4 -> withdraw(); // 출금
                case 5 -> viewAccount(); // 조회
                case 6 -> run = false;
            }
        }
        System.out.println("종료되었습니다.");
    }


    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");
        System.out.print("계좌종류: (1: 예금계좌, 2: 대출계좌): ");
        int selectAccount = scanner.nextInt();  // 1혹은 2의 값을 받음

        if (selectAccount == 1) {
            BankAccount savingAccount = null;
            System.out.print("계좌번호: ");
            String accountNumber = scanner.next();
            System.out.print("계좌주: ");
            String accountHolder = scanner.next();
            System.out.print("이자율: ");
            double interestRate = scanner.nextDouble();
            System.out.print("초기입금액: ");
            double balance = scanner.nextDouble();

            savingAccount = new SavingAccount(accountNumber, accountHolder, balance, interestRate);

            accountList.add(savingAccount);
            System.out.println("결과: 계좌가 생성되었습니다.");
        } else if (selectAccount == 2) {
            BankAccount checkingAccount = null;
            System.out.print("계좌번호: ");
            String accountNumber = scanner.next();
            System.out.print("계좌주: ");
            String accountHolder = scanner.next();
            System.out.print("수수료율: ");
            double chargeRate = scanner.nextDouble();
            System.out.print("초기대출액: ");
            double balance = scanner.nextDouble();

            checkingAccount = new CheckingAccount(accountNumber, accountHolder, balance, chargeRate);


            accountList.add(checkingAccount);
            System.out.println("결과: 계좌가 생성되었습니다.");
        } else {    // 1도 2도 아닌 잘못된 값을 입력 시
            System.out.println("잘못 입력했습니다. 다시 입력하세요.");
        }

    }

    // 계좌 목록 조회
    private static void viewAccountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for (BankAccount viewAccount : accountList) {
            System.out.println(viewAccount);
        }
    }

    // 예금
    private static void deposit() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        BankAccount findAccount = findAccount(accountNumber);
        if (findAccount == null) {
            System.out.println("잘못입력했습니다.");
        } else {
            System.out.print("예금액: ");
            double money = scanner.nextDouble();
            findAccount.deposit(money);
        }
    }


    private static void withdraw() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        BankAccount findAccount = findAccount(accountNumber);
        if (findAccount == null) {
            System.out.println("잘못입력했습니다.");
        } else {
            System.out.print("출금액: ");
            double money = scanner.nextDouble();
            findAccount.withdraw(money);
        }
    }

    private static void viewAccount() {
        System.out.println("--------------");
        System.out.println("조회");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        BankAccount findAccount = findAccount(accountNumber);
        if(findAccount == null){
            System.out.println("잘못입력했습니다.");
        } else {
            System.out.println(findAccount);
        }
    }

    private static BankAccount findAccount(String accountNumber) {
        BankAccount bankAccount = null;
        for (BankAccount findAccountList : accountList) {
            if (findAccountList.getAccountNumber().equals(accountNumber)) { // AccountNumber 는 String이므로 equals() 메소드로 비교
                System.out.println(findAccountList.getAccountNumber().equals(accountNumber));// 테스트 코드 // `true`면 찾은거
                bankAccount = findAccountList;
            }
        }
        return bankAccount;
    }

}
