package chapter_24_jdbc.book;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : bookView
 * date           : 2024-02-25
 * description    : JDBC를 다루기 전 연습
 * ===========================================================
 */
public class BookView {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            System.out.println("scanner 참조"+scanner);
            printMenu();
            System.out.print("선택: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못입력했습니다. 숫자만 입력해주세요");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    bookManager.insertBook();
                    break;
                case 2:
                    bookManager.searchKeyWord();
                    break;
                case 3:
                    bookManager.rentBook();
                    break;
                case 4:
                    bookManager.returnBook();
                    break;
                case 5:
                    bookManager.printAll();
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    bookManager.close();
                    scanner.close();
                    return; // 루프 종료
                default:
                    System.out.println("잘못누르셨습니다. \n 다시입력해주세요.");
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("메뉴");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 책 대여");
        System.out.println("4. 책 반납");
        System.out.println("5. 책 전체출력");
        System.out.println("6. 종료");
        System.out.println();
        System.out.print(">>> ");
    }
}
