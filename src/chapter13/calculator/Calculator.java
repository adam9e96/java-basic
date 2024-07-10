package chapter13.calculator;

// 정적 멤버 연습
/*
정적 블록
정적 필드 : 필드 선언과 동시에 값을 초기값을 주는 것이 일반적이다.
생성자에서 초기화를 하지 않는다. 객체 생성없이도 사용할 수있고
생성자는 객체 생성 후 실행되기 떄문.
 */

/**
 * Calculator 클래스는 정적 멤버를 사용하여 기본적인 산술 연산을 수행하는 메서드를 제공합니다.
 * 이 클래스는 객체 생성 없이 사용할 수 있는 정적 필드와 정적 메서드를 포함합니다.
 */
public class Calculator {
    /**
     * 원주율을 나타내는 정적 필드
     */
    static double pi = 3.14159;

    /**
     * 두 정수를 더합니다.
     *
     * @param x 첫 번째 정수
     * @param y 두 번째 정수
     * @return 두 정수의 합
     */
    static int plus(int x, int y) {
        return x + y;

    }

    /**
     * 두 정수를 뺍니다.
     *
     * @param x 첫 번째 정수
     * @param y 두 번째 정수
     * @return 두 정수의 차
     */
    static int minus(int x, int y) {
        return x - y;
    }
}
