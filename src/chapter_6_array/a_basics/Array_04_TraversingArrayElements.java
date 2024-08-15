package chapter_6_array.a_basics;


// 배열의 요소를 출력하고, 각 요소의 인덱스를 표시하는 Java 프로그램
public class Array_04_TraversingArrayElements {
    public static void main(String[] args) {
        /*
         * 배열의 요소 출력하기 `for`문의 주요 용도는
         * 1) 특정 횟수의 반복
         * 2) 배열이나 컬렉션 자료형의 순회 <-- 실제로 이거 용도로 많이 씀
         */

        // 1. 배열 초기화
        // number 배열을 선언하고, 1부터 10까지의 값을 초기화
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 배열 생성 및 초기화

        // 배열을 초기화 하는 또 다른 방법
//		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 배열 생성 및 초기화 방법2

        // 2. 반복문을 사용한 배열 요소 출력
        int index = 0;

        // 0 번 부터 number의 길이만큼 반복
        for (int i = 0; i < number.length; i++) { // i가 1이 아닌 0번 부터 시작하는 이유는?
            // 3. 배열 요소와 인덱스 출력
            System.out.print(number[i] + " "); // 인덱스가 0번부터 시작해서. => 인덱스가 0번부터 하는 이유? => 컴퓨터 메모리 계산에 유리해서
        }

        System.out.println();

        // 향상된 for 문
        for (int n : number) {
            System.out.print("[ " + index + " index: " + (n) + "]");
        }
    }
}