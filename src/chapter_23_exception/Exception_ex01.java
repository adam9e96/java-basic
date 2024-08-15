package chapter_23_exception;

/**
 * @since 2024.07.31
 */
public class Exception_ex01 {
    public static void main(String[] args) {
        // 비정상 종료를 방지하기 위해 try-catch 블록을 사용하여 예외를 처리합니다.
        int[] arr = new int[10];

        // 배열 초기화
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        // 예외 처리
        try {
            for (int i = 0; i < 11; i++) { // 배열의 크기를 넘어선 접근 시도
                System.out.println(arr[i]); // 인덱스 10에서 예외 발생
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // 예외 발생 시 메시지 출력
            System.out.println(e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
        }

        // 프로그램이 비정상 종료되지 않음을 확인
        System.out.println("프로그램이 정상적으로 종료되었습니다.");
    }
}
