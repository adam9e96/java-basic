package chapter_23_exception;

/**
 * 예외처리 <p>
 * 프로그램이 에러를 발생하더라도 비정상종료를 막아서 일단 끝까지 실행하게 하도록 하는것임. <p>
 * <p>
 * <p>
 * try {
 * // 예외가 발생할 수 있는 코드
 * } catch (예외클래스 변수) {
 * // 예외를 처리하는 코드
 * } finally {
 * // 선택적으로, 예외 발생 여부와 상관없이 실행되는 코드
 * }
 *
 * @since 2024.07.30
 */
public class Exception_01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 0;

        // 아래 코드는 예외가 발생하여 비정상 종료됨
        // System.out.println(" ** 정숫값을 0으로 나누는 연산 **");
        // System.out.println(" 10/0=" + (num / num2));
        // System.out.println("try/catch 구문 밖 문장 수행"); // 위에서 예외가 발생해서 실행을 못하고 끝남

        try {
            System.out.println(" ===== 정숫값을 0으로 나누는 연산 =====");
            System.out.println(" 10/0=" + (num / num2)); // 예외 발생
            System.out.println(" ===== 정숫값을 0으로 나누는 연산완료 ====="); // 이 문장은 실행되지 않음
        } catch (java.lang.Exception e) {
            System.out.println(e); // 예외 정보를 출력
            System.out.println("0으로 나눌 수 없습니다."); // 사용자에게 예외 상황을 알림
        }
        System.out.println("프로그램을 정상 수행합니다."); // 예외 발생 후에도 실행되는 코드
    }
    // 컴파일 하고 콘솔에서 출력되는 코드 번호로도 정상 종료 여부를 확인할 수 있음
    // Process finished with exit code 0 : 정상 종료
    // Process finished with exit code 1 : 비정상 종료
    // try/catch는 예외 해결이 아님. 에러가 발생하더라도 프로그램이 정상적으로 실행되도록 하는 것임
}

/*
    try {
        // 예외가 발생할 수 있는 코드
    } catch (예외클래스 변수) {
        // 예외를 처리하는 코드
    } finally {
        // 선택적으로, 예외 발생 여부와 상관없이 실행되는 코드
    }

    // 예외 처리 개념
    // 예외는 우선 개발자가 예측할 수 있는 곳에서 시작됨 -> 예외가 발생할 가능성이 있는 코드 부분을 try/catch로 감쌈

    // 예외가 발생하는 경우:
    // - ArithmeticException: 숫자를 0으로 나누는 경우
    // - NullPointerException: null 객체에 접근하는 경우
    // - ArrayIndexOutOfBoundsException: 배열의 잘못된 인덱스에 접근하는 경우 등

    // 예외가 발생하지 않는 경우:
    // - 예외가 발생하지 않으면 try 블록 내의 모든 코드가 실행됨
    // - 예외가 발생해도 catch 블록 내의 코드가 실행되어 프로그램이 비정상 종료되지 않음

    예외 처리의 장점
  프로그램의 비정상 종료 방지: 예외가 발생하더라도 프로그램이 완전히 종료되지 않고, 남은 코드를 실행할 수 있습니다.
  에러 정보 제공: catch 블록에서 예외 정보를 제공하여 디버깅을 쉽게 할 수 있습니다.
  정상 흐름 유지: 예외 발생 시 대체 코드를 실행하여 프로그램의 정상적인 흐름을 유지할 수 있습니다.
 */