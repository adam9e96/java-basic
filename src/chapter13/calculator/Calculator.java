package chapter13.calculator;

// 정적 멤버 연습
/*
정적 블록
정적 필드 : 필드 선언과 동시에 값을 초기값을 주는 것이 일반적이다.
생성자에서 초기화를 하지 않는다. 객체 생성없이도 사용할 수있고
생성자는 객체 생성 후 실행되기 떄문.
 */
public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;

    }

    static int minus(int x, int y) {
        return x - y;
    }
}
