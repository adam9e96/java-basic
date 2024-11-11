package chapter23_exception;

/**
 * {@code Exception_03} 클래스는 배열을 사용하면서 발생할 수 있는
 * {@link ArrayIndexOutOfBoundsException} 예외를 처리하는 방법을 시연합니다.
 *
 * <p>이 클래스는 배열의 요소를 출력하는 과정에서 배열 인덱스 범위를 벗어난
 * 접근을 시도하여 예외가 발생하는 상황을 처리합니다.</p>
 *
 * <p>코드의 흐름은 다음과 같습니다:</p>
 * <ul>
 *   <li>배열의 유효한 인덱스에 접근하여 값을 출력합니다.</li>
 *   <li>배열의 유효하지 않은 인덱스에 접근하려고 시도하여
 *   {@code ArrayIndexOutOfBoundsException} 예외를 발생시킵니다.</li>
 *   <li>예외가 발생하면 {@code catch} 블록에서 예외를 처리하고,
 *   예외 정보를 출력합니다.</li>
 *   <li>예외 발생 여부와 관계없이 프로그램은 마지막 문장을 실행하여
 *   정상적으로 종료됩니다.</li>
 * </ul>
 *
 * @since 2024.07.31
 */
public class Exception_03 {
    /**
     * 예외 처리를 시연하는 메인 메서드입니다.
     * 이 메서드는 배열 요소에 접근하여 값을 출력하는 과정에서
     * 인덱스 범위를 벗어난 접근을 시도하여 발생하는 예외를 처리합니다.
     *
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 30}; // 배열 선언 및 초기화

        try {
            // 배열의 요소 출력
            System.out.println("arr[2] = " + arr[2]); // 정상 출력
            System.out.println("arr[3] = " + arr[3]); // 예외 발생: ArrayIndexOutOfBoundsException
            System.out.println("arr 출력 완료"); // 예외가 발생하여 실행되지 않음

        } catch (ArrayIndexOutOfBoundsException e) {
            // 예외 처리 코드
            System.out.println(e.getMessage()); // 예외 정보를 출력
            System.out.println("예외 발생: catch 문 수행"); // 예외 발생 알림
            System.out.println();
        }

        // 예외 발생 여부와 상관없이 실행되는 코드
        System.out.println("try/catch 구문 밖 문장 수행");
    }
}
