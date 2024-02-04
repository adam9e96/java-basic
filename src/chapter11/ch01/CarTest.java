package chapter11.ch01;

// 이전 예제에서 만들어진 Class 사용
public class CarTest {
    public static void main(String[] args) {
        Car myCar; // 클래스의 객체를 참조할 수 있는 참조변수선언
        myCar = new Car(); // 클래스의 객체를 생성하고 객체의 주소를 참조변수에 저장

        System.out.println("시동 처음 초기화 : "+myCar.powerOn);
        System.out.println("차의 색상 초기화 : "+myCar.color);
        System.out.println("바퀴의 수 초기화 : "+myCar.wheel);
        System.out.println("속려 초기화 : "+myCar.speed);
        System.out.println("와이퍼 작동 초기화 : "+myCar.wiperOn);

        myCar.power(); // 시동 메서드 실행
        System.out.println("시동 메서드 동작 : "+myCar.powerOn);
        myCar.power();
        System.out.println("시동 메서드 다시 동작 : "+myCar.powerOn);

        myCar.color = "black"; // 색상 변수에 black 대입
        System.out.println("현재 차의 색상 : "+myCar.color);
    }
}
