package chapter5;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : For_Ex04
 * date           : 2024-01-24
 * description    : for 문을 이용해서 정수 5개를 입력받아 합을 출력하는 프로그램
 * <p>
 * *
 * * 실행 예) 1번째 정수를 입력해 주세요 >> 1
 * * 2번째 정수를 입력해 주세요 >> 2
 * * 3번째 정수를 입력해 주세요 >> 3
 * * 4번째 정수를 입력해 주세요 >> 4
 * * 5번째 정수를 입력해 주세요 >> 5
 * * 5개 정수의 합은 15 		 * 입니다.
 */
public class For_Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 정수를 입력해 주세요 >> ");
            int input = scanner.nextInt();

            sum += input;

            if (i == 5) {
                System.out.println(i + "개의 정수의 합은 " + sum + "입니다.");
            }
        }
        scanner.close();
    }
}
