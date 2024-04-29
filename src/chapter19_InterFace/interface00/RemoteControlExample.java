package chapter19_InterFace.interface00;

/**
 * ===========================================================
 * fileName       : RemoteControlExample
 * date           : 2024-01-24
 * description    : 인터페이스 연습 0
 * ===========================================================
 */
public class RemoteControlExample {
    public static void main(String[] args) {

        // 인터페이스 타입의 참조 변수로 구현 클래스의 인스턴스를 참조할 수 있다.
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        // Television 타입의 참조 변수로 인스턴스를 참조
        Television tv;
        tv = new Television();
        tv.turnOn();

        // 실행 결과
//        TV를 켭니다.
//        TV를 켭니다.
    }
}
