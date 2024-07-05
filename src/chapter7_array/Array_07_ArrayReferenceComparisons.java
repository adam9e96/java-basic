package chapter7_array;


/**
 * Java 에서 배열 참조 변수 간의 비교
 * 두 배별 변수가 동일한 배열 객체를 참조하는지 여부는 `==` 연산자를 통해 확인한다.
 */
public class Array_07_ArrayReferenceComparisons {
    public static void main(String[] args) {

        // 1. 배열 변수 선언 및 초기화
        int[] arr1; // 배열 변수 arr1 선언
        int[] arr2; // 배열 변수 arr2 선언
        int[] arr3; // 배열 변수 arr3 선언
        int[] arr4 = {1, 2, 3};

        // 2. 배열 생성 및 변수에 대입
        arr1 = new int[]{1, 2, 3}; // 배열 {1, 2, 3} 을 생성하고 arr1 변수에 대입
        arr2 = new int[]{1, 2, 3}; // 배열 {1, 2, 3} 을 생성하고 arr2 변수에 대입
        arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입

        // 3. 배열 참조 비교
        System.out.println(arr1 == arr2); // arr1 과 arr2 변수가 같은 배열을 참조하는지 검사 // false
        System.out.println(arr2 == arr3); // arr2 와 arr3 변수가 같은 배열을 참조하는지 검사 // true

        System.out.println(arr1 == arr4); // false
        System.out.println(arr2 == arr4); // false
    }
}
