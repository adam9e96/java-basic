package chapter15.shape;
/*
오버라이딩 연습
오버라이딩은 부모 클래스의 메서드를 무시하고 덮어씌운다는 의미.
자식 객체에서 해당 메서드를 실행하면 오버라이딩된 메서드가 실행.
 */
public class Shape {
    public void draw() {
        System.out.println("shape");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        super.draw();  // 메소드 오버라이딩할떄 부모의 메서드를 추가 하고 싶을 때 이렇게 한다.
        System.out.println("Circle을 그립니다.");
    }
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}
