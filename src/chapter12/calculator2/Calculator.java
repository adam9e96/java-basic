package chapter12.calculator2;

/**
 * Calculator 클래스는 메소드 오버로딩을 사용하여 정사각형과 직사각형의 넓이를 계산하는 메소드를 제공합니다.
 *
 * @author fpkm999
 */
public class Calculator {

    /**
     * 주어진 한 변의 길이를 사용하여 정사각형의 넓이를 계산합니다.
     *
     * @param width 정사각형의 한 변의 길이
     * @return 정사각형의 넓이
     */
    double areaRectangle(double width) {
        return width * width;
    }

    /**
     * 주어진 가로 길이와 세로 길이를 사용하여 직사각형의 넓이를 계산합니다.
     *
     * @param width  직사각형의 가로 길이
     * @param height 직사각형의 세로 길이
     * @return 직사각형의 넓이
     */
    double areaRectangle(double width, double height) {
        return width * height;
    }

    /**
     * 주어진 가로 길이와 높이를 이용하여 삼각형의 넓이를 계산합니다.
     *
     * @param width
     * @param height
     * @return 삼각형의 넓이
     */
    double areaTriangle(double width, double height) {
        return (width * height) / 2;
    }
}
