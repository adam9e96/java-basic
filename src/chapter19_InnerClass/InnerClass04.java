package chapter19_InnerClass;

/**
 * OutClass는 정적 내부 클래스를 포함하는 외부 클래스입니다.
 * 정적 내부 클래스는 외부 클래스의 인스턴스 생성 없이 사용할 수 있으며,
 * 외부 클래스의 정적 변수에 접근할 수 있습니다.
 */
class OutClass2 {
    private int num = 10;   // 외부 클래스 변수
    private static int sNum = 20;   // 외부 클래스 스태틱 변수

    /**
     * InStaticClass는 OutClass의 정적 내부 클래스입니다.
     * 이 클래스는 외부 클래스의 인스턴스 변수에 접근할 수 없지만,
     * 외부 클래스의 정적 변수에는 접근할 수 있습니다.
     */
    static class InStaticClass {
        int inNum = 100;    // static 내부 클래스 변수
        static int sInNum = 200;    // static 내부 클래스 static 변수

        /**
         * 일반 메서드로, 내부 클래스의 인스턴스 변수와 외부 클래스의 정적 변수에 접근하여 출력합니다.
         */
        void inTest() {
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
        }

        /**
         * 정적 메서드로, 외부 클래스와 내부 클래스의 정적 변수에 접근하여 출력합니다.
         * 이 메서드는 인스턴스 변수에 접근할 수 없습니다.
         */
        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
        }
    }
}

/**
 * InnerClass03는 메인 클래스이며, 정적 내부 클래스의 메서드를 테스트합니다.
 */
public class InnerClass04 {
    /**
     * 프로그램의 시작점으로, 정적 내부 클래스의 인스턴스 생성 및 메서드 호출을 수행합니다.
     *
     */
    public static void main(String[] args) {
        // 외부 클래스 객체를 생성하지 않고 바로 정적 내부 클래스의 객체 생성이 가능하다.
        OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
        System.out.println("[정적 내부 클래스 일반 메서드 호출]");
        sInClass.inTest();
        System.out.println();

        System.out.println("[정적 내부 클래스의 스태틱 메소드 호출]");
        OutClass2.InStaticClass.sTest();

        OutClass2.InStaticClass sInClass2 = new OutClass2.InStaticClass();
        sInClass2.inTest();
    }
}
