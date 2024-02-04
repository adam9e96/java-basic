package chapter20.innerClass;

/**
 * ===========================================================
 * fileName       : InnerClass01
 * date           : 2024-01-24
 * description    : 내부클래스(InnerClass) 연습-1
 * 내/외부 클래스의 사용범위를 숙지해야된다.
 * ===========================================================
 */
class OutClass {
    /*
       인스턴스 내부 클래스
       인스턴스 변수를 선언할 때와 같은 위치에 선언하며, 외부 클래스 내부에서만 생성하여 사용하는 객체를 선언할 때 사용.
       예를 들어 어떤 클래스 내에 여러 변수가 있고 이들 변수 중 일부를 모아 클래스로 표현할 수 있음.
       이 클래스를 다른 외부 클래스에서 사용할 일이 없는 경우 내부 인스턴스 클래스로 정의.

       외부 클래스의 객체를 먼저 생성하지 않고 인스턴스의 내부 클래스를 사용할 수 없음.
       인스턴스 내부 클래스를 인스턴스 멤버만 가질 수 있음.
       자바 16 (2021년 3월)부터는 내부 클래스에서 정적 멤버를 선언할 수 있게 됨. <-- 개발서 구판의 경우 누락이 되어있으므로 최신판 추천하는 이유가 이런 이유;
     */

    // static 변수 = 클래스변수. 객체 생성 안해도 사용가능한 변수
    private final int num = 10; // 외부 클래스 변수
    private static final int sNum = 20; // 외부 클래스 스태틱 변수
    private final InClass inClass; // 내부 클래스의 참조 변수 선언.

    class InClass { // 내부 클래스 START. // 외부 클래스안에 들어 있다.
        int inNum = 100;    // 내부 클래스 변수
        static int sInNum = 200;    // 내부 클래스 스태틱 변수

        void inTest() { // 내부 클래스 메소드
            System.out.println("OutClass num = " + num + "(외부 크랠스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수");
        }

        static void sTest() {   // 내부 클래스 스태틱 메소드
            System.out.println("인스턴스 내부 클래스의 static 메소드");
        }
    } // 내부 클래스 END.

    public OutClass() {  // 외부 클래스의 디폴트 생성자 (매개변수가 없으므로 디폴트임)
        inClass = new InClass(); // 내부 클래스 생성. 외부 클래스의 객체가 생성된 후에 내부 클래스의 객체 생성 가능. // super() 느낌인데 위치가 뒤바뀐 느낌.
    }

    public void usingClass() {  // 외부 클래스의 메소드(내부 메서드를 호출하기위한)
        inClass.inTest();   // 내부 메서드 호출하기
    }
}

public class InnerClass01 {
    public static void main(String[] args) {
        OutClass outClass = new OutClass(); // 외부 클래스 객체 생성
        System.out.println("[외부 클래스 이용하여 내부 클래스 기능 호출]");
        outClass.usingClass();  // 내부 클래스 기능 호출 (외부 클래스의 메소드로 하는거임)
        System.out.println();

        //외부클래스.내부클래스 변수명 = 외부클래스의 변수명.`new` 내부클래스(); // 외부클래스 객체가 이미 선언된 상태에서 가능
        OutClass.InClass inClass = outClass.new InClass(); // 외부 클래스의 객체를 이용하여 내부 클래스 생성
        System.out.println("[외부 클래스 변수를 이용하여 내부 클래스 생성]"); // 외부 클래스를 이용해서 내부 클래스 생성시  간접 실행가능
        inClass.inTest(); // 내부클래스의 변수명.내부클래스메소드가 가능해졌다.

        System.out.println();

        // 인스턴스 내부 클래스의 static 멤버 사용
        System.out.println(OutClass.InClass.sInNum);  // 내부 클래스 스태틱 변수
//        System.out.println(OutClass.InClass.); 스태틱이 붙어있더라도 내부 클래스는 외부클래스.내부클래스. 부터 스태틱타입들이 보임
        OutClass.InClass.sTest(); // 인스턴스 내부 클래스의 static 메소드
        
    }
}