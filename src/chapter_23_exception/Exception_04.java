package chapter_23_exception;

import java.util.Scanner;

/**
 * 여러 개의 예외 처리
 *
 * @since 2024.07.31
 */
public class Exception_04 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요: ");
            String input1 = input.nextLine();
            int num1 = Integer.parseInt(input1); // 문자열을 정수로 변환

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = input.nextLine();
            int num2 = Integer.parseInt(input2); // 문자열을 정수로 변환

            int result = num1 / num2; // 두 숫자를 나누기
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("예외 발생: 숫자가 아닌 값을 입력했습니다.");
        }

        System.out.println("프로그램이 정상적으로 종료됩니다.");
    }
}
