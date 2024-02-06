package chapter7;

/**
 * ===========================================================
 * fileName       : Array_05
 * date           : 2024-02-04
 * description    : 배열연습_05
 * 주어진 배열의 항목에서 최대값을 구하는 JAVA 프로그램
 * <p>
 * ===========================================================
 */
public class Array_05 {
    public static void main(String[] args) {

        int max = 0;    // 최대값을 저장할 변수 선언 및 초기화

        int[] array = {1, 5, 3, 8, 2}; // 주어진 배열은 선언하고 초기화
		// 크기는 5 index 는 4

//		max = array[0]; // 초깃값으로 0 대신에 배열의 0번째 값을 넣고 시작해도 된다.
        // 작성위치
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {	// 배열의 요소가 max 보다 큰지 확인
                max = array[i];	// 배열의 요소가 max 보다 크다면 요소값을 max변수에 저장
				System.out.println(max); // 테스트 코드. max 변수에 1, 5 ,8 순으로 들어감
            }
        }
        System.out.println("max : " + max); // 최대값인 max 변수 출력
//		최대값을 저장하는 변수에 배열 0번째 값을 넣고 비교를 해도 되고 0으로 초기화 한다음 해도 상관없다. int i의 초깃값이 달라짐
		// 만약 배열의 요소중에 음수가 있다면 어떻게 해야 될까?
    }
}
