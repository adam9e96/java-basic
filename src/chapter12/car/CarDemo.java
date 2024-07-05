package chapter12.car;

import java.util.Random;

public class CarDemo {
    public static void main(String[] args) {
        // Car 객체 생성 및 생성자 호출
        Car car1 = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("ca1.company : " + car1.company);
        System.out.println("ca1.company : " + car1.color);
        System.out.println("ca1.company : " + car1.model);
        System.out.println("ca1.company : " + car1.maxSpeed);
        System.out.println();

        Car car2 = new Car("자가용");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();


        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();


        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
        System.out.println();

        Car car5 = new Car("택시", "다크블루", 180);
        System.out.println("car5.company : " + car5.company);
        System.out.println("car5.model : " + car5.model);
        System.out.println("car5.color : " + car5.color);
        System.out.println("car5.maxSpeed : " + car5.maxSpeed);
    }
}
