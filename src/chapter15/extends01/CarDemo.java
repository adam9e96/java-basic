package chapter15.extends01;

/**
 * 상속 연습
 * <p>
 * Car 클래스는 자동차의 속도를 관리하는 클래스,
 * 속도 설정 및 조회 메서드를 제공
 */
class Car { // 부모 클래스
    /**
     * 자동차의 속도를 나타내는 필드
     */
    private int speed; // 속도

    /**
     * 자동차의 속도를 설정
     *
     * @param speed 설정할 속도
     */
    public void setSpeed(int speed) {
        // 속도 변경 메서드
        this.speed = speed;
    }

    /**
     * 자동차의 현재 속도를 반환
     *
     * @return 현재 속도
     */
    public int getSpeed() {
        return this.speed;
    }
}

/**
 * electricCar 클래스는 Car 클래스를 상속받아 전기  자동차의 배터리 기능을 추가한 클래스
 */
class ElectricCar extends Car { // 자식 클래스
    /**
     * 전기 자동차의 배터리 상태를 나타내는 필드
     */
    int battery;

//    상속을 받으면 해당 부모 클래스 멤버들을 사용할 수 있음
//    int speed; // 이게 있는거라고 보면됨1
//    public void setSpeed(int speed) {  // 이게 있는거라고 보면됨2
//    // 속도 변경 메서드
//    this.speed = speed;
//    }

    /**
     * 전기 자동차의 배터리를 충전
     *
     * @param amount 충전할 배터리 양
     */
    public void charge(int amount) {    // 자식 클래스에서 추가한 메소드
        // 충전 메서드
        battery += amount;
    }

    /**
     * 현재 배터리 상태를 반환
     *
     * @return 현재 배터리 상태
     */
    public int getBattery() {
        return battery;
    }

    /**
     * 배터리 상태를 설정
     *
     * @param battery 설정할 배터리 상태
     */
    public void setBattery(int battery) {
        this.battery = battery;
    }

}

/*
상속을 정의하려면 자식 클래스 이름 뒤에 extends 를 쓰고 부모 클래스의 이름을 적으면 됨.
'extends' 는 확장 (또는 파생)한다는 의미.
즉 부모 클래스를 확장해서 자식 클래스를 작성 한다는 의미
 */
public class CarDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); // 자식 클래스의 객체 생성


        // 부모 클래스의 메서드 사용
        electricCar.setSpeed(60);

        // 자체 메서드 사용
        // 자식 클래스의 메서드 사용
        electricCar.charge(10);
//        System.out.println(electricCar.battery); // 10

        // 결과 출력
        System.out.println("Battery: " + electricCar.getBattery());   // 10
        System.out.println("Speed: " + electricCar.getSpeed());       // 60
    }
}
