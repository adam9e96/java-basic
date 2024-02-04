package gain;

public class Car {
    // 필드 선언
    public Tire tire;

    // 메소드 선언
    public void run() {
    // tire 필드에 대입된 객체의 roll() 메서드 호출
        tire.roll();

        // Tire 클래스는 부모
        // HankookTire, KumhoTire는 자식
    }

}
