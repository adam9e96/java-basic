package selfProject.interface01;/*
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-25
 * description    : 인터페이스 연습 0
 인터페이스에서 특별히 접근제한자가 명시되어 있지 않으면 public.
 모든 메서드는 추상 메서드이다.
 인터페이스 단독으로 객체를 생성 할 수 없고 구현을 통해 가능하다.
 
 TITLE : 자동차 인터페이스와 구현 클래스
 자동차의 기본적인 기능을 정의한 인터페이스를 Car 라고 한다.
 Car 인터페이스에는 start, stop, accelerate, brake 라는 4개의 추상 메소드를 선언한다.
 * ===========================================================
 */

interface Car {
    void start();   // 출발   // public abstract void start();

    void stop();    // 정지

    void accelerate();  // 가속

    void brake();   // 브레이크
}
// Car 인터페이스의 모든 메소드 오버라이딩
class Sedan implements Car {    // Car 인터페이스를 구현 하는 클래스는 Car 인터페이스의
    // 모든 메서드를 오버라이딩 해야 한다.

    @Override
    public void start() {
        System.out.println("세단 출발");
    }

    @Override
    public void stop() {
        System.out.println("세단 정지");
    }

    @Override
    public void accelerate() {
        System.out.println("세단 가속");
    }

    @Override
    public void brake() {
        System.out.println("세단 브레이크");
    }
}

class Truck implements Car {

    @Override
    public void start() {
        System.out.println("트럭 출발");
    }

    @Override
    public void stop() {
        System.out.println("트럭 정지");
    }

    @Override
    public void accelerate() {
        System.out.println("트럭 가속");
    }

    @Override
    public void brake() {
        System.out.println("트럭 브레이크");
    }
}

class Bus implements Car {
    @Override
    public void start() {
        System.out.println("버스 출발");
    }

    @Override
    public void stop() {
        System.out.println("버스 정지");
    }

    @Override
    public void accelerate() {
        System.out.println("버스 가속");
    }

    @Override
    public void brake() {
        System.out.println("버스 브레이크");
    }
}

public class Main {
    public static void main(String[] args) {

        // Car 인터페이스를 구현하는 클래스는 Car 인터페이스 타입으로 업캐스팅 될 수 있다.
        Car car = new Sedan();  // 이렇게 하면 Car 인터페이스의 메소드만 사용가능
        car.accelerate();
        car.brake();
        car.start();
        car.stop();
        //가속
        //브레이크
        //출발
        //정지
        // Car를 오버라이딩한 메서드가 실행된다. 실제 생성된 객체는 Sedan 이므로.

        System.out.println();
        // Car 인터페이스를 구현하는 클래스는 Car 인터페이스의 타입으로 다형성을 구현 할 수 있다.
        Car[] cars = {new Sedan(), new Truck(), new Bus()};
        //  이렇게 하면 Car 인터페이스의 메소드를 통해 각 클래스의 특성을 다르게 표한 할 수 있다.
        int idxx = 3;
        cars[1].stop();
        cars[2].start();
        for (Car cars1: cars ) {
            cars1.start();
            cars1.accelerate();
            cars1.brake();
            cars1.stop();
        }

        System.out.println("====");
        Car car1 = new Sedan();
        Car car2 = new Truck();
        Car car3 = new Bus();
        car1.brake();
        car2.brake();
        car3.brake();
    }
}
