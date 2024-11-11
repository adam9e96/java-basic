package chapter23_exception;

/**
 * {@code Exception_02} 클래스는 산술 연산에서 발생할 수 있는
 * {@link ArithmeticException} 예외를 처리하는 방법을 시연합니다.
 *
 * <p>이 클래스는 0으로 나누기를 시도하여 발생하는 예외를 처리하고,
 * 예외가 발생하더라도 프로그램이 정상적으로 계속 진행되도록 합니다.</p>
 *
 * <p>코드의 흐름은 다음과 같습니다:</p>
 * <ul>
 *   <li>0으로 나누기를 시도하여 {@code ArithmeticException} 예외를 발생시킵니다.</li>
 *   <li>예외가 발생하면 {@code catch} 블록에서 예외를 처리하고, 사용자에게
 *   적절한 메시지를 출력합니다.</li>
 *   <li>예외 발생 여부와 관계없이 프로그램은 마지막 문장을 실행하여
 *   정상적으로 종료됩니다.</li>
 * </ul>
 *
 * @since 2024.07.31
 */
public class Exception_02 {
    /**
     * 예외 처리를 시연하는 메인 메서드입니다.
     * 이 메서드는 0으로 나누기를 시도하여 발생하는
     * {@link ArithmeticException} 예외를 처리하고, 예외 발생 시
     * 프로그램이 중단되지 않고 계속 진행되도록 합니다.
     *
     * @param args 명령줄 인수
     */
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
//            int result = 10/1; 1로 변경하면 catch 문장은 출력 안됨
            System.out.println("result is " + result); // 실행 안됨

        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램은 계속 진행됩니다.");
    }
}
