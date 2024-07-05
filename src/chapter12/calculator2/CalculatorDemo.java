package chapter12.calculator2;

public class CalculatorDemo {
    public static void main(String[] args) {
        // 객체 생성
        Calculator cal = new Calculator();

        // 정사각형의 넓이 구하기
        double result1 = cal.areaRectangle(10);

        // 직사각형의 넓이 구하기
        double result2 = cal.areaRectangle(10, 20);

        double result3 = cal.areaTriangle(5, 10);

        System.out.println("정사각형 넓이= " + result1);
        System.out.println("직사각형 넓이= " + result2);
        System.out.println("삼각형 넓이= " + result3);
    }
}
