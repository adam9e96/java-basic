package chapter_7_method.a_basic;

/**
 * ===========================================================
 * fileName       : Method_11_OverLoading
 * date           : 2024-02-04
 * description    : 메소드 연습_011
 *
 * * 메서드 오버로딩
 * * C, 파이썬, 자바스크립트에는 없는 기능.
 * '매개변수의 1) 타입 혹은 2) 갯수가 다르면' '같은 이름'을 가진 메서드를 재정의 할 수 있음.
 * * C++, 파이썬, 자바스크립트에 있는 기본값 매개변수 기능은 자바에 없음.
 * ===========================================================
 */
public class Method_08_OverLoading {

    public static void main(String[] args) {
        // 메소드 오버로딩 : 데이터타입과 개수가 다르면 가능
        printGreet(); // 안녕하세요
        printGreet("안녕~"); // 안녕~!
        printGreet("현수", "잘 지내셨나요?"); // 현수님! 잘 지내셨나요?
        printGreet(3); // 안녕하세요. 3번째 보는거네요.
        System.out.println(printGreet(2, 3, 4));

    }

    public static void printGreet() {	// 매개변수가 없는 메소드
        System.out.println("printGreet() 메서드가 실행됩니다.");
//        System.out.println("안녕하세요");
    }

    public static void printGreet(String greeting) {	// String 타입 1개인 메소드
        // 같은 이름의 메서드가 있으나 매개변수가 없음
        System.out.println("printGreet(String greeting) 메서드가 실행됩니다.");
        System.out.println(greeting);
    }

    public static void printGreet(String name, String greeting) {	// String 타입 2개인 메소드
        // 매개변수가 문자열인 매서드가 있으나 갯수가 다름
        System.out.println("printGreet(String name, String greeting) 메서드가 실행됩니다.");
        System.out.println(name + "님!" + greeting);
    }

    public static void printGreet(int cnt) {	// int 타입이 1개인 메소드
        // 매개변수가 하나인 메서드가 있으나 데이터 타입이 다름
        System.out.println("printGreet(int cnt) 메서드가 실행됩니다.");
        System.out.println("안녕하세요." + cnt + "번째 보는거네요.");
    }

    public static int printGreet(int a, int b, int c) { // 리턴타입이 달라도 상관없다. // int 타입이 3개인 메소드
        return a + b + c;
    }
}
