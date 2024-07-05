package chapter12.car2;

public class Car2Demo {
    public static void main(String[] args) {
        //Car2 객체 생성
        Car2 car = new Car2();

        // 리턴값 없는 setGas() 메소드 호출
        car.setGas(5);

        // isLeftGas() 메소드를 호출해서 받은 리턴값이 true 일 경우 if 블록 실행
        if (car.hasGas()) {
            System.out.println("출발합니다.");

            // 리턴값이 없는 run() 메소드 호출
            car.run();
        }
        car.hasGas();
    }
}
