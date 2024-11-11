package chapter19_InnerClass.runnable_class;

/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : Runnable 인터페이스와 지역 내부 클래스 사용 예제
 * ===========================================================
 */

/**
 * 외부 클래스 OutClass는 내부에 로컬 내부 클래스를 정의하여 Runnable 인터페이스를 구현합니다.
 * 로컬 내부 클래스는 외부 클래스의 메서드 내에서 정의되며, 메서드 호출 시 생성되고 호출이 종료되면 소멸됩니다.
 * 이 예제에서는 로컬 내부 클래스의 객체가 힙 영역에서 실행되어 메서드 호출이 끝나도 살아있음을 보여줍니다.
 */
class OutClass {
    int outNum = 100;   // 외부 클래스 인스턴스 변수
    static int sNum = 200;  // 외부 클래스 정적 변수

    /**
     * Runnable 인터페이스를 구현하는 로컬 내부 클래스를 반환합니다.
     * 이 로컬 내부 클래스는 외부 클래스의 변수와 메서드 매개변수를 참조할 수 있지만,
     * 참조된 변수들은 final로 간주되어 값을 변경할 수 없습니다.
     *
     * @param i 메서드 매개변수로 전달된 값
     * @return Runnable 인터페이스를 구현한 로컬 내부 클래스의 인스턴스
     */
    Runnable getRunnable(int i) {
        int num = 100;

        /**
         * Runnable 인터페이스를 구현하는 로컬 내부 클래스입니다.
         * 외부 클래스의 변수와 메서드의 매개변수에 접근할 수 있습니다.
         */
        class myRunnable implements Runnable {
            int localNum = 10;

            /**
             * Runnable 인터페이스의 run 메서드를 구현합니다.
             * 메서드 호출 시 외부 클래스와 로컬 변수를 출력합니다.
             */
            @Override
            public void run() {
                System.out.println("i = " + i);  // 매개변수 i는 값 변경은 불가능하지만 참조는 가능
                System.out.println("num = " + num); // 로컬 변수 num 역시 값 변경은 불가능하지만 참조는 가능
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
                System.out.println("OutClass.sNum = " + OutClass.sNum + " (외부 클래스 정적 변수)");
            }
        }
        return new myRunnable();  // 로컬 내부 클래스의 인스턴스를 반환
    }
}

/**
 * Main 클래스는 프로그램의 진입점으로, OutClass를 사용하여 Runnable을 구현한 로컬 내부 클래스를 실행합니다.
 */
public class RunnableClass01 {

    /**
     * 프로그램의 진입점 메서드입니다. OutClass의 getRunnable 메서드를 호출하여 Runnable을 실행합니다.
     *
     * @param args 커맨드라인 인자 (사용되지 않음)
     */
    public static void main(String[] args) {
        OutClass out = new OutClass();
        Runnable runner = out.getRunnable(10);
        runner.run(); // 로컬 내부 클래스의 run 메서드를 실행
    }
}
