package chapter_18_interface.interface08;

/**
 * ===========================================================
 * fileName       : Calc
 * date           : 2024-01-24
 * description    : 인터페이스 연습8
 * Q. 이 인터페이스를 일반 클래스가 아닌 추상 메서드로 구현한다면 어떨까?
 * <p>
 * <p>
 * ===========================================================
 */

public interface Calc { // 인터페이스 만들기
    // 인터페이스에서 선언된 변수는 컴파일 과정에서 상수로 변환됨.
    double PI = 3.14;
    int ERROR = -999999999;

    // 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨.
    public abstract int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    //    == 코드 추가됨 ==    //  복습할때는 주석치고 위에꺼 부터 하고 해라
    // 인터페이스에 디폴트 메소드 구현
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    private void myMethod() { // 디폴트 메소드에서 사용
        // 디폴트 메서드에서만 사용 할려고 만든 메소드
        System.out.println("인터페이스의 private 메서드입니다.");
    }

    // 정적 메소드 구현
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    // private 메서드는 코드를 모두 구현해야 하므로 추상메서드에는 private 예약어를 사용할 수 없음.
    // static 예약어는 함께 사용 가능.
    private static void myStaticMethod() {   // 정적 메소드에서 사용
        System.out.println("private static 메서드입니다.");
    }
}
