package chapter16.poly04;/*
 * ===========================================================
 * fileName       : InstanceOfExample
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

interface Vehicle {
    void run();
}

class Bus implements Vehicle {

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    public void checkFare() {
        System.out.println("승차요금을 체크합니다.");
    }
}

class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;    // 매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메소드 호출
            bus.checkFare();    // Bus 객체에만 있는 메소드
        }
        vehicle.run();
    }
}
