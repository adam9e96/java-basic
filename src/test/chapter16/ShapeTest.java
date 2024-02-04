package test.chapter16;

import chapter14.rect.Rect;

public class ShapeTest {
    public static void print(Shape obj) {
        if (obj instanceof Rectangle)
            System.out.println("실제 타입은 Rectangle");
        if (obj instanceof Triangle)
            System.out.println("실제 타입은 Triangle");
        if (obj instanceof  Circle)
            System.out.println("실제 타입은 Circle");
        if (obj instanceof pentagon)
            System.out.println("실제 타입은 Pentagon");
    }

    public static void main(String[] args) {
        Shape shape1, shape2; // 부모 타입 참조 변수 생성
        shape1 = new Shape(); // 부모타입 = 부모 객체
        shape1.draw(); // Shape Draw
        shape1.x = 1;
        Shape shape3 = new Rectangle();
        // 부모타입 = 자식 객체
        shape3.draw(); // Rectangle Draw

//        shape3.width = 0;
//        shape3.height = 0;

        Rectangle rectangle = new Rectangle();
        rectangle.height = 1;
        rectangle.width = 1;
        rectangle.draw();

        Shape[] shapes = new Shape[4]; // Shape 객체 배열 선언

        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();
        shapes[3] = new pentagon();
//        Object[] shapes2 = new Object[3];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(); // 서로 다른 draw() 메서드가 실행됨. 오버라이딩 되어 있어서 되는거임
        }
        System.out.println("=========================");
        Rectangle shape4 = new Rectangle();
        Triangle shape5 = new Triangle();
        Circle shape6 = new Circle();
        pentagon shape7 = new pentagon();

        print(shape4);
        print(shape5);
        print(shape6);
        print(shape7);

        System.out.println("=============================");
        Rectangle s1 = new Rectangle();
        Triangle s2 = new Triangle();
        Circle s3 = new Circle();
        print(s1);
        print(s2);
        print(s3);
      
    }
}
