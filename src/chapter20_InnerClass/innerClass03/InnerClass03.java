package chapter20_InnerClass.innerClass03;

/*
 * ===========================================================
 * fileName       : InnerClass03.java
 * date           : 2024-01-24
 * description    : 내부 클래스 연습-3
 *                  정적 내부 클래스 `static` inner class
 *                  내부 클래스가 외부 클래스의 생성과 무관하게 사용할 수 있어야 하고, 정적 변수도 사용할 수 있어야 할 때 사용.
 *                  인스턴스 내부 클래스처럼 외부 클래스 멤버와 같은 위치에 정의하고 `static` 예약어를 함께 사용
 *
 *                  InnerClass02과 다른점
 *                  - 내부클래스에 `static` 이 붙음
 * ===========================================================
 */
class OutClass {
    private int num = 10;   // 외부 클래스 변수
    private static int sNum = 20;   // 외부 클래스 스태틱 변수

    static class InStaticClass {    // static 내부 클래스 START.
        int inNum = 100;    // static 내부 클래스 변수
        static int sInNum = 200;    // static 내부 클래스 static 변수

        void inTest() {  // 정적 클래스의 일반 메서드
//            num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
//            외부 클래스 객체를 생성하지 않고 바로 정적 내부 객체 생성할 수 있어서 외부 클래스의 인스턴스 변수 사용을 막음. #InnerClass02 참고
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용");
        }

        static void sTest() {   // 정적 클래스의 static 메서드
            // num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            // inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음 static 타입이 아니라서 생성 순서가 다름
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
        }
    }
}

public class InnerClass03 {
    public static void main(String[] args) {
        // 외부 클래스 객체를 생성하지 않고 바로 정적 내부 클래스의 객체 생성이 가능하다.
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("[정적 내부 클래스 일반 메서드 호출]");
        sInClass.inTest();
        System.out.println();

        System.out.println("[정적 내부 클래스의 스태틱 메소드 호출]");
        OutClass.InStaticClass.sTest();
    }
}
