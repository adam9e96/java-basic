package chapter12.calculator;

/**
 * 클래스와 객체 개념을 공부.
 * Calculator 클래스는 계산기 객체를 정의하고, 이 객체가 가질 수 있는 행동(메소드)을 명시.
 */
public class Calculator {
    boolean isPower = false;

    /**
     * 전원을 켭니다.
     * 이 메소드를 호출하면 isPower가 true로 설정됩니다.
     */
    void powerOn() {
        System.out.println("전원을 켭니다.");
        isPower = true;
    }

    /**
     * 전원을 끕니다.
     * 이 메소드를 호출하면 isPower가 false로 설정됩니다.
     */
    void powerOff() {
        System.out.println("전원을 끕니다.");
        isPower = false;
    }

    /**
     * 두 정수 값을 더합니다. <br>
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 더할 첫 번째 정수
     * @param y 더할 두 번째 정수
     * @return 두 정수의 합
     */
    int plus(int x, int y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0;
        }
        return x + y;
    }

    /**
     * 두 정수 값을 나눕니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 나눌 첫 번째 정수
     * @param y 나눌 두 번째 정수
     * @return 나눗셈 결과
     */
    double divide(int x, int y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0.0;
        }
        return (double) x / y;
    }

    /**
     * 두 실수 값을 뺍니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 뺄 첫 번째 실수
     * @param y 뺄 두 번째 실수
     * @return 두 실수의 차
     */
    double minus(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0.0;
        }
        return x - y;
    }

    /**
     * 두 실수 중 더 큰 값을 반환합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 실수
     * @param y 비교할 두 번째 실수
     * @return 더 큰 값
     */
    double max(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0.0;
        }
        return x > y ? x : y;
    }

    /**
     * 두 실수의 평균을 계산합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 첫 번째 실수
     * @param y 두 번째 실수
     * @return 두 실수의 평균
     */
    double avg(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0.0;
        }
        return (x + y) / 2;
    }

    /**
     * 두 실수의 합을 계산합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 더할 첫 번째 실수
     * @param y 더할 두 번째 실수
     * @return 두 실수의 합
     */
    double sum(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0.0;
        }
        return x + y;
    }

    /**
     * 두 정수의 합을 계산합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 더할 첫 번째 정수
     * @param y 더할 두 번째 정수
     * @return 두 정수의 합
     */
    int sum(int x, int y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0;
        }
        return x + y;
    }

    /**
     * 두 정수 중 더 작은 값을 반환합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 정수
     * @param y 비교할 두 번째 정수
     * @return 더 작은 값
     */
    int min(int x, int y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0;
        }
        return x < y ? x : y;
    }

    /**
     * 두 정수 중 더 큰 값을 반환합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 정수
     * @param y 비교할 두 번째 정수
     * @return 더 큰 값
     */
    int max(int x, int y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return 0;
        }
        return x > y ? x : y;
    }

    /**
     * 두 실수가 같은지 비교합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 실수
     * @param y 비교할 두 번째 실수
     * @return 두 실수가 같으면 true, 그렇지 않으면 false
     */
    boolean eq(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return false;
        }
        return x == y;
    }

    /**
     * 두 실수가 다른지 비교합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 실수
     * @param y 비교할 두 번째 실수
     * @return 두 실수가 다르면 true, 그렇지 않으면 false
     */
    boolean neq(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return false;
        }
        return x != y;
    }

    /**
     * 첫 번째 실수가 두 번째 실수보다 큰지 비교합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 실수
     * @param y 비교할 두 번째 실수
     * @return 첫 번째 실수가 크면 true, 그렇지 않으면 false
     */
    boolean gt(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return false;
        }
        return x > y;
    }

    /**
     * 첫 번째 실수가 두 번째 실수보다 크거나 같은지 비교합니다.
     * isPower가 true일 때만 작동합니다.
     *
     * @param x 비교할 첫 번째 실수
     * @param y 비교할 두 번째 실수
     * @return 첫 번째 실수가 크거나 같으면 true, 그렇지 않으면 false
     */
    boolean gte(double x, double y) {
        if (!isPower) {
            System.out.println("계산기를 켜세요.");
            return false;
        }
        return x >= y;
    }
}
