package chapter12.car;

/**
 * Car 클래스는 자동차 객체를 정의하며, 다양한 생성자를 통해 자동차의 모델, 색상 및 최대 속도를 설정할 수 있습니다.
 * <p>
 * Car 클래스의 목적은 Car 객체를 정의하고, 다양한 생성자를 통해 Car 객체의 속성을 초기화하는 것
 */
public class Car {
    // 필드 선언
    /**
     * 자동차 회사 이름
     */
    String company = "현대자동차";
    /**
     * 자동차 모델
     */
    String model;
    /**
     * 자동차 색상
     */
    String color;
    /**
     * 자동차 최대 속도
     */
    int maxSpeed;

    /**
     * 기본 생성자.
     * 아무런 매개변수도 받지 않고, 필드들을 기본값으로 초기화합니다.
     */
    Car() {

    }

    /**
     * 모델명을 매개변수로 받는 생성자.
     *
     * @param model 자동차 모델명
     */
    Car(String model) {
        this.model = model;
    }

    /**
     * 모델명과 색상을 매개변수로 받는 생성자.
     *
     * @param model 자동차 모델명
     * @param color 자동차 색상
     */
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /**
     * 모델명, 색상 및 최대 속도를 매개변수로 받는 생성자.
     *
     * @param model    자동차 모델명
     * @param color    자동차 색상
     * @param maxSpeed 자동차 최대 속도
     */
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
