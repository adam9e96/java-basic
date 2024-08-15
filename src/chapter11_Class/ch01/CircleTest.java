package chapter11_Class.ch01;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle; // 참조변수 선언 // Circle circle; Circle는 데이터 타입임.
        circle =  new Circle(); // 객체 생성

        // 객체의 필드 접근
        circle.radius = 100;
        circle.color = "blue";

        // 객체의 메서드 접근
        double area = circle.getArea();

        System.out.println("원의 면적:  "+ area);
    }
}
