package chapter_6_array.a_basics;

/**
 * 기본형 변수와 참조형 변수의 비교 방식 차이점
 */
public class Array_11_ComparingPrimitiveAndReferenceTypes {
    public static void main(String[] args) {
        // 기본형 값 비교
        int num1 = 5;
        int num2 = 5;
        String str1 = "가나다";
        String str2 = new String("가나다");

        if (num1 == num2) {
            System.out.println("두 개의 값이 같습니다."); // 실행됨
        } else {
            System.out.println("두 개의 값이 다릅니다.");
        }

        if (str1 == str2) {
            System.out.println("두 개의 참조가 같습니다.");
        } else {
            System.out.println("두 개의 참조가 다릅니다."); // 실행됨
        }

        // 참조형 값 비교
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{1, 2, 3};
        String[] str3 = new String[]{"봄", "여름"};

        if (nums1 == nums2) { // 값을 비교하는 것이 아니라 저장된 참조(주소)를 비교.
            System.out.println("두 개의 참조가 같습니다.");
        } else {
            System.out.println("두 개의 참조가 다릅니다."); // 실행됨
        }
        System.out.println(nums1); // [I@5acf9800
        System.out.println(nums2); // [I@4617c264 : I는 Integer
        System.out.println(str3); // Ljava.lang.String;@36baf30c
    }
}
