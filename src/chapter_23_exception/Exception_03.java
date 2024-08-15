package chapter_23_exception;

/**
 *
 * @since 2024.07.31
 */
public class Exception_03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30}; // 배열 선언 및 초기화

        try {
            // 배열의 요소 출력
            System.out.println("arr[2] = " + arr[2]); // 정상 출력
            System.out.println("arr[3] = " + arr[3]); // 예외 발생: ArrayIndexOutOfBoundsException
            System.out.println("arr 출력 완료"); // 예외가 발생하여 실행되지 않음

        } catch (ArrayIndexOutOfBoundsException e) {
            // 예외 처리 코드
            System.out.println(e); // 예외 정보를 출력
            System.out.println("예외 발생: catch 문 수행"); // 예외 발생 알림
        }

        // 예외 발생 여부와 상관없이 실행되는 코드
        System.out.println("try/catch 구문 밖 문장 수행");
    }
}
