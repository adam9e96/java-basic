package chapter26_designPattern.mvc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : AccountView
 * date           : 2024-02-16
 * description    :
 * ===========================================================
 */
public class AccountView{   // View 역할
    public static void printMenu() {

        System.out.println("==========Menu==========");
        System.out.println("1. 계좌개설");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 잔액조회");
        System.out.println("5. 전체출력");
        System.out.println("6. 프로그램종료");
        System.out.println();

    }

    public static void main(String[] args) throws SQLException {    // Controller 객체 생성만해도.     // DB연결 // 내부적으로 쓸 리스트 배열 , 스캐너 객체
        AccountManager manager = new AccountManager(); // Controll 객체를 생성해서 가져다 쓰기만함
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            printMenu();
            System.out.print("선택:");
            int choice = stdIn.nextInt();
            switch (choice) {
                case 1:// 일반 테이블은 이미 Account가 생성되어있고 여기서 makeAccount는 값을 넣는 의미
                    manager.makeAccount();  // 내부 로직
                    break;
                case 2:
                    manager.deposit();  // 입금
                    break;
                case 3:
                    manager.withdraw(); // 출금
                    break;
                case 4:
                    System.out.println("계좌번호\t성명\t잔액");     // \t 탭 : 스페이스 4번한거랑 같음
                    manager.inquire(); // 문의?
                    break;
                case 5:
                    System.out.println("계좌번호\t성명\t금액");
                    manager.display();  // 잔액조회
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    manager.disConnect();
                    return;
                default:
                    System.out.println("잘못누르셨습니다. \n다시선택해주세요.");
                    break;
            }
        }
    }
}
