package chapter16.shape;

// 다형성 연습 1 이거 다음에 업캐스팅,다운캐스팅
public class ShapeTest {

    // 업캐스팅은 동적 바인딩의 용도로 많이 사용하지만 메서드의 매개 변수를 선언할 때도 많이 이용.
    // 메서드의 매개 변수를 부모 타입으로 선언하면 훨씬 많은 범위의 객체를 받을 수 있음.
//    public static void print(Shape shape) { // 다형성을 이용한 예. shape1,2,3_ 다양한 개체를 받을 수있는 부모 타입으로 하면 받을 수 있다.
    // Shape shape 매개 변수로 Shape에서 파생된 모든 클래스의 객체를 받을 수 있음
//        System.out.println("x= " + shape.x + " y= " + shape.y);
    // =========================================================
//}
    public static void print(Shape obj) {
        if (obj instanceof Rectangle)
            System.out.println("실제 타입은 Rectangle");
        if (obj instanceof Triangle)
            System.out.println("실제 타입은 Triangle");
        if (obj instanceof Circle)
            System.out.println("실제 타입은 Circle");
    }

    public static void main(String[] args) {
//        Shape shape1, shape2; // 부모 타입 참조 변수 생성
//        shape1 = new Shape();
//        Shape shape3 = new Rectangle(); // Rectangle 객체를 Shape 타입의 변수로 가르킴.
//        shape3.draw(); // Rectangle Draw <-- 가르키는건 부모 타입의 draw() 메소드이지만 직사각형클래스의 오버라이딩된 Draw() 메소드가 실해오디었다.


        Shape shape = new Rectangle(); // Rectangle 의 객체를 Shape 형 변수에서 참조
        // Rectangle 객체에 있는 사용할 수 있는 필드는 4개 (자기꺼 2개, 상속받은 부모 필드 2개)
        // 근데 부모 티입으로 접근 하는 경우
        // Shape 형 클래스의 멤버에만 접근 가능(부모 객체필드) <-- 오러라이딩된 자식객체는 실행가능함.
        shape.x = 0;
        shape.y = 0;

        // 컴파일 오류. Shape 형의 참조 변수로는 Rectangle 의 클래스의 변수와 메서드에는 접근이 안됨.
//        shape.width = 0;
//        shape.heigth = 0;
        shape.draw(); // 부모 타입의 draw() 메소드 접근가능. 단 자식 객체에 동일한 이름으로 오버라이딩된 메소드가 있으면 그거 실행함
        // 오버라이딩된 자식 메소드아님. 부모 클래스에 있는 draw()임, Retangle클래스의 draw() 메소드 지워도 잘됨.
        // 오버라이딩된 메소드가 실행됨

//      Rectangle shapes = new Rectangle(); // <- 이러헥 하는 경우 문제없이가능
//      shapes.draw();

        Rectangle rectangle = new Rectangle();
//        rectangle.width = 0;
//        rectangle.draw(); // Rectangle Draw
//        Rectangle shape3 = new Shape(); // 부모타입의 객체를 데이터 타입이 자식타입의 경우는 안된다.

        System.out.println(" part 2 ==============================================");

        Shape[] shapeArr = new Shape[3]; // Shape 객체 배열 선언.

        // 다형성에 의해 Shape 를 상속받는 모든 클래스 객체를 저장
        // 공통된 부모 타입이 있으면 상속받는 모든 클래스 객체를 객체 배열로 저장할 수 있다.
        shapeArr[0] = new Rectangle();
        shapeArr[1] = new Triangle();
        shapeArr[2] = new Circle();
//        Object[] shapeArr2= new Shape[5]; // 이것도 된다. <-- 자바에선 잘 안쓰고 자바스크립트에서 많이 쓴다고 함
//        Object[] shapes2 = new Object[3];

        for (int i = 0; i < shapeArr.length; i++) {
            shapeArr[i].draw(); // 서로 다른 draw() 메서드가 실행. 오버라이딩되어 있기때문.
        }
        /*
            Rectangle Draw
            Triangle Draw
            Circle Draw
         */

        System.out.println("part 3 ===============================================");
//        Rectangle shape1_ = new Rectangle();
//        Triangle shape2_ = new Triangle();
//        Circle shape3_ = new Circle();
//
//        print(shape1_);
//        print(shape2_);
//        print(shape3_);

        System.out.println("-------------------------------------------------------");
        Rectangle s1 = new Rectangle();
        Triangle s2 = new Triangle();
        Circle s3 = new Circle();

        print(s1);
        print(s2);
        print(s3);

        System.out.println("--------------------------------------------------");
//        Rectangle c1 = new Line();
        Line l1 = new Line();
        Rectangle L2 = new Rectangle();
//        Rectangle L3 = l1; // 업캐스팅
        Rectangle LL = new  Rectangle();

        Rectangle L4 = new Line(); // 업캐스팅이다.
    }
}
