package chapter7;

/**
 * ===========================================================
 * fileName       : Array_05
 * date           : 2024-02-04
 * description    : 배열연습_05
 * for문을 이용해서 주어진 배열의 항목에서 최대값을 구하세요.
 * ===========================================================
 */
public class Array_05 {
	public static void main(String[] args) {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 }; // 크기는 5 index는 4

		// 작성위치
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
//				System.out.println(max); // 테스트 코드. max 변수에 1, 5 ,8 순으로 들어감
			}
		}
		System.out.println("max : " + max); // 8
//		최대값을 저장하는 변수에 배열 0번째 값을 넣고 비교를 해도 되고 0으로 초기화 한다음 해도 상관없다. int i의 초깃값이 달라짐
	}
}
