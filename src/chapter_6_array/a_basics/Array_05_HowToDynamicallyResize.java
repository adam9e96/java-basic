package chapter_6_array.a_basics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 자바에서 배열의 크기를 동적으로 변경하는 방법
 *
 * @since 2024.07.28
 */
public class Array_05_HowToDynamicallyResize {
    public static void main(String[] args) {
        // 자바에서 배열의 크기를 동적으로 변경하는 방법
        // 1. 배열 자체는 고정된 크기를 가지며 직접적으로는 변경이 불가능하다.
        // 2. 이를 우회하기 위해 새로운 배열을 생성하고, 기존 배열의 요소를 `복사`하여 우회할 수 있다.
        // 방법 :  System.arraycopy() 메서드와 Arrays.copyOf()

        // 방법 1: System.arraycopy() 메서드 사용
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[10]; // 새로운 배열을 더 큰 크기로 생성

        // 기존 배열의 요소를 새 배열로 복사
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

        // 새로운 배열에 추가 요소 전달
        newArray[5] = 6;
        newArray[6] = 7;
        System.out.println("arraycopy : " + Arrays.toString(newArray));

        // 방법 2: Arrays.copyOf 메서드 사용
        int[] originalArray2 = {1, 2, 3, 4, 5};
        int[] newArray2 = Arrays.copyOf(originalArray2, 10);

        // 새로운 배열에 추가 요소 할당
        newArray2[5] = 10;
        newArray2[6] = 11;

        System.out.println("copyOf : " + Arrays.toString(newArray2));

        // 방법 3: ArrayList 사용 (array 사용X)
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 요소 추가
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // 추가 요소 할당
        arrayList.add(6);
        arrayList.add(7);

        System.out.println("arrayList : "+arrayList);

        /*
         *  요약
         *  System.arraycopy(): 배열의 요소를 다른 배열로 복사할 때 사용.
         *  Arrays.copyOf(): 기존 배열을 새로운 크기로 복사하고 확장.
         *  ArrayList: 배열 크기를 동적으로 관리할 수 있는 간단한 방법.
         */

    }
}
