package chapter_6_array.a_basics;

// 배열에서 최대값과 최소값을 찾는 Java 프로그램
public class Array_06_FindMaxAndMin1 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95, 11}; // 주어진 배열을 선언하고 초기화

        // 최대값 및 최소값 초기화
        int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

        // 테스트 코드
        System.out.println("[초기 max: " + max + "]");
        System.out.println("[초기 min: " + min + "]");

        // 1 .. 7 총 6번 반복
        for (int i = 1; i < score.length; i++) { //첫 번째 요소는 이미 `max`와 `min`에 할당되었으므로 i를 1부터 시작합니다.
            if (score[i] > max) { // 배열의 현재 요소가 `max` 보다 큰지 확인하고, 크다면 `max`에 해당 배열의 요소를 저장한다.
                max = score[i];
                System.out.println("max 값 업데이트 : [max: " + max + "]"); // 테스트 코드.if가 true일 때 실행됨
            }
            if (score[i] < min) { // 배열의 현재 요소에 `min` 보다 작은지 확인하고, 작다면 `min`에 해당 배열의 요소를 저장한다.
                min = score[i];
                System.out.println("min 값 업데이트 : [min: " + min + "]");
            }
        }

        System.out.println("최대값 :" + max);
        System.out.println("최소값 :" + min);
    }
}
