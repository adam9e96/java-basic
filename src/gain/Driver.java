package gain;
// 다형성 연습 1 - 매개변수 다형성
public class Driver {
    // 메소드 선언 (클래스 타입의 매개변수를 가지고 있음
    public void drive(Vehicle vehicle){ // 클래스 타입의 매개변수
        vehicle.run();
    }
}
