package chapter_6_array.a_basics;

/**
 * 자바에서 배열을 초기화 하는 여러가지 방법
 */
public class Array_02_ArrayInitializationMethods {
    public static void main(String[] args) {

        // case1. 직접 값을 넣어 초기화
        /*
         * 배열을 선언하면서 동시에 초기 값을 지정
         * 이 방법은 배열의 크기를 자동으로 결정한다.
         * -> 간단하고 명확하게 배열을 초기화 할 수 있다.
         */
        int[] numbers = {1, 2, 3, 4, 5};

        // case2. 배열의 크기만 지정하고 값을 나중에 할당
        /*
         * 배열의 크기를 지정한다.
         * 그 후 각 요소에 개별적으로 값을 할당한다.
         * -> 배열을 선언하고 초기화 하는 과정을 분리 할 수 있다.
         */
        int[] numbers2 = new int[5];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;

        // case3. 중괄호를 사용한 초기화
        /*
         * 배열을 선언하면서 new 키워드와 중괄호를 사용하여 초기 값을 지정.
         * 배열의 타입을 명시할 수 있다.
         * -> 배열 타입을 명시하면서 초기화 할 수 있다.
         */
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        // case4. 반복문을 통한 초기화
        /*
         * 배열의 크기를 변수로 지정하고 for 문을 사용하며 배열을 초기화
         * -> 배열의 크기가 동적으로 결정될 때 유용하며, 규칙적으로 값을 할당할 때 사용함.
         */
        int size = 5;
        int[] numbers4 = new int[size];
        for (int i = 0; i < size; i++) {
            numbers4[i] = i + 1;
        }
    }
}
