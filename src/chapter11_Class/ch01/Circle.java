package chapter11_Class.ch01;
/*
TITLE : JAVA 11일차 : 클래스 수업
created: 2024-01-11
updated: 2024-01-11
 */
/*
 Circle.java의 경우 메인 메서드가 없기 때문에 실행이 안됨
 */
public class Circle {
    public int radius;
    public String color;

    public double getArea(){
        return 3.14 * radius * radius;
    }
}
