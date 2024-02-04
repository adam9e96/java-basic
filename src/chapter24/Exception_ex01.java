package chapter24;

/**
 * ===========================================================
 * fileName       : Exception_ex01
 * date           : 2024-02-02
 * description    :
 * ===========================================================
 */
public class Exception_ex01 {
    public static void main(String[] args) {
        // 비정상 종료를 하는데, try ~ catch 을 이용해서
        // 예외를 안전하게 처리하도록 코드를 수정할 것
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        try {
            for (int i = 0; i < 11; i++) {
                System.out.println(arr[i]); // [0,1,2,3,4,5,6,7,8,9] index 10번(없는인덱스)에서 에러 발생
            }
        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
        }
    }
}
