package chapter_5_loop.b_practice;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : While_Ex02
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class While_Ex02 {
    public static void main(String[] args) {
        /*
         * `while`과 `break`문을 사용. while 의 조건식은 `true`로
         */
        Scanner scanner = new Scanner(System.in);
        int month;

        while (true) {
            System.out.print("올바른 월을 입력하세요. [1-12]");
            month = scanner.nextInt();
            if ((month >= 1 && month <= 12)) {
                break;
            }
        }
        System.out.println("사용자가 입력한 월은 " + month + "입니다.");
        scanner.close();
    }
}