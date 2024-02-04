package chapter18.abstract01_2;

/**
 * ===========================================================
 * fileName       : Main.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-1_2
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
//         Shape S = new Shape();
//        추상 클래스는 인스턴스로 할 수 없음. 다만 다형성을 이용해 아래와 같은 방법은 가능함
        Shape[] shapes = new Shape[2]; // 추상 클래스이자 부모 클래스로 데이터 타입을 설정
        shapes[0] = new Point();
        shapes[1] = new Rectangle(4, 3);

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println();
        }
//        for (int i = 0; i < shapes.length; i++) {
//            shapes[i].draw();
//            System.out.println();
//        }

    }
}
