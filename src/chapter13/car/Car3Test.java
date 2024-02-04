package chapter13.car;

public class Car3Test {
    public static void main(String[] args) {
        // 객체 생성
        Car3 car3 = new Car3();

        // 잘못된 속도 변경
        car3.setSpeed(-50); // 0으로 넣고 종료
        System.out.println("현재 속도 " + car3.getSpeed());

        //올바른 속도 변경
        car3.setSpeed(60);
        System.out.println("현재 속도 " + car3.getSpeed());

        // 멈춤
        if (car3.isStop()) {
            car3.setStop(true);
        }
        System.out.println("현재 속도 " + car3.getSpeed());
    }
}
