package chapter12.pizza;

public class PizzaDemo {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        // Pizza 객체의 속성을 출력
        System.out.println("(" + pizza1.type + ", " + pizza1.size + ")");

        // 매개변수가 있는 생성자를 사용하여 Pizza 객체 생성
        Pizza pizza2 = new Pizza(24, "포테이토");

        // Pizza 객체의 속성을 출력
        System.out.println("(" + pizza2.type + ", " + pizza2.size + ")");
    }
}
