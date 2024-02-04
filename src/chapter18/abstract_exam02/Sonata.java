package chapter18.abstract_exam02;

public class Sonata extends Car {

    public Sonata() {
        super("Sonata");
//        super.name = "Sonata";
    }

    @Override
    public void start() {
        System.out.println(getName()+ " 시동을 켭니다.");
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
