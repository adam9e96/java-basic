package chapter_7_method.b_practice;

/**
 * 주어진 밑변과 높이를 사용하여 사각형의 넓이를 계산하는 예제를 포함하는 클래스
 * 계산은 calculator() 메서드를 통해 수행됩니다.
 *
 * @since 2024.08.11
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        // 밑변이 30, 높이가 10인 사각형의 넓이를 계산하여 출력해보는 예제
        int width = 30;
        int height = 10;
        System.out.println("결과값 :");
        System.out.println("밑변이 " + width + " 높이가 " + height + "인 사각형의 넓이는 " + calculator(width, height) + "입니다.");
    }

    /**
     * 주어진 밑변과 높이를 사용하여 사각형의 넓이를 계산합니다.
     *
     * @param a 사각형의 밑변
     * @param b 사각형의 높이
     * @return 사각형의 넓이
     */
    static int calculator(int a, int b) {
        System.out.println("계산을 시작합니다.");
        return a * b;
    }
}
