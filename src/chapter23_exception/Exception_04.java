package chapter23_exception;

import java.util.Scanner;

/**
 * {@code Exception_04} 클래스는 여러 개의 예외를 처리하는 방법을 시연합니다.
 * 사용자가 입력한 값을 정수로 변환하고, 두 숫자를 나누는 작업을 수행합니다.
 * 이 과정에서 발생할 수 있는 다양한 예외를 처리합니다.
 *
 * <p>이 클래스는 두 가지 주요 예외를 처리합니다:</p>
 * <ul>
 *   <li><b>ArithmeticException:</b> 0으로 나누기를 시도할 때 발생하는 예외를 처리합니다.</li>
 *   <li><b>NumberFormatException:</b> 입력된 값이 숫자가 아닐 때 발생하는 예외를 처리합니다.</li>
 * </ul>
 *
 * <p>사용자가 입력한 두 숫자를 나눈 결과를 출력하거나, 예외 발생 시 해당 예외에 대한
 * 적절한 메시지를 출력합니다. 예외가 발생하더라도 프로그램은 정상적으로 종료됩니다.</p>
 *
 * @since 2024.07.31
 */
public class Exception_04 {
    /**
     * 예외 처리를 시연하는 메인 메서드입니다.
     * <p>
     * 이 메서드는 사용자가 입력한 두 문자열을 정수로 변환한 후, 두 숫자를 나누는 작업을 수행합니다.
     * <p>
     * 이 과정에서 발생할 수 있는 예외들을 처리하여 프로그램이 중단되지 않고 정상적으로 종료되도록 합니다.
     */
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
