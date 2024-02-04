package test.chapter15.circle;

class Circle {
    protected int radius;
    public Circle (int radius){
        this.radius = radius;
    }
}
class Pizza extends Circle {
    private String name;
    public Pizza ( String name, int radius) {
        super(radius);
//        super.radius = radius;
        this.name = name;
    }
    public void print(){
        System.out.println("피자의 종류 : "+this.name + ", 피자의 크기 : "+ (radius * 2));
    }

}
public class Main {
    public static void main(String[] args) {
    Pizza pizza = new Pizza("Peperoni", 10);
    pizza.print();

    }
}
