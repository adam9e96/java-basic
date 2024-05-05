package chapter20_InnerClass_Factory_runnable_anonymous.runnable_class;

/**
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : Runnable : 지역 내부 변수
 * innerClass03 이후
 * 이렇게 클래스 안에 클래스를 사용하는이유
 * 따로 빼놔도 되는데 그렇게 되면 하나의 파일만 볼게 아니라 여기저기 봐야됨.
 * 지역 내부 클래스는 힙영역에 생성되고 실행이 끝나면 삭제되기 때문?에 값 변경은 불가능하나
 * 저장된 값을 보는 것은 가능하다.
 * ===========================================================
 */
/*
    로컬 내부 클래스 : 외부 클래스의 메서드 내에서 정의된 클래스.
    메서드 호출 시에 생성되고 복귀하면 소멸

    메서드의 지역변수는 스택메모리에서 실행되므로 호출 후 복귀하면 소멸.
    하지만 지역 내부 클래스의 객체는 힙에서 실행이 되므로 메서드가 호출이 끝나고 복귀하더라도 살아있음.
    로컬 내부 클래스는 프로그래밍에서 거의 사용하지 않음. 이런 내부 클래스가 있다는 정도만 알아두는 정도.
 */
class OutClass {    // 외부 클래스
    // Runnable 인터페이스를 구현하는 클래스를 지역 내부 클래스로 만든 예제.
    int outNum = 100;   // 외부 클래스 변수
    static int sNum = 200;  // 외부 클래스 전역 변수

    Runnable getRunnable(int i) {    // 반환형이 Runnable 인 메서드
        int num = 100;
            /*
            Runnable 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스로 java.lang 패키지에 선언되어 있으며
            반드시 run() 메서드를 구현해야 함.
             */
        class myRunnable implements Runnable {
            int localNum = 10;


            @Override
            public void run() {
                /*
                    지역 내부 클래스가 선언된 메서드의 지역변수는 사용하지 못함.
                    num = 200;  // 에러 남. 지역변수는 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능.
                    i = 100; // 에러남. 매개 변수 역시 지역변수처럼 상수로 바뀜. 값은 변경은 못해도 보는 것은 가능
                 */
                System.out.println("i =" + i);  // 값은 변경은 못해도 보는 것은 가능.
                System.out.println("num = " + num); // 값은 변경은 못해도 보는 것은 가능. <-- 여기 선언된것들은
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + OutClass.sNum + "(외부 클래스 정적 변수");
            }
        }
        return new myRunnable();
    }

}

public class Main {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        Runnable runner = out.getRunnable(10);
        runner.run(); // 이렇게 적는 것도 귀찮음. 다른곳에서도 활용을 못하니까 굳이 이름까지  적어줄 필요가 있는가 .. 그래서 익명 내부 클래스 씀
    }
}
