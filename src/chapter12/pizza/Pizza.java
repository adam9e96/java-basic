package chapter12.pizza;

/**
 * Pizza 클래스는 피자의 크기와 종류를 나타내는 객체를 정의합니다.
 */
public class Pizza {
    // 생성자는 반환형이 없다.
    /**
     * 피자의 크기 (인치)
     */
    int size;
    /**
     * 피자의 종류
     */
    String type;


    /**
     * 기본 생성자.
     * 기본 크기와 종류의 피자를 생성합니다.
     */
    public Pizza() { // 매개변수가 없는 생성자
        this.size = 12;
        this.type = "슈퍼슈프림";
    }


    /**
     * 주어진 크기와 종류로 피자를 생성합니다.
     *
     * @param s 피자의 크기 (인치)
     * @param t 피자의 종류
     */
    public Pizza(int s, String t) { // 매개변수가 있는 생성자
        this.size = s;
        this.type = t;
    }
    /*
    생성자를 하나라도 만들면(기본생성자든 아니든) 빈 생성자를 생성 해주지 않는다.
     */
}
