package chapter12.chicken;

/**
 * Chicken 클래스는 치킨의 종류와 수량을 나타내느 객체를 정의
 */
public class Chicken {
    /**
     * 치킨의 종류를 나타내는 문자열
     */
    String ck;
    /**
     * 치킨의 수량을 나타내는 정수
     */
    int quantity;

    /**
     * 치킨의 종류와 수량으로 Chicken 객체를 생성
     *
     * @param ck 치킨의 종류
     * @param quantity 치킨의 수량
     */
    Chicken(String ck, int quantity) {
        this.ck = ck;
        this.quantity = quantity;
        int quantity1 = quantity;
    }

}
