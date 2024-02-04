package chapter14.rect;

import java.util.Arrays;

public class RectArrayTest {
    public static void main(String[] args) {
        Rect[] list; // 참조 변수 선언
        list = new Rect[5]; // 배열 객체 생성
        // 공간도 같이 선언해야 함.
        // Array initializer expected
//      list = new Rect[]{new Rect(2, 3)}; // 배열 객체 생성
//      list[0] = new Rect(2, 2);

        // 배열 요소 생성
        for (int i = 0; i < list.length; i++) {
            list[i] = new Rect(i, i);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + "번째 사각형의 면적 =  " + list[i].getArea());
        }
        // 테스트 코드
        System.out.println(list); // 객체 배열의 주소값
        System.out.println(list[0].getArea());
        System.out.println(list[0]);
        System.out.println(Arrays.toString(list));
    }
}
