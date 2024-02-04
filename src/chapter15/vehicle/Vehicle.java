package chapter15.vehicle;

public class Vehicle {
    /*
    Car, Truck, Bus 클래스의 공통 부분을 가지는 부모 클래스 Vehicle 작성
    상속을 사용하는 이유는 유지보수 용이가 크다.
     */
    int speed;
    int heading;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void turn(int angle) {
        heading = angle;
    }
}

class Car extends Vehicle {
    int price;
//        int speed;
//    int heading; // 방향

//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }

//    public void turn(int angle) {
//        heading = angle;
//    }
}

class Truck extends Vehicle {
    int payload;
//        int speed;
//    int heading; // 방향

//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }

//    public void turn(int angle) {
//        heading = angle;
//    }
}

class Bus extends Vehicle {
    int seats;
    //    int speed; // 부모 클래스로부터 물려받음
    //    int heading; // 방향

//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//    public void turn(int angle) {
//        heading = angle;
//    }

}