package static_demo;

class MyClass {
    // static 변수
    static int staticVar = 3;

    // static 메서드
    static void staticMethod() {
        System.out.println("스태틱 메소드 호출");
    }

    // 인스턴스 메서드
    void instanceMethod() {
        System.out.println("인스턴스 메소드 호출");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // static 변수에 접근
        System.out.println("static variable : " + MyClass.staticVar);

        // static 메서드 호출
        MyClass.staticMethod();

        // 객체 생성 후 인스턴스 메서드 호출
        MyClass obj = new MyClass();
        obj.instanceMethod();

        // 객체를 통해 static 변수에 접근할 수도 있지만 권장되지 않음
        obj.staticVar = 10;
        System.out.println("static variable : " + MyClass.staticVar);
        /*
         * Static 변수: staticVar는 클래스 변수로, 모든 인스턴스가 공유합니다. 따라서 객체를 생성하지 않고도 MyClass.staticVar로 접근 가능합니다.
         * Static 메서드: staticMethod()는 객체 없이 호출할 수 있는 클래스 메서드입니다.
         * 인스턴스 메서드: instanceMethod()는 객체를 생성한 후에만 호출할 수 있습니다.
         */
    }
}
