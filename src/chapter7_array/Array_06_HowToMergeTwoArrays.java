package chapter7_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_06_HowToMergeTwoArrays {
    public static void main(String[] args) {
        // 자바에서 두 배열을 병합하는 방법

        // 방법 1: 반복문 사용
        // 반복문을 사용하여 두 배열의 요소를 새 배열에 복사하는 방법
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(mergedArray)); // 출력: [1, 2, 3, 4, 5, 6]

        // 방법 2: System.arraycopy() 사용

        int[] mergedArray2 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, mergedArray2, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray2, array1.length, array2.length);

        System.out.println(Arrays.toString(mergedArray2)); // 출력: [1, 2, 3, 4, 5, 6]

        // 방법 3: Arrays.copyOf() 사용
        int[] mergedArray3 = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, mergedArray3, array1.length, array2.length);

        System.out.println(Arrays.toString(mergedArray3)); // 출력: [1, 2, 3, 4, 5, 6]

        // 방법 4: ArrayList 사용
        Integer[] array3 = {1, 2, 3};
        Integer[] array4 = {4, 5, 6};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array3));
        list.addAll(Arrays.asList(array4));

        Integer[] mergedArrayList = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(mergedArrayList)); // 출력: [1, 2, 3, 4, 5, 6]


    }
}
