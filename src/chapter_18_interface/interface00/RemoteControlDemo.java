package chapter_18_interface.interface00;

/**
 * {@code RemoteControlDemo} 클래스는 인터페이스의 다형성과 인터페이스 타입 참조 변수를
 * 활용하는 방법을 보여주는 데모입니다. 이 클래스는 {@code RemoteControl} 인터페이스를 구현한
 * {@code Television} 클래스의 인스턴스를 참조하고, 이를 통해 다형성의 개념을 설명합니다.
 *
 * <p> 주요 개념:
 * <ul>
 *   <li>인터페이스 참조: 인터페이스 타입의 참조 변수를 통해 구현 클래스의 인스턴스를 참조할 수 있습니다.</li>
 *   <li>다형성: 동일한 메서드 호출이 실제로 서로 다른 구현을 가진 메서드를 실행할 수 있습니다.
 *       여러 클래스가 동일한 인터페이스를 구현하고, 각 클래스가 그 인터페이스의 메서드를
 *       서로 다르게 정의할 수 있습니다.</li>
 *   <li>결합도 감소: 인터페이스를 사용하면 구현체에 대한 의존성을 줄일 수 있어 코드의 유연성을
 *       높이고 유지보수를 쉽게 할 수 있습니다.</li>
 * </ul>
 *
 * <p> 예시 실행 결과:
 * <pre>
 * TV를 켭니다.
 * TV를 켭니다.
 * </pre>
 *
 * @since 2024.07.30
 */
public class RemoteControlDemo {

    /**
     * {@code main} 메서드는 인터페이스 타입의 참조 변수를 사용하여 구현 클래스의
     * 인스턴스를 참조하는 방법을 설명하는 예제입니다.
     *
     * @param args 명령줄 인수 (사용되지 않음)
     */
    public static void main(String[] args) {

        // 인터페이스 타입의 참조 변수로 구현 클래스의 인스턴스를 참조할 수 있다.
        RemoteControl rc; // 인터페이스 타입의 참조 변수 rc를 선언
        rc = new Television();
        rc.turnOn(); // "TV를 켭니다." 출력

        // Television 타입의 참조 변수로 인스턴스를 참조
        Television tv;
        tv = new Television();
        tv.turnOn(); // "TV를 켭니다." 출력

        /*
         * 다형성 (Polymorphism):
         * 인터페이스를 사용하면 다형성을 구현할 수 있습니다. 다형성이란 동일한 메소드 호출이 실제로는
         * 서로 다른 구현을 가진 메소드를 실행하는 것을 의미합니다.
         * 예를 들어, 여러 클래스가 RemoteControl 인터페이스를 구현하고 각각의 turnOn() 메소드를
         * 다르게 정의할 수 있습니다.
         *
         * 인터페이스를 통한 결합도 감소:
         * 인터페이스를 사용하면 구현체에 대한 의존성을 줄일 수 있습니다. 이는 코드의 유연성을 높이고
         * 유지보수를 쉽게 만듭니다. 예를 들어, RemoteControlDemo 클래스는 Television 클래스뿐만 아니라
         * RemoteControl 인터페이스를 구현한 어떤 클래스든 사용할 수 있습니다.
         */
    }
}
