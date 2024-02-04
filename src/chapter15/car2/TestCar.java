package chapter15.car2;


public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("현대", "소나타", "검정", 3); // 부모 클래스
        Car car2 = new Car("테슬라", "모델1", "파랑", 0);
        SportCar sportCar = new SportCar("아우디", "a6", "회색", 2); // 자식 클래스

        System.out.println(car1);
        car1.speedUp();
        System.out.println(car1.getCarSpeed());
        System.out.println(car1.getModel());

        System.out.println(car2);
        car2.speedDown();
        System.out.println(car2.getCarSpeed());
        System.out.println(car2.getModel());

        System.out.println(sportCar);
        sportCar.speedUp();
        System.out.println(sportCar.getCarSpeed());
        System.out.println(sportCar.getModel());
    }
}
