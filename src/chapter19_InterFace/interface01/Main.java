package chapter19_InterFace.interface01;
/**
 * ===========================================================
 * fileName       : RemoteControlExample
 * date           : 2024-01-25
 * description    : 인터페이스 연습 1
 * 인터페이스0에 추가로 인터페이스 상속을 하는 이유에 대해 배움.
 *
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
        Television television = new Television();
        television.turnOn();
        television.turnOff();
//        television.setMute(true);
        television.volumUp();   // 인터페이스 상속
        television.volumDown();

    }
}
