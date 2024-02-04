package chapter13.car;

/*
created : 2024-01-15
updated : 2024-01-15
page : 1
 */
/*
    생성자 오버로딩
    매개변수가 있는 생성자
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";
        car1.gearType = "auto";
        car1.door = 4;

        Car car2 = new Car("black", "manual", 4);

        System.out.println("c1의 color=" + car1.color + ",gearType=" + car1.gearType + ", door= " + car1.door);
        // c1의 color=white, gearType = auto, door=4
        System.out.println("c2의 color=" + car2.color + ",gearType=" + car2.gearType + ", door= " + car2.door);
        // c2의 color=black, gearType = manual, door = 4

        /*
        기본 생성자(빈 생성자)를 사용하면 인스턴스 변수를 바로 초기화 할 수 없는데
        내가 매개변수를 넣어서 생성자를 이용하면 객체를 생성함과 동시에 원하는 값으로 초기화를 할 수 있다.
         */
    }
}
