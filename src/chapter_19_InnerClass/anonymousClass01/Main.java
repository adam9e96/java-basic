package chapter_19_InnerClass.anonymousClass01;

/*
 * ===========================================================
 * fileName       : Main
 * date           : 2024-01-24
 * description    : 익명 내부 클래스 : 이름을 사용하지 않는 클래스. #이름이_없는_객체
 * 사용방법
 * 1) 메서드를 호출 할 때 생성되거나
 * 2) 참조 변수에 대입할 때 `new` 예약어를 사용하여 생성
 * ===========================================================
 */

class Outter {
    Runnable getRunnable(int i) { // 메소드 선언
        int num = 100;

        return new Runnable() { // 1) 메소드를 호출할 때 생성. // 여기서 회색글자된 이유는 더 좋은 람다방식이 있는데 안써서 그럼.
            // 익명 내부 클래스. 리턴 용도로만 사용할 것이라서 익명 내부 함수 사용. 클래스를 바로 생성.
            @Override
            public void run() {
//                num = 200; // 에러남
//                 i = 10;  // 에러남
                System.out.println(i);
                System.out.println(num);
            }
        };  // 익명 내부 클래스는 실행코드 {}마지막에 ; 사용
    }

    Runnable runnable = new Runnable() {    // 2) 참조 변수에 대입할 때 new 예약어를 사용하여 생성.
        // 익명 내부 클래스. 객체 생성 시 run() 메소드만 오버라이딩 해서 사용.
        @Override
        public void run() {
            System.out.println("Runnable 이 구현된 익명 클래스 변수");
        }
    };  // 클래스 끝에 ; 사용
}

public class Main {
    // 못ㅈ거음
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.getRunnable(1);
        outter.getRunnable(2);
        Runnable r = outter.getRunnable(3);
        r.run();

    }
}
