package Project1;

import java.sql.Connection;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountView
 * date           : 2024-02-20
 * description    :
 * ===========================================================
 */
public class AccountView {

    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager(); // DTO 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;
        while (isRun) {
            printMenu();    // 콘솔 화면
            System.out.print("선택:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    accountManager.addMember();// 회원 등록
                    break;
                case 2:
                    accountManager.addAccount(); // 계좌 개설
                    break;
                case 3:
                    accountManager.deposit();// 입금 처리
                    break;
                case 4:
                    accountManager.withdraw();// 입금 처리
                    break;
                case 5:
                    accountManager.viewHistory();// 잔액및 거래내역 조회
                    break;
                case 6:
                    System.out.println("종료합니다"); // 프로그램 종료 메서드
                    accountManager.disConnect();
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("==========Menu============");
        System.out.println("1. 회원등록");
        System.out.println("2. 계좌계설");
        System.out.println("3. 입금");
        System.out.println("4. 출금");
        System.out.println("5. 잔액 및 거래 내역 조회");
        System.out.println("6. 프로그램종료");
        System.out.println();
    }

}
