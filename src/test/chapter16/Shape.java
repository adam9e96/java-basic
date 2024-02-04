package test.chapter16;

public class Shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
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
    public void draw(){
        System.out.println("Circle Draw");
    }

}
class pentagon extends Shape {
    public int hypotenuse;
    @Override
    public void draw() {
        System.out.println("pentagon Daw");
    }
}