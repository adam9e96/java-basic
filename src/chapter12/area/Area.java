package chapter12.area;

/**
 * Area 클래스는 삼각형과 사각형의 넓이를 계산하는 메서드를 제공합니다.
 */
public class Area {
    // manual 메소드만 데이터 영역에 미리 올라감

    /**
     * 사용 가능한 함수 목록을 출력합니다.
     * 클래스 메서드로, 인스턴스를 생성하지 않고 호출할 수 있습니다.
     */
    static void manual() { // static 이 있으므로 클래스 메서드
        System.out.println("=====================.");
        System.out.println("현재 사용 가능한 함수 목록");
        System.out.println("triangle : 삼각형 넓이");
        System.out.println("rectangle : 사각형 넓이");
        System.out.println("=====================.");
    }

    /**
     * 주어진 밑변과 높이를 사용하여 삼각형의 넓이를 계산합니다.
     *
     * @param a 삼각형의 밑변
     * @param b 삼각형의 높이
     * @return 삼각형의 넓이
     */
    double triangle(int a, int b) { // 삼각형 넓이를 반환하는 메서드
        return (double) a * b / 2;
    }

    /**
     * 주어진 가로와 세로 길이를 사용하여 사각형의 넓이를 계산합니다.
     *
     * @param a 사각형의 가로 길이
     * @param b 사각형의 세로 길이
     * @return 사각형의 넓이
     */
    int rectangle(int a, int b) { // 사각형 넓이를 반환하는 메서드
        return a * b;
    }
}
