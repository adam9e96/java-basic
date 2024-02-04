package chapter13.car;

public class CarTest2 {
    public static void main(String[] args) {

        Car2 car1 = new Car2();

        System.out.println("c1의 color=" + car1.color + ",gearType=" + car1.gearType + ", door= " + car1.door);
        // c1의 color=white, gearType = auto, door=4

        Car2 car2 = new Car2("blue");

        System.out.println("c2의 color=" + car2.color + ",gearType=" + car2.gearType + ", door= " + car2.door);
        // c2의 color=black, gearType = manual, door = 4
    }


}
