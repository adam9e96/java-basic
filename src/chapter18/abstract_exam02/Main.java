package chapter18.abstract_exam02;

/*
Car 추상 클래스를 상속받는 Sonata, Grandeur, Avante, Genesis 클래스가 있습니다.
각차는 주행하기 위해 다음 순서로 움직입니다.

    run() {
        start();
        drive();
        stop();
        turnOff();
    }

CarTest 클래스를 보고 다음 출력 결과가 나오도록 Car, Sonata, Grandeur, Avante, Genesis 클래스를 구현하세요.

출력 결과 :
Sonata 시동을 켭니다.
Sonata 달립니다.
Sonata 멈춥니다.
Sonata 시동을 끕니다.
======================
Grandeur 시동을 켭니다.
Grandeur 달립니다.
Grandeur 멈춥니다.
Grandeur 시동을 끕니다.
======================
Avante 시동을 켭니다.
Avante 달립니다.
Avante 멈춥니다.
Avante 시동을 끕니다.
======================
Genesis 시동을 켭니다.
Genesis 달립니다.
Genesis 멈춥니다.
Genesis 시동을 끕니다.
 */
public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Sonata();
        cars[1] = new Grandeur();
        cars[2] = new Avante();
        cars[3] = new Genesis();
        for (Car car : cars) {
            car.run();
            System.out.println("==========================");
        }

    }
}
