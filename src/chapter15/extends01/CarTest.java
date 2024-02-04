package chapter15.extends01;

/*
 * ===========================================================
 * fileName       : CarTest
 * date           : 2024-01-30
 * description    : extends-01
 * 상속 연습
 * ===========================================================
 */
class Car { // 부모 클래스
    private int speed; // 속도

    public void setSpeed(int speed) {
        // 속도 변경 메서드
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
}

class ElectricCar extends Car { // 자식 클래스
    int battery;

//    상속을 받으면 해당 부모 클래스 멤버들을 사용할 수 있음
//    int speed; // 이게 있는거라고 보면됨1
//    public void setSpeed(int speed) {  // 이게 있는거라고 보면됨2
//    // 속도 변경 메서드
//    this.speed = speed;
//    }

    public void charge(int amount) {    // 자식 클래스에서 추가한 메소드
        // 충전 메서드
        battery += amount;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

}

/*
상속을 정의하려면 자식 클래스 이름 뒤에 extends 를 쓰고 부모 클래스의 이름을 적으면 됨.
'extends' 는 확장 (또는 파생)한다는 의미.
즉 부모 클래스를 확장해서 자식 클래스를 작성 한다는 의미
 */
public class CarTest {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); // 자식 클래스의 객체 생성
        // 부모 클래스의 필드와 메서드 사용

        electricCar.setSpeed(60);
        // 자체 메서드 사용
        electricCar.charge(10);
//        System.out.println(electricCar.battery); // 10
        System.out.println(electricCar.getBattery());   // 10
        System.out.println(electricCar.getSpeed()); // 60
    }
}
