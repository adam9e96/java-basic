package chapter15.base;

public class Derived extends Base{
    public Derived(){
//        super(); 묵시적으로 부모 클래스 호출을 위한 코드가 생성됨
        super(10);
        System.out.println("Derived() 생성자");
    }
}
