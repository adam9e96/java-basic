package chapter_5_loop.b_practice;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : For_Ex03
 * date           : 2024-01-24
 * description    :
 * 사용자로부터 임의의 양의 정수를 하나 입력받은 뒤 1부터 입력받은 정수까지 모든 정수의 합계를 출력하는 프로그램을 구현하세요.
 * <p>
 * 실행 예) 임의의 양수를 입력하세요 >>> 5 1부터 5사이의 모든 정수의 합계는 15입니다.
 * ===========================================================
 */
public class For_Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 양수를 입력하세요 >>> ");
        int inputNumber = scanner.nextInt(); // 정수 값을 입력 받음

        int sum = 0;

        if (inputNumber > 0) {
            for (int i = 1; i <= inputNumber; i++) {
                sum += i;
            }
//		System.out.printf("1부터 %d 사이의 모든 정수의 합계는 %d 입니다.\n",intValue,sum); 
        } else {    // 0 또는 음수를 입력 한 경우
            System.out.println("양의 정수를 입력하세요.");
        }
        System.out.println("1부터 " + inputNumber + " 사이의 모든 정수의 합계는 " + sum + " 입니다.");
        scanner.close();
    }
}
