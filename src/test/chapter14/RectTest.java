package test.chapter14;

import java.util.Arrays;

public class RectTest {
    public static void main(String[] args) {
//        Rect[] list; // 참조 변수 선언
//        list = new Rect[]{new Rect(2, 3)}; // 배열 객체 생성
        Rect[] list = new Rect[5];
//        list[0] = new Rect(2, 2);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Rect(i, i);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + "번째 사각형의 면적 = " + list[i].getArea());
        }

        System.out.println(list);
        System.out.println(list[0]);
        System.out.println(Arrays.toString(list));
        System.out.println(list[0].getArea());

    }
}
