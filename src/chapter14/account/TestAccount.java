package chapter14.account;
/*
코드 짤때 중간 중간 실행해서 문제 없는지 확인해야함.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TestAccount {
    private static final Scanner scanner = new Scanner(System.in);
    // 참조 변수에 저장이 되는 것은 주소값이라서 배열의 값 변동과 상관없이 상수 사용 가능.
    private static final Account[] accountArray = new Account[100]; // 이 값은 변경못함. new 만 안쓰면 상관없음.
    // 참조변수에는 주소값만 저장되기 때문에 주소 값 변동만 없으면 값이 변하는 건 상관 없음.

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
                whithdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성하기
    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금금액: ");
        int balance = scanner.nextInt();
        Account newAccount = new Account(ano, owner, balance); // 객체 생성
        // newAccount 는 지역 변수라서 메서드가 종료되면 사라짐. 그래서 멤버 변수인 accountArray 에 저장.
        for (int i = 0; i < accountArray.length; i++) { // 0번 방부터 null 인 공간부터 할당함
            if (accountArray[i] == null) { // 빈 값인 경우
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
//                System.out.println(accountArray[i]);
                break;
            }
        }
    }

    // 계좌 목록 보기
    private static void accountList() {
        System.out.println("----------------------");
        System.out.println("계좌목록");
        System.out.println("----------------------");
        // 작성 위치
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i]; // 이렇게 해도 된다.
            if (accountArray[i] != null) {
//                System.out.println("계좌 번호 : " + accountArray[i].getAno());
                System.out.println("계좌 번호 : " + account.getAno());
//                System.out.println("계좌 주 : " + accountArray[i].getOwner());
                System.out.println("계좌 주 : " + account.getOwner());
//                System.out.println("금액 : " + accountArray[i].getBalance());
                System.out.println("금액 : " + account.getBalance());
            } else { // null 이라면
                break;
            }
        }
    }

    // 예금하기
    private static void deposit() {
        System.out.println("---------------------");
        System.out.println("예금");
        System.out.println("---------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        account.setBalance(account.getBalance() + money);
        System.out.println("결과 : 예금이 성공했습니다.");

//        for (int i = 0; i < accountArray.length; i++) {
//            if (accountArray[i] != null) {
//                if (ano.equals(accountArray[i].getAno())) { // 계좌 번호가 동일하다면
//                    accountArray[i].setBalance(accountArray[i].getBalance() + money); // 원금에서 더하기
//                }
//            } else {
//                break;
//            }
//        }

    }

    // 출금하기
    private static void whithdraw() {
        System.out.println("---------------------");
        System.out.println("출금");
        System.out.println("---------------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        account.setBalance(account.getBalance() - money);
        System.out.println("결과 : 출금이 성공되었습니다.");

//        for (int i = 0; i < accountArray.length; i++) {
//            if (accountArray[i] != null) {
//                if (ano.equals(accountArray[i].getAno())) {
//                    accountArray[i].setBalance(accountArray[i].getBalance() - money);
//                }
//            } else { // null 값이 저장된 경우에는 더 이상 순회 할 필요가 없음
//                break;
//            }
//        }


    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기 , 예금과 출금에서 쓸 수 있다.
    private static Account findAccount(String ano) {
        Account account = null;

        for (int i = 0; i < accountArray.length; i++) { //
            if (accountArray[i] != null) {
                if (accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            } else {
                break;
            }
        }
        return account;
    }

}
