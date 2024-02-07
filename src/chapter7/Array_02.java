package chapter7;

/**
 * ===========================================================
 * fileName       : Array_02
 * date           : 2024-02-06
 * description    : 배열을 생성하고 초기화 하는 방법
 * ===========================================================
 */
public class Array_02 {
    public static void main(String[] args) {
        // case1. 직접 값을 넣어 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // case2. 배열의 크기만 지정하고 값을 나중에 할당
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;

        // case3. 중괄호를 사용한 초기화
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        // case3. 반복문을 통한 초기화
        int size = 5;
        int[] numbers4 = new int[size];
        for (int i = 0; i < size; i++) {
            numbers4[i] = i + 1;
        }
    }
}
