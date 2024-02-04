package chapter19.interface01;

/**
 * ===========================================================
 * fileName       : RemoteControlExample
 * date           : 2024-01-23
 * description    : 인터페이스 연습 1
 * ===========================================================
 * 인터페이스는 다른 클래스에 의하여 구현(implement) 될 수 있음
 * 인터페이스를 구현한다는 말은 인터페이스에 정의된 추상 메서드의 몸체를 정의한다는 의미.
 * 클래스가 인터페이스를 구현하기 위해서는 implement 키워드를 사용.
 * 예를 들어 Television 클래스가 RemoteControl 인터페이스를 구현하기 위한 문법은 아래와 같음.
 *
 */
// 추상클래스의 주 목적은 협업할 때 필요한 기능을 무조건 구현하도록 하는 것임.
public class Television implements RemoteControl, AdvancedRemoteControl {
    private boolean on;
    private int volume = 0;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }


    @Override
    public void volumUp() {
        System.out.println("볼륨 키우기");
        volume++;

    }

    @Override
    public void volumDown() {
        System.out.println("볼륨 낮추기");
        volume--;
    }

}
