package chapter15.base;

public class TestBase {
    public static void main(String[] args) {
        Derived derived = new Derived();

//        Base base = new Base(10);

    }
    /*
    부모 클래스의 생성자 부터 생성되고
    자식 클래스의 생성자가 실행되었다.

    상속이 되면 부모 클래스의 객체도 생성된다.
    자식클래스 객체 생성시 부모 클래스 객체가 먼저 초기화 된다.
     */
}
