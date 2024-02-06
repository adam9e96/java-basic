package chapter18.abstract02_2;

/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : 추상클래스 연습2-2
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
//       Phone phone = new Phone(); // 안된다. 추상 클래스는 new 연산자로 직접 생성할 수 없다.
        // 자식 객체는 new 연산자로 객체 생성이 가능하다. 물려받은 메소드도 사용가능하다.
        Phone phone = new SmartPhone("김문기"); // 이것도 가능하다. // 업캐스팅

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.turnOff();
        System.out.println(smartPhone.owner);
        smartPhone.internetSearch(); // smartPhone 에서 생성한 메서드

        phone.turnOn();
        phone.turnOff();
        System.out.println(phone.owner);
//        phone.internetSearch();// 구현클래스에서 생성한 메서드라서 사용할 수 없다.

    }
}
/*
구현 클래스에서 부모 클래스의 메서드를 오버라이딩 하지 않아도 부모 클래스의 메서드를 그대로 사용할 수있다.
예를 들어, SmartPhone 클래스에서는 turnOn 및 turnOff 메서드를 오버라이딩하지 않았지만, 여전히 이 메서드들을 사용할 수 있다.

그러나 만약 구현 클래스에서 부모 클래스의 메서드를 오버라이딩하고자 한다면, 새로운 구현을 제공하여 메서드를 재정의할 수 있습니다.
이것은 필요에 따라 메서드 동작을 변경하거나 확장할 수 있도록 합니다.
 */