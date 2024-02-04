package chapter19.interface00;

/**
 * ===========================================================
 * fileName       : RemoteControl
 * date           : 2024-01-24
 * description    : 인터페이스 연습 0 
 * ===========================================================
 */

public interface RemoteControl {
    // public 추상 메소드
    public void turnOn();
}
class Television implements RemoteControl {
    @Override
    public void turnOn() { // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
        System.out.println("TV를 켭니다.");
    }
}