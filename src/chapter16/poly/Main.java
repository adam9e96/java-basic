package chapter16.poly;
// 다형성 연습2
public class Main {
    public static void main(String[] args) {
        /*
        다형성과 형변환
        자식 타입에서 부모 타입으로는 자동 형변환되지만, 부모에서 자식타입으로는 명시적 형변환.
         */
        FireEngine fireEngine = new FireEngine(); // 일반적인 상속. 물려받은 자식타입의 개겣는 부모의 멤버도 사용가능함
        fireEngine.drive();
        fireEngine.water();

        // 부모타입에 자식객체. 업캐스팅이다.
        Car car = fireEngine; // car (Car)fireEngine; 에서 형변환이 생략된 상태
        car.drive();
//        car.water(); Car 타입 참조 변수로는 water() 를 호출 할 수 없음
        car.door =1;
        car.color= "white";
        car.drive();
        car.stop();

        FireEngine fireEngine2 = (FireEngine) car;
        // 부모 타입에서 자식 타입으로 대입할 때는 형변환을 해줘야 함. (다운 캐스팅)
        fireEngine2.drive();
        fireEngine2.water();
//        fireEngine2.color = "black";
//        fireEngine2.door = 4;
        System.out.println();
    }
}