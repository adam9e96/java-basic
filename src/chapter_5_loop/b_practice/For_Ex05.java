package chapter_5_loop.b_practice;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : For_Ex05
 * date           : 2024-01-24
 * description    : 10이하의 정수를 입력 받아 정수만큼 "JAVA 프로그래밍" 이라고 출력하는 프로그램
 * * 입력 예) 5
 * * 출력 예) JAVA 프로그래밍
 * * 		 JAVA 프로그래밍
 * * 		 JAVA 프로그래밍
 * * 		 JAVA 프로그래밍
 * * 		 JAVA 프로그래밍
 * ===========================================================
 */
public class For_Ex05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("값을 입력 >>> ");
        int value = scanner.nextInt();

        if (value > 0 && value < 11) {
            for (int i = 1; i <= value; i++) {
                System.out.println("JAVA 프로그래밍");
            }
        } else {
            System.out.println("입력 값이 잘못되었습니다.");
        }
        scanner.close();
    }
}
