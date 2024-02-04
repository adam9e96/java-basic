package chapter15.circle;

// 원을 나타내는 Circle 클래스를 상속 받아서 피자를 나타내는 Pizza 클래스를 작성해 보자.
public class CircleTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pepperoni", 10);
        pizza.print(); // 피자의 종류 : Pepperoni, 피자의 크기 :20
    }
}
