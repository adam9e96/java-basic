package chapter25_jdbc.bookExample;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : BookView
 * date           : 2024-02-25
 * description    :
 * ===========================================================
 */
public class BookView {
    public static void main(String[] args) {
        BookManager manaver = new BookManager();

        Scanner scanner = new Scanner(System.in);
        while (true) {


            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    manaver.insertBook();
                    break;
                case 2:
//                    manager.searchByKeyWord();
                    break;
                case 3:
//                    manager.rentBook();
                    break;
                case 4:
//                    manager.returnBook();
                    break;
                case 5:
//                    manaverprintAll();
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    manager.close();
                    scanner.close();
                    return;
                default:
                    System.out.println("잚좃누르셨습니다. \n다시 선택해주세요.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("============Menu============");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 책 대여");
        System.out.println("4. 책 반납");
        System.out.println("5. 책 전체출력");
        System.out.println("6. 종료");
        System.out.println();
    }
}
