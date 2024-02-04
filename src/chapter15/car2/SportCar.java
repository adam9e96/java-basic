package chapter15.car2;

/*
속성 : 제조사(maker), 모델 이름(model), 색상(color), 현재 속도(carSpeed)
행위 : 가속(speedUp), 감속(speedDown)

1. 이 속성과 행위 설명을 바탕으로 하는 Car 클래스를 정의하라.
단 가속과 감속의 결과는 carSpeed와 연동되어야 한다.

2. 정의한 Car 클래스에 파라미터로 모든 필드를 초기화하는 생성자를 추가하라.

3. Car 클래스를 상속받는 SportCar 클래스를 정의하고, 가속과 감속 메서드를 스포츠카에 맞게 구현하라
 */
public class SportCar extends Car {

    SportCar(String maker, String model, String color, int carSpeed) {
        super(maker, model, color, carSpeed);
    }

    @Override
    public void speedUp() {
        this.carSpeed += 10;
    }

    @Override
    public void speedDown() {
        this.carSpeed -= 10;
    }

}
