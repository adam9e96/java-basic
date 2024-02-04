package chapter18.abstract_exam02;

public abstract class Car {
    private String name;

//    public Car() {
//    }

    public Car(String name) {
        this.name = name;
    }

    void run() {
        start();
        drive();
        stop();
        turnOff();
    }

    public abstract void start();

    public abstract void drive();

    public abstract void stop();

    public abstract void turnOff();

    public String getName() {
        return name;
    }
}
