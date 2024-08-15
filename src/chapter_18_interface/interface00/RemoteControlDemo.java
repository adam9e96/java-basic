package chapter_18_interface.interface00;


public class RemoteControlDemo {
    public static void main(String[] args) {

        // 인터페이스 타입의 참조 변수로 구현 클래스의 인스턴스를 참조할 수 있다.
        RemoteControl rc; // 인터페이스 타입의 참조 변수 rc를 선언
        rc = new Television();
        rc.turnOn(); // TV를 켭니다.

        // Television 타입의 참조 변수로 인스턴스를 참조
        Television tv;
        tv = new Television();
        tv.turnOn(); // TV를 켭니다.

        // 실행 결과
//        TV를 켭니다.
//        TV를 켭니다.

        /*
         * 다형성 (Polymorphism):
         * 인터페이스를 사용하면 다형성을 구현할 수 있습니다. 다형성이란 동일한 메소드 호출이 실제로는 서로 다른 구현을 가진 메소드를 실행하는 것을 의미합니다.
         * 예를 들어, 여러 클래스가 RemoteControl 인터페이스를 구현하고 각각의 turnOn() 메소드를 다르게 정의할 수 있습니다.
         * 인터페이스를 통한 결합도 감소:
         * 인터페이스를 사용하면 구현체에 대한 의존성을 줄일 수 있습니다. 이는 코드의 유연성을 높이고 유지보수를 쉽게 만듭니다.
         * 예를 들어, RemoteControlExample 클래스는 Television 클래스뿐만 아니라 RemoteControl 인터페이스를 구현한 어떤 클래스든 사용할 수 있습니다.
         */
    }
}
