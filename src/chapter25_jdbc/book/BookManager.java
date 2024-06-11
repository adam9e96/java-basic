package chapter25_jdbc.book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : bookManager
 * date           : 2024-02-25
 * description    :
 * ===========================================================
 */
public class BookManager {
    private final Scanner scanner;
    private final ArrayList<Book> bookArrayList;

    public BookManager() {
        this.scanner = new Scanner(System.in);
        this.bookArrayList = new ArrayList<>();

        // 테스트용
        bookArrayList.add(new Book(12345, "title", "author", 3));
        bookArrayList.add(new Book(1324, "title2", "Stephen King", 10));
        bookArrayList.add(new Book(3333, "AAAA", "Lists", 20));
    }

    public void insertBook() {
        /* 책 등록 */
        System.out.println("등록할 책의 정보를 입력해 주세요.");
        Book book = new Book();

        System.out.print("코드 : ");
        book.setCode(scanner.nextInt());

        System.out.print("제목 : ");
        book.setTitle(scanner.next());

        System.out.print("작가 : ");
        book.setAuthor(scanner.next());

        System.out.print("재고 : ");
        book.setStock(scanner.nextInt());

        bookArrayList.add(book); // bookArrayList에 입력한 정보를 담은 Book 객체를 추가
        System.out.println("책이 등록되었습니다.");
        System.out.println("현재 저장된 책 권수 :"+bookArrayList.size()); // 테스트
        System.out.println(book);
        /*
            insertBook 이 호출될 떄마다 새로운 Book 객체가 생성되고 bookArrayList에 추가된다.
         */

    }

    public void searchKeyWord() {
        /* 키워드로 책 검색 */
        System.out.println("검색할 책의 제목을 입력해 주세요.");
        System.out.print("제목 : ");
        String title = scanner.next();

        ArrayList<Book> searchList = new ArrayList<>();

        for (Book book : bookArrayList) {
            if (book.getTitle().contains(title)) { // 검색어가 포함된 책을 찾음
                searchList.add(book);
            }
        }
        if (searchList.isEmpty()) {
            System.out.println("검색된 책이 없습니다.");
            return;
        }
        System.out.println("검색할 책의 정보는 아래와 같습니다.");
        for (Book book : searchList) {
            System.out.println(book);
        }
//        for (Book book : bookArrayList) {
//            if (book.getTitle().equals(title)) {
//                System.out.println(book.getCode() + "/" + book.getTitle() + "/" + book.getAuthor() + "/" + book.getStock()+"권");
//            }
//        }
        /*
            이 메소드가 호출될때마다 새로운 searList 가 생성되어 검색결과를 담게 된다.
         */
    }

    public void rentBook() {    // 객체 생성 X
        /* 책 대여 */
        System.out.println(bookArrayList); // 테스트 코드
        System.out.println("대여할 책의 코드를 입력해 주세요.");
        System.out.print("코드 : ");
        int code = scanner.nextInt();
        System.out.print("대여 권수 : ");
        int stock = scanner.nextInt();

        Book books = searchBook(code);
        System.out.println(books); // null or 객체주소
        if (books == null) {
            System.out.println("입력하신 코드의 책은 없습니다.");
            return;
        }
        if (books.getStock() < stock) {
            System.out.println("재고가" + books.getStock() + "권이여서 대여할 수 없습니다.");
        }
        // books.getStock() >= stock 인 경우
        books.setStock(books.getStock() - stock); // 재고 감소
        System.out.println(stock + "권 대여되었습니다.");
        /*
        books.setStock(books.getStock() - stock);
        books를 통해 재고를 감소시키면, books가 가리키고 있는 Book 객체가 실제로 변경됩니다.
        이 객체는 bookArrayList에 저장된 동일한 객체이므로, bookArrayList 내의 해당 Book 객체의 stock 값도 변경되는 것입니다.
         */
        System.out.println(books);  // 테스트
        System.out.println(bookArrayList); // 테스트
//        System.out.println(books.hashCode());
//        System.out.println(bookArrayList.hashCode());
    }

    public void returnBook() {    // 객체 생성 X
        /* 책 반납 */
        System.out.println("반납할 책의 정보를 입력해 주세요.");
        System.out.print("코드 : ");
        int code = scanner.nextInt();
        System.out.print("반납 권수 : ");
        int stock = scanner.nextInt();

        Book books = searchBook(code);
        if (books == null) {
            System.out.println("반납할 책의 코드가 잘못입력되었습니다.");
            return;
        }
        books.setStock(books.getStock() + stock);
        System.out.println(stock + "권이 반납되었습니다.");
    }

    private Book searchBook(int code) { // rentBook, returnBook 에서 코드로 책을 조사하는 기능을 묶음    // 객체 생성 X
        /* 코드로 책 찾기 */
        // 이 메소드에선 새로운 Book 객체를 생성하지는 않지만, 이미 생성된 Book 객체의 참조를 반환한다.
        Book resultBook = null; // Book 타입의 변수 생성 및 초기화
        for (Book book : bookArrayList) {
            if (book.getCode() == code) {
                resultBook = book;
                break;
            }
        }
        // searchBook(int code) 메소드는 bookArrayList에서 특정 조건에 부합하는 Book 객체의 참조를 반환한다.
        // 반환된 Book 객체의 참조는 books 변수에 저장되며, 이 참조는 bookArrayList 에 저장된 원본 객체를 가리키고 있다.

        return resultBook;
    }

    public void printAll() {    // 객체 생성 X
        /* 전체 목록 출력 */
        for (Book book : bookArrayList) {
//            System.out.println(book.getCode() + "/" + book.getTitle() + "/" + book.getAuthor() + "/" + book.getStock()+"권"); // Book DTO toString 오버라이딩함
            System.out.println(book);
        }
    }

    public void close() {
        scanner.close();
    }
}

