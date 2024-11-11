package chapter19_InnerClass;

class Outter2 {
    public Runnable getRunnable(int i) {
        int num = 100;

        // 람다 표현식으로 구현된 Runnable 반환
        return () -> {
            // 변수 i와 num은 final 또는 effectively final이어야 하므로, 값을 변경할 수 없습니다.
            System.out.println(i);   // 매개변수 i의 값 출력
            System.out.println(num); // 지역 변수 num의 값 출력
        };
    }

    // 익명 내부 클래스를 람다 표현식으로 대체
    Runnable runnable = () -> {
        System.out.println("Runnable 이 구현된 익명 클래스 변수");
    };
}

public class AnonymousClass02 {
    public static void main(String[] args) {
        Outter2 outter = new Outter2();
        Runnable runnable = outter.getRunnable(1);

        // getRunnable 메서드에서 반환된 람다 표현식을 실행
        runnable.run();

        // 람다 표현식으로 정의된 인스턴스 변수 runnable 실행
        outter.runnable.run();
    }
}
