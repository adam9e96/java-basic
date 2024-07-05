package chapter12.car03;

/**
 * Cars 클래스는 자동차의 속도와 바퀴 수를 나타내며,
 * 바퀴 수는 클래스 변수로 모든 인스턴스가 공유합니다.
 */
public class Cars {
    /**
     * 자동차의 바퀴 수를 나타내는 클래스 변수
     */
    static int wheel = 4; // 클래스 변수

    /**
     * 자동차의 속도를 나타내는 인스턴스 변수
     */
    int speed; // 인스턴스 변수

    /**
     * 기본 생성자.
     * 자동차 객체를 생성하고 초기 속도는 0으로 설정됩니다.
     */
    public Cars() {
        this.speed = 0;
    }
}
