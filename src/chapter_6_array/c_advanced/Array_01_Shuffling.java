package chapter_6_array.c_advanced;

/**
 * 자바에서 배열을 초기화하고, 배열의 요소를 랜덤하게 섞는 방법
 */
public class Array_01_Shuffling {
    public static void main(String[] args) {

        int[] number = new int[10]; // 크기가 10인 int 배열을 선언하고 생성

        // 배열 초기화
        System.out.println("[ 기존 배열 요소 ]");
        for (int i = 0; i < number.length; i++) {
            number[i] = i; // 배열을 0 ~ 9의 숫자로 초기화
            System.out.print(number[i] + " "); // 초기화된 배열 요소 출력
        }
        System.out.println(); // 줄 바꿈

        // 배열 섞기
        for (int i = 0; i < 10000; i++) {
            // Math.random()을 이용하여 0 ~ 9 중의 한 값을 임의로 얻는다
            int n = (int) (Math.random() * 10);

            // swap
            int temp = number[0]; // 0번째 값을 temp 변수에 저장
            number[0] = number[n]; // n번째 값을 0번 자리에 저장
            number[n] = temp; // temp 값을 n 번째 자리에 저장
        }

        System.out.println("[ 배열 섞기 결과 ]");

        // 섞인 배열 출력
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // 섞인 배열 요소 출력
        }
    }
}
