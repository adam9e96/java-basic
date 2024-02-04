package chapter15;

class Car{
    private String maker,model,color;
    int carSpeed;
    public Car(String maker,String model,String color, int carSpeed){
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.carSpeed = carSpeed;
    }
    public void speedUp(){
        this.carSpeed++;
    }
    public void speedDown(){
        this.carSpeed--;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCarSpeed() {
        return carSpeed;
    }
}

class SportCar extends Car{

    public SportCar(String maker, String model, String color, int carSpeed) {
        super(maker, model, color, carSpeed);
    }
}
public class TestCar2 {

}
