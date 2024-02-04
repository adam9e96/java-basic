package chapter12.calculator2;
// 메소드 오버로딩 연습
public class Calculator {
    // 정사각형의 넓이
    double areaRectangle(double witdh){
        return witdh * witdh;
    }
    // 직사각형의 넓이
    double areaRectangle(double width, double height){
        return width * height;
    }
}
