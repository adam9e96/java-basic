package chapter15.car2;

public class Car {
    private String maker, model, color;
    protected int carSpeed;

    public Car(String maker, String model, String color, int carSpeed) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.carSpeed = carSpeed;
    }

    public void speedUp() {
        this.carSpeed++;
        System.out.println("증가된 속도 : " + carSpeed);

    }

    public void speedDown() {
        this.carSpeed--;
        System.out.println("감속된 속도 : " + carSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", carSpeed=" + carSpeed +
                '}';
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public String getModel() {
        return model;
    }

}
