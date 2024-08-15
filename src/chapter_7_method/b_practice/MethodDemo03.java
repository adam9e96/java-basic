package chapter_7_method.b_practice;

import java.util.Scanner;

/**
 * 이 클래스는 좌하변이 직각인 직각삼각형을 표시하는 메서드를 포함하는 클래스
 *
 * @since 2024.08.11
 */
public class MethodDemo03 {

    /**
     * 주어진 개수만큼의 별을 출력합니다.
     *
     * @param limit 출력할 별의 개수
     */
    public void putStars(int limit) {
        for (int j = 1; j <= limit; j++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MethodDemo03 demo = new MethodDemo03();

        System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
        System.out.print("몇 단 : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // putStars() 메서드 호출
            demo.putStars(i);
            System.out.println();
        }
        scanner.close();
    }
}
