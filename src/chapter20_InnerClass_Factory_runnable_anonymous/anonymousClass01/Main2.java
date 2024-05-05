package chapter20_InnerClass_Factory_runnable_anonymous.anonymousClass01;

class Outter2 {
    public Runnable getRunnable(int i) {
        int num = 100;

        return () -> {
//                num = 200; // 에러남
//                 i = 10;  // 에러남
            System.out.println(i);
            System.out.println(num);
        };
    }

    Runnable runnable = () -> System.out.println("Runnable 이 구현된 익명 클래스 변수");
}

public class Main2 {
    public static void main(String[] args) {
    Outter2 outter = new Outter2();
    Runnable runnable = outter.getRunnable(1);

    runnable.run();
    }
}
