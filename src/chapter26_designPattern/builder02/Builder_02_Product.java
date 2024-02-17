package chapter26_designPattern.builder02;

/**
 * ===========================================================
 * fileName       : Builder_02_Product
 * date           : 2024-02-17
 * description    :
 * ===========================================================
 */
// Product
class Car {
    private String engine;
    private int wheels;
    private String color;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                '}';
    }
}

// Builder
interface CarBuilder {
    void buildEngine();

    void buildWheels();

    void buildColor();

    Car getCar();
}

// ConcreteBuilder
class SportsCarBuilder implements CarBuilder {
    private Car car;

    public SportsCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("V8 Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public Car getCar() {
        return car;
    }
}

// Director
class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void makeCar() {
        carBuilder.buildEngine();
        carBuilder.buildWheels();
        carBuilder.buildColor();
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
}

// 클라이언트 코드
public class Builder_02_Product {
    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        CarDirector director = new CarDirector(builder);

        director.makeCar();
        Car car = director.getCar();

        System.out.println(car);
    }
}

/*
이 예제에서는 Car 객체(제품)의 생성을 SportsCarBuilder(구체적인 빌더)를 통해 단계별로 수행합니다.
CarDirector(지휘자)는 빌더를 사용하여 실제 Car 객체를 조립하는 과정을 지휘합니다.
클라이언트는 CarDirector를 통해 필요한 자동차를 생성할 수 있습니다. 이러한 방식으로,
빌더 패턴은 복잡한 객체의 생성 과정을 단순화하고, 코드의 재사용성 및 유연성을 크게 향상시킵니다.
 */
