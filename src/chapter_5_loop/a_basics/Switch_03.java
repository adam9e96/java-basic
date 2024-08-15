package chapter_5_loop.a_basics;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_03
 * date           : 2024-02-04
 * description    : 스위치문 연습_03_개선된 switch 문 연습
 * 입력값이 정형화 되어 있는 경우 if 문보다 switch/case 문을 사용하는 것이 코드 가독성면에서 좋다.
 * switch/case 문은 if 문으로 변경이 가능하지만 if 문으로 작성된 모든 코드를 switch 문으로 변경할 수는 없다.
 * ===========================================================
 */

public class Switch_03 {
    public static void main(String[] args) {
        // Java 12 부터 개선된 switch 문을 지원
        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력해 주세요 >>> ");

        int month = scanner.nextInt();
        int day;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> day = 28;
            default -> {
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");
            }
        }
        System.out.println(month + "월은 " + day + "일까지 있습니다.");
        scanner.close();
    }
}
