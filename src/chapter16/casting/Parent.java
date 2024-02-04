package chapter16.casting;

public class Parent {
    public int a;
    void print() {
        System.out.println("Parent 메소드 호출");
    }
}

class Child extends Parent {
//    public int a;
    public int b;
    @Override
    public void print(){
        System.out.println("Child 메소드 호출");
    }
}