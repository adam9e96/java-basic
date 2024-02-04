package chapter13.test;

public class Test {

    public static void main(String[] args) {
        A obj = new A();
        //obj.a =10; // 전용멤버는 다른 클래스에서 접근이 안됨.
        obj.b = 20; // 디폴트 멤버는 접근할 수 있음
        obj.c = 30; // 공용 멤버는 접근할 수 있음
    }
}
