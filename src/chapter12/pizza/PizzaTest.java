package chapter12.pizza;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        System.out.println("(" + pizza1.type + ", " + pizza1.size + ")");


        Pizza pizza2 = new Pizza(24, "포테이토");
        System.out.println("(" + pizza2.type + ", " + pizza2.size + ")");
    }
}
