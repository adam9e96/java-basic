package chapter18.abstract01_2;
/**
 * ===========================================================
 * fileName       : Shape.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-1_2
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 * ===========================================================
 */
public abstract class Shape { // 도형. 추상 클래스
    abstract void draw(); // 그림 그리기. 추상 메서드
}

class Point extends Shape { // 점. 추상 클래스 상속받음
    @Override
    void draw() {   // 추상매소드 오버라이딩함
        System.out.println('+');
    }
}
class Rectangle extends Shape { // 직사각형. 추상 클래스를 상속
    private int width;  // 폭
    private int height; // 높이

    public Rectangle(int width, int height) { // 생성자
        this.width = width;
        this.height = height;
    }
    @Override
    void draw() { // 추상 메서드 정의
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}