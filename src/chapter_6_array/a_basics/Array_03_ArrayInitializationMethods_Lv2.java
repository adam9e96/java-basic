package chapter_6_array.a_basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Array_03_ArrayInitializationMethods_Lv2 {
    public static void main(String[] args) {

        // 1. Arrays.fill() 메소드 사용
        /*
         * Arrays.fill() 메소드를 사용하여 배열의 모든 요소를 동일한 값으로 초기화 할 수 있다.
         */
        int[] numbers = new int[5];
        Arrays.fill(numbers, 42); // 모든 요소를 42로 초기화
        System.out.println(Arrays.toString(numbers)); // [42, 42, 42, 42, 42]

        // 2. Arrays.setAll() 메소드 사용
        /*
         * Arrays.setAll() 메소드를 사용하여 람다 표현식을 통해 배열을 초기화할 수 있다.
         */
        int[] numbers2 = new int[5];
        Arrays.setAll(numbers2, i -> i + 1); // 인덱스를 이용해 초기화
        System.out.println(Arrays.toString(numbers2));

        // 3. Stream API를 사용한 초기화
        /*
         * Java 8부터 도입된 Stream API를 사용하여 배열을 초기화할 수 있다.
         */
        int[] numbers3 = IntStream.rangeClosed(1, 5).toArray(); // 1부터 5까지 초기화
        System.out.println(Arrays.toString(numbers3));

        // 4. Collections.nCopies() 메소드 사용
        /*
         * Collections.nCopies() 메소드를 사용하여 리스트를 생성한 후, 이를 배열로 변환할 수 있습니다.
         */
        List<Integer> list = Collections.nCopies(5, 42); // 모든 요소가 42인 리스트 생성
        Integer[] numbers4 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(numbers4));

        // 사용된 메서드 Arrays.toString() 에 대해서
        // Arrays.toString() 메서드는 배열을 문자열로 변환하는 데 사용 된다.
        // java.util.Arrays 클래스에 포함되어 있다.

        // 1차원 배열의 경우
        String str = Arrays.toString(numbers);
        System.out.println(str);

        // 다차원 배열의 경우
        /*
         * 다차원 배열의 경우 Arrays.toString()을 사용하면 내부 배열의 주소값이 출력되므로 Arrays.deepToString() 메서드를 사용해야 한다.
         * 이 메서드는 배열을 포함한 배열의 모든 내용을 문자열로 변환한다.
         */
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String arrayAsString = Arrays.deepToString(matrix);
        System.out.println(arrayAsString); // 출력: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

        String arrayAsString2 = Arrays.toString(matrix);

        System.out.println(arrayAsString2); // 주소값이 찍힘
    }
}
