package chapter16.shape;

public class Shape {
    /*
    각 도형들은 2차원 공간에서 도형의 위치를 나타내는 기준점 (x, y)를 가짐.
    이것은 모든 도형에 공통적인 속성이므로 부모 클래스인 Shape에 저장
     */
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
    /*
    Shape를 상속받아서 사각형을 나타내는 클래스.
    추가적으로 Width, height 변수를 가짐
     */
    public int width, height;

    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape {
    public int base, height;

    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape {
    public int radius;

    @Override
    public void draw() {
        System.out.println("Circle Draw");
    }
}
class pentagon extends Shape{
    public int hypotenuse;
    @Override
    public void draw() {
        System.out.println("pentagon Draw");
    }
}
class Line extends Rectangle{
    public int dot;

    @Override
    public void draw() {
        System.out.println("line draw");
    }
}