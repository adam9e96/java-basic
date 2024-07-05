package chapter20_InnerClass_Factory_runnable_anonymous.innerClass00;


class A {
    // 인스턴스 멤버 클래스(B)
    class B {
    }

    // 인스턴스 필드 값으로 B 객체 대입
    B field = new B();

    // 생성자
    public A() {
        B b = new B(); // 생성자와 메소드에서 내부 클래스 B의 객체를 생성하는
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}

public class InnerClass00 {
    public static void main(String[] args) {

        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();

    }
}
/*
클래스 A 안에 내부 클래스 B가 정의되어 있다.

클래스 A에는 인스턴스 필드 field 가 있으며, 해당 필드의 타입은 내부 클래스 B입니다.
또한 생성자와 메소드에서도 내부 클래스 B의 객체를 생성하는 예시가 있습니다.
InnerClass02 클래스에서 main 메소드에서는 외부에서 내부 클래스 B의 객체를 생성하는 방법을 보여줍니다.
내부 클래스는 자신을 감싼 외부 클래스의 멤버들에 쉽게 접근할 수 있으며, 외부 클래스의 인스턴스를 통해 내부 클래스의 객체를 생성할 수 있습니다.
 A.B b = a.new B();는 외부 클래스 A의 객체 a를 통해 내부 클래스 B의 객체를 생성하는 예시입니다.

내부 클래스는 주로 외부 클래스와 강하게 결합된 상황에서 사용되며, 외부 클래스의 멤버들에 쉽게 접근하고 활용할 수 있도록 설계됩니다.
 */