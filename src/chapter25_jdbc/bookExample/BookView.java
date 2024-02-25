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
                default:
                    System.out.println("잚좃누르셨습니다. \n다시 선택해주세요.");
                    break;
            }
        }
    }

    public static void printMenu() {

    }
}
