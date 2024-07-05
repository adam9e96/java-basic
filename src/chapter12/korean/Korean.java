package chapter12.korean;

/**
 * Korean 클래스는 대한민국 국민의 이름과 주민등록번호로 나타내는 객체를 정의.
 */
public class Korean {
    // 필드 선언
    /**
     * 대한민국을 나타내는 문자열
     */
    String nation = "대한민국";
    /**
     * 국민의 이름
     */
    String name;
    /**
     * 주민등록번호
     */
    String ssn;

    // 생성자 선언

    /**
     * 주어진 이름과 주민등록번호로 Korean 객체를 생성
     *
     * @param name 국민의 이름
     * @param ssn  주민등록번호
     */
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
