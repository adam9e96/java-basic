package chapter18.abstract01_2;
/**
 * ===========================================================
 * fileName       : Shape.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-1_2
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 *
 * 도형이라는 추상클래스를 만들고 점, 직사각형이 이를 상속받는데
 * darw 라는 공통된 메소드를 추상화하여 그려라.
 * ===========================================================
 */
public abstract class Shape { // 도형. 추상 클래스
    abstract void draw(); // 그림 그리기. 추상 메서드
}

class Point extends Shape { // 점. 추상 클래스 상속받음
    @Override
    void draw() {   // 추상매소드 오버라이딩함
        System.out.println('+');    // 추상 클래스의 draw메소드를 오버라이딩해서 점('+')을 그리는 구체적인 구현을 한다.
    }
}
class Rectangle extends Shape { // 직사각형. 추상 클래스를 상속
    private int width;  // 폭
    private int height; // 높이
    // width와 height라는 두 개의 비공개 인스턴스 변수를 가지고 직사각형 높이와 넓이를 담을 변수를 선언한다.
    // 클래스에는 폭과 높이를 매개변수로 받아들이고 인스턴스 변수를 초기화하는 생성자가 있습니다.
    public Rectangle(int width, int height) { // 생성자를 통해 width와 height를 초기화 한다.
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