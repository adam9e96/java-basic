package chapter_18_interface.interface00;

/**
 * Java 인터페이스 (Interface)
 * 인터페이스는 다른 클래스들이 구현해야 하는 메소드들을 선언하는 일종의 청사진입니다.
 * 인터페이스는 객체 지향 프로그래밍에서 다형성을 제공하고,
 * 클래스들이 특정 동작을 보장하도록 강제하는 데 사용됩니다.
 * <p>
 * 기본 개념
 * 인터페이스 선언: interface 키워드를 사용하여 선언합니다.
 * 추상 메소드: 인터페이스 내의 메소드는 기본적으로 추상 메소드입니다. 따라서 인터페이스를 구현하는 클래스는 이 메소드들을 반드시 재정의해야 합니다.
 * 구현: implements 키워드를 사용하여 인터페이스를 구현합니다.
 * 다중 상속: 한 클래스가 여러 인터페이스를 구현할 수 있습니다.
 *
 * @since 2024.07.30
 */

public interface RemoteControl { // RemoteControl 인터페이스 선언

    public void turnOn(); // public 추상 메소드
}

class Television implements RemoteControl { // RemoteControl 을 구현한 클래스
    @Override
    public void turnOn() { // 인터페이스에 선언된 turnOn() 추상 메소드 재정의
        System.out.println("TV를 켭니다.");
    }
}