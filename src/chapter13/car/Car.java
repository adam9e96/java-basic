package chapter13.car;

/**
 * Car 클래스는 자동차의 색상, 변속기 종류, 문의 개수를 나타내며,
 * 생성자 오버로딩을 통해 다양한 방법으로 객체를 생성할 수 있습니다.
 * <p>
 * 생성자 오버로딩
 * 매개변수가 있는 생성
 */
public class Car {
    /**
     * 자동차의 색상
     */
    String color;
    /**
     * 변속기 종류
     */
    String gearType;
    /**
     * 문의 개수
     */
    int door;


    /**
     * 기본 생성자.
     * 기본값으로 초기화된 Car 객체를 생성합니다.
     */
    public Car() {
        // 기본 생성자
    }

    /**
     * 주어진 색상, 변속기 종류, 문의 개수로 Car 객체를 생성합니다.
     *
     * @param color    자동차의 색상
     * @param gearType 변속기 종류
     * @param door     문의 개수
     */
    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}