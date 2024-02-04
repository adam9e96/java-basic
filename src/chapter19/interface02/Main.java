package chapter19.interface02;
/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : 인터페이스 연습-2
 * 인터페이스 상수는 `public static final`
 * 메소드는 `public abstract` 가 명시적으로 붙음
 * 인터페이스 필드에 public static final 어떤게 붙은 동일함
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
//        MyInterface mi = new MyInterface(); // 인터페이스는 단독 객체 생성이 안됨.
//        MyInterface.w = 50; // 상수라서 값 변경도 안됨.
        System.out.println("w =  " + MyInterface.w);    // 인터페이스 변수는 상수이기에 직접 접근이 가능
        System.out.println("x =  " + MyInterface.x);
        System.out.println("y =  " + MyInterface.y);
        System.out.println("z =  " + MyInterface.z);
//        MyInterface.aba // public abstract 추상메서드라 객체를 생성 하지 않으면 못씀. 인터페이스 단독으로 객체 생성안됨.
        Interface2 interface2 = new Interface2(); // implements 받은 객체 생성
        interface2.aba();   // 인터페이스의 추상 메소드를 재정의한 메소드
//        interface2.x; // w, x, y, z 는 인터페이스의 정적 필드임. 이렇게는 사용 못함
        
    }
}
