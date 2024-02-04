package chapter20.innerClassFpkm999.innerClass01;/*
 * ===========================================================
 * fileName       : InnerClass01
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

class OutClass {
    private final int num = 10; // 외부 클래스 변수
    private static final int sNum = 20; // 외부 클래스 스태틱 변수
    private final InClass inClass;  // 내부 클래스의 참조 변수 선언;

    class InClass {  // 내부 클래스 START // 외부 클래스 안에 들어 있다.
        int inNum = 100;    // 내부 클래스 변수
        static int sInNum = 200;    // 내부 클래스 스태틱 변수

        void inTest() { // 내부 클래스 메서드
            System.out.println("OutClass num = " + num + "(외부 크랠스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수");
        }
        static void sTest() {   // 내부 클래스 스태틱 메소드
            System.out.println("인스턴스 내부 클래스의 static 메소드");
        }


    }

    public OutClass() {  // 외부 클래스의 디폴트 생성자  (매개변수가 없으므로 디폴트 생성자임)
        inClass = new InClass();    // 내부 클래스 생성. 외부 클래스의 객체가 생성된 후에 내부 클래스의 객체 생성 가능

    }

    public void usingClass() {
        inClass.inTest();   // 내부클래스 메서드 호출하기
    }
}

public class InnerClass01 {
    public static void main(String[] args) {
        OutClass outClass = new OutClass(); // 외부 클래스 객체 생성(내부 클래스 객체도 생성됨
        System.out.println("[외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
        System.out.println();

        // case2.
        // 외부클래스.내부클래스 변수명 = 외부클래스의 변수명.`new` 내부클래스();
        OutClass.InClass inClass = outClass.new InClass();  // 외부 클래스의 객체를 이용하여 내부 클래스 생성
        System.out.println("[외부 클래스 변수를 이용하여 내부 클래스 생성");
        inClass.inTest();   // 내부클래스의 변수명. 내부클래스메소드가 가능해졌다.
        System.out.println();

        // 인스턴스 내부 크래스의 static 맴버 사용
        System.out.println(OutClass.InClass.sInNum);    // 내부 클래스 스태틱 변수
        OutClass.InClass.sTest();

    }
}
