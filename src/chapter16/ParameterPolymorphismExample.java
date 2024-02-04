package chapter16;/*
 * ===========================================================
 * fileName       : ParameterPolymorphismExample
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

interface Vehicle {
    // 추상 메소드
    void run();
}

class Driver {
    void drive(Vehicle vehicle) {
        vehicle.run();
    }
}

class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Taxi implements Vehicle {
    // 추상 메소드 재정의
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

public class ParameterPolymorphismExample {
    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle 구현 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        //매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
        driver.drive(bus);  // 자동 타입 변환 -> 오버라이딩 메소드 호출 -> 다형성
        driver.drive(taxi); // 자동 타입 변환 -> 오버라이딩 메소드 호출 -> 다형성
    }
}
