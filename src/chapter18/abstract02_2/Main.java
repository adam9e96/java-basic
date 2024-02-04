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
//        Phone phone = new Phone(); // 안된다. 추상 클래스는 new 연산자로 직접 생성할 수 없다.
        // 자식 객체는 new 연산자로 객체 생성이 가능하다. 물려받은 메소드도 사용가능하다.
        Phone phone = new SmartPhone("22"); // 이것도 가능하다. todo 업캐스팅?
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.turnOff();
        System.out.println(smartPhone.owner);

        smartPhone.internetSearch(); // smartPhone 에서 생성한 메서드


    }
}
