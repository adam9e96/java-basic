package chapter_18_interface.interface01;

/**
 * <h1>RemoteControlDemo</h1>
 * <p>
 * 이 클래스는 {@link Television} 객체를 생성하여 원격 제어 기능을 테스트한다.
 * {@link AdvancedRemoteControl} 인터페이스를 구현한 Television 클래스의 메서드들을 호출하여
 * TV를 켜고 끄며, 볼륨을 조절하는 동작을 확인한다.
 * </p>
 *
 * <p>
 * 인터페이스에 추가로 인터페이스 상속을 하는 이유에 대해 배우는 예제.
 * 기존 인터페이스에 새로운 기능을 추가하면서도, 기존 구현 클래스에 영향을 주지 않도록 설계되었다.
 * </p>
 *
 */
public class RemoteControlDemo {
    public static void main(String[] args) {
        Television television = new Television();

        television.turnOn();
        television.volumeUp();    // 인터페이스 상속을 통한 볼륨 업 기능
        television.volumeDown();  // 인터페이스 상속을 통한 볼륨 다운 기능
        television.turnOff();
    }
}
