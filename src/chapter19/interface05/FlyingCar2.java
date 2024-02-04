package chapter19.interface05;
/**
 * ===========================================================
 * fileName       : FlyingCar2
 * date           : 2024-01-23
 * description    : 인스테이스 연습5
 * 상속과 구현 동시에 받을 수 있을까?
 * -가능하다
 * 인터페이스의 경우 구현받은 클래스에서 재정의.
 * 부모 클래스의 상속을 받으면 가능함.
 * ===========================================================
 */
public class FlyingCar2 extends Car implements Flyable {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    public static void main(String[] args) {
        FlyingCar2 flyingCar = new FlyingCar2();
        flyingCar.setSpeed(300);    // 상속받은 메소드 (오버라이딩 가능)
        flyingCar.fly(); // 인터페이스를 구현해 재정의 한 메소드
    }
}
