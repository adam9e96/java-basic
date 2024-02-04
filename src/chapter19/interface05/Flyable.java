package chapter19.interface05;
/**
 * ===========================================================
 * fileName       : Flyable
 * date           : 2024-01-23
 * description    : 인스테이스 연습5
 * ===========================================================
 */
public interface Flyable {
    void fly();
}

class Car {
    int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }
}
