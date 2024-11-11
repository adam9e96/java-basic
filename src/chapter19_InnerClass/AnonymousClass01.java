package chapter19_InnerClass;

/**
 * 익명 내부 클래스의 사용 예제를 보여주는 Main 클래스입니다.
 * <p>
 * 익명 내부 클래스는 이름이 없는 클래스이며, 주로 한 번만 사용하는 경우에 사용됩니다.
 * 익명 내부 클래스는 두 가지 방법으로 인스턴스화할 수 있습니다:
 * <ul>
 *   <li>메서드를 호출할 때, 주로 인스턴스를 반환하면서 생성됩니다.</li>
 *   <li>참조 변수에 인스턴스를 대입할 때 `new` 키워드를 사용하여 생성됩니다.</li>
 * </ul>
 * </p>
 * <p>
 * 사용 예제:
 * <pre>
 *     Outter outter = new Outter();
 *     Runnable r = outter.getRunnable(3);
 *     r.run();
 * </pre>
 * </p>
 *
 * @version 1.0
 * @since 2024-01-24
 */
public class AnonymousClass01 {
    /**
     * 프로그램 실행이 시작되는 메인 메서드입니다.
     *
     */
    public static void main(String[] args) {
        Outter outter = new Outter();
//        outter.getRunnable(1);
//        outter.getRunnable(2);
        Runnable r = outter.getRunnable(3);
        r.run();
        r.run();
        outter.runnable.run();
    }
}

/**
 * 익명 내부 클래스 사용 예제를 포함한 Outter 클래스입니다.
 */
class Outter {

    /**
     * {@link Runnable} 인터페이스를 구현한 익명 내부 클래스의 인스턴스를 반환합니다.
     *
     * @param i 익명 내부 클래스에 전달되는 정수.
     * @return 구현된 run() 메서드를 가진 {@link Runnable}의 인스턴스.
     */
    Runnable getRunnable(int i) { // 메소드 선언
        int num = 100;

        return new Runnable() { // 1) 메소드를 호출할 때 생성
            @Override
            public void run() {
//                num = 200; // 에러남
//                 i = 10;  // 에러남
                System.out.println(i);
                System.out.println(num);
            }
        };  // 익명 내부 클래스는 실행코드 {}마지막에 ; 사용
    }

    /**
     * 참조 변수에 대입할 때 생성된, {@link Runnable} 인터페이스를 구현한 익명 내부 클래스의 인스턴스입니다.
     */
    Runnable runnable = new Runnable() {    // 2) 참조 변수에 대입할 때 new 예약어를 사용하여 생성.
        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");
        }
    };  // 클래스 끝에 ; 사용
}
