package chapter19_InnerClass;

/**
 * {@code OutClass} 클래스는 내부 클래스 {@code InClass}를 포함하는 외부 클래스입니다.
 *
 * <p>내부 클래스 {@code InClass}는 외부 클래스 {@code OutClass}의 인스턴스가 생성된 후에만
 * 인스턴스화될 수 있습니다. {@code InClass}는 외부 클래스의 멤버 변수와 메서드에 접근할 수 있으며,
 * 외부 클래스의 {@code private} 멤버에도 접근이 가능합니다.</p>
 *
 * <p>자바 16부터는 내부 클래스에서 정적 멤버를 선언할 수 있게 되었으며,
 * 이 예제에서도 정적 변수와 정적 메서드를 포함하고 있습니다.</p>
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-02-13
 */
class OutClass {

    /**
     * 외부 클래스의 인스턴스 변수입니다.
     */
    private final int num = 10;

    /**
     * 외부 클래스의 정적 변수입니다.
     */
    private static final int sNum = 20;

    /**
     * 내부 클래스 {@code InClass}의 참조 변수를 선언합니다.
     */
    private final InClass inClass;

    /**
     * {@code InClass}는 외부 클래스 {@code OutClass}의 인스턴스 내부 클래스입니다.
     *
     * <p>내부 클래스는 외부 클래스의 멤버 변수와 메서드에 접근할 수 있으며,
     * 외부 클래스의 객체가 생성된 후에만 인스턴스화할 수 있습니다.</p>
     */
    class InClass {

        /**
         * 내부 클래스의 인스턴스 변수입니다.
         */
        int inNum = 100;

        /**
         * 내부 클래스의 정적 변수입니다.
         */
        static int sInNum = 200;

        /**
         * 내부 클래스의 인스턴스 메서드입니다.
         *
         * <p>이 메서드는 외부 클래스와 내부 클래스의 멤버 변수에 접근하여 값을 출력합니다.</p>
         */
        void inTest() {
            System.out.println("OutClass num = " + num + " (외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수)");
            System.out.println("InClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수)");
            System.out.println("InClass sInNum = " + sInNum + " (내부 클래스의 정적 변수)");
        }

        /**
         * 내부 클래스의 정적 메서드입니다.
         *
         * <p>이 메서드는 내부 클래스의 정적 멤버에 접근할 수 있습니다.</p>
         */
        static void sTest() {
            System.out.println("인스턴스 내부 클래스의 static 메소드");
        }
    }

    /**
     * {@code OutClass}의 기본 생성자입니다.
     *
     * <p>이 생성자는 외부 클래스의 인스턴스를 생성한 후 내부 클래스 {@code InClass}의 객체를 생성합니다.</p>
     */
    public OutClass() {
        inClass = new InClass();
    }

    /**
     * 외부 클래스의 메서드로, 내부 클래스 {@code InClass}의 인스턴스 메서드를 호출합니다.
     */
    public void usingClass() {
        inClass.inTest();
    }
}

/**
 * {@code InnerClass01} 클래스는 {@code OutClass}와 {@code InClass}의 사용을 보여주는 예제입니다.
 *
 * <p>이 클래스에서는 {@code OutClass}의 객체를 생성하고, 이를 통해 {@code InClass}의 객체를 생성하여
 * 내부 클래스의 메서드를 호출합니다.</p>
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-02-13
 */
public class InnerClass02 {

    /**
     * 프로그램의 진입점으로, 외부 클래스와 내부 클래스의 객체를 생성하고,
     * 내부 클래스의 메서드를 호출하는 예제입니다.
     *
     * @param args 명령줄 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        OutClass outClass = new OutClass(); // 외부 클래스 객체 생성

        System.out.println("[외부 클래스 이용하여 내부 클래스 기능 호출]");
        outClass.usingClass();  // 내부 클래스 기능 호출 (외부 클래스의 메서드를 통해 호출)
        System.out.println();

        // 외부 클래스의 객체를 이용하여 내부 클래스의 객체 생성
        OutClass.InClass inClass = outClass.new InClass();
        System.out.println("[외부 클래스 변수를 이용하여 내부 클래스 생성]");
        inClass.inTest(); // 내부 클래스의 메서드를 직접 호출
        System.out.println();

        // 인스턴스 내부 클래스의 정적 멤버 사용
        System.out.println(OutClass.InClass.sInNum);  // 내부 클래스의 정적 변수
        OutClass.InClass.sTest(); // 내부 클래스의 정적 메서드 호출
    }
}
