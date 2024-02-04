package chapter15.circle;

public class Pizza extends Circle {
    private String name;
//    protected int radius;
//    public Circle (int radius) {
//        this.radius = radius;
//    }
    public Pizza(String name, int radius) {
        super(radius);
        //        super.radius = radius; // 이거는 생성자가 아니다. super(radius) 대체 못한다.
        this.name = name;
    }

    public void print() {
        System.out.println("피자의 종류 : " + this.name + ", 피자의 크기 :" + (radius*2));
        //super은 안붙여도 상관은 없다. 부모타입 필드가 protected 라면.
    }
}
