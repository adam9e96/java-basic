package chapter_17_abstract.abstract_exam02;

public class Avante extends Car {
    public Avante() {
        super("Avante");
//        super.name = "Avante";
    }

    @Override
    public void start() {
        System.out.println(getName() + " 시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println(getName() + " 멈춥니다.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " 시동을 끕니다.");
    }
}
