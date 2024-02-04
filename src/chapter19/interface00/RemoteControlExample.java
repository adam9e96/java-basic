package chapter19.interface00;

/**
 * ===========================================================
 * fileName       : RemoteControlExample
 * date           : 2024-01-24
 * description    : 인터페이스 연습 0
 * ===========================================================
 */
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        Television tv;
        tv = new Television();
        tv.turnOn();
    }
}
