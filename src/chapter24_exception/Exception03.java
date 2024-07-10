package chapter24_exception;

import java.util.Scanner;

/**
 * 여러 개의 예외 처리
 */
public class Exception03 {
    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);

            System.out.println("첫번째 숫자를 입력하세요");
            String input1 = input.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = input.nextLine();
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
        } catch (NumberFormatException e) {
            System.out.println("예외 발생 : 숫자가 아닌 값을 입력했습니다.");
        }
        System.out.println("프로그램이 정상적으로 종료됩니다.");

    }
}
