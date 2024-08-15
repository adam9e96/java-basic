package chapter_24_jdbc.bookExample;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : BookManager
 * date           : 2024-02-25
 * description    : Controller
 * ===========================================================
 */
public class BookManager {
    private final ArrayList<Book> books;
    private final Scanner scanner;

    public BookManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void insertBook() {
        /* 책등록 */
        System.out.println("등록할 책의 정보를 입력해 주세요.");
        Book book = new Book();

        System.out.print("코드: ");
        book.setCode(scanner.nextInt());

        System.out.print("제목: ");
        book.setTitle(scanner.next());

        System.out.print("작가: ");
        book.setAuthor(scanner.next());

        System.out.print("재고: ");
        book.setStock(scanner.nextInt());

        books.add(book);
        System.out.println("책이 등록되었습니다.");
        System.out.println(book); // 테스트 코드
    }

    public void searchByKeyWord() {
        /* 키워드로 책 검색 */
        System.out.println("검색할 책의 제목을 입력해 주세요.");
        System.out.print("제목: ");

        String title = scanner.next();

        // 검색결과를 저장할 Arraylist 선언 및 초기화
        ArrayList<Book> searchList = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().contains(title)) { // 검색한 `제목`이 포함된 책을 찾음.
                searchList.add(book);
            }
        }

        // 검색결과를 저장한 컬렉션이 null 인 경우
        if (searchList.isEmpty()) {
            System.out.println("검색된 책이 없습니다.");
            return;
        }

        // 검색결과가 잇는 경우
        System.out.println("검색한 책의 정보는 아래와 같습니다.");
        for (Book book : searchList) {
            System.out.println(book.toString());
        }
    }

    private Book searchBookByCode(int code) {
        /* 코드로 책 찾기 */
        Book bookSearch = null;
        for (Book book : books) {
            if (book.getCode() == code) {
                bookSearch = book;
                break;
            }
        }
        return bookSearch;
    }

    public void rentBook() {
        /* 책대여  */
        System.out.println("대여할 책의 코드를 입력해 주세요.");
        System.out.print("코드: ");

        int code = scanner.nextInt();

        System.out.print("대여 권수: ");
        int stock = scanner.nextInt();

        Book book = searchBookByCode(code);

        // 테스트
        System.out.println(book);

        if (book == null) {
            System.out.println("입력하신 코드의 책은 없습니다.");
            return;
        }

        if (book.getStock() < stock) {
            System.out.println("재고가 " + book.getStock() + "권이여서 대여할 수 없습니다.");
            return;
        }
        // (book != null) && (book.getStock() < stock) 인경우
        book.setStock(book.getStock() - stock);
        System.out.println(stock + "권이 대여되었습니다.");
    }

    public void returnBook() {
        /* 책 반납 */
        System.out.println("반납할 책의 코드를 입력해 주세요.");
        System.out.print("코드: ");
        int code = scanner.nextInt();

        System.out.print("재고: ");
        int stock = scanner.nextInt();

        Book book = searchBookByCode(code);
        if (book == null) {
            System.out.println("입력하신 코드의 책은 없습니다.");
            return;
        }
        book.setStock(book.getStock() + stock);
        System.out.println(stock + " 권이 반납되었습니다.");
    }

    public void printAll() {
        /* 전체 목록 출력 */
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void close() {
        scanner.close();
    }
}
