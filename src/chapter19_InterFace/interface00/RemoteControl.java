package chapter19_InterFace.interface00;

/**
 * ===========================================================
 * fileName       : RemoteControl
 * date           : 2024-01-24
 * description    : 인터페이스 연습 0 
 * ===========================================================
 */

public interface RemoteControl { // RemoteControl 인터페이스 선언
    // public 추상 메소드
    public void turnOn();
}
class Television implements RemoteControl { // RemoteControl 을 구현한 클래스
    @Override
    public void turnOn() { // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
        System.out.println("TV를 켭니다.");
    }
}