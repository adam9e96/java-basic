package chapter_24_jdbc.book;

/**
 * ===========================================================
 * fileName       : book
 * date           : 2024-02-25
 * description    :
 * ===========================================================
 */
public class Book {
    private int code;   // 코드
    private String title;   // 제목
    private String author;  // 작가
    private int stock;  // 재고

    public Book() {

    }

    public Book(int code, String title, String author, int stock) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getCode() + "/" + getTitle() + "/" + getAuthor() + "/" + getStock() + "권";
    }
}
