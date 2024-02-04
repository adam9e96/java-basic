package chapter7;

/**
 * ===========================================================
 * fileName       : Array_03
 * date           : 2024-02-04
 * description    : 배열연습_03
 * ===========================================================
 */
public class Array_03 {
	public static void main(String[] args) {
		/*
		 * 배열의 요소 출력하기 `for`문의 주요 용도는
		 * 1) 특정 횟수의 반복 
		 * 2) 배열이나 컬렉션 자료형의 순회 <-- 실제로 이거 용도로 많이 씀
		 */

		int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 배열 생성
//		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 배열 생성

		int index = 0;
		for (int i = 0; i < number.length; i++) { // i가 1이 아닌 0번 부터 시작하는 이유는?
			System.out.println(number[i]); // 인덱스가 0번부터 시작해서. => 인덱스가 0번부터 하는 이유? => 컴퓨터 메모리 계산에 유리해서
			System.out.println("[count: "+(index++)+"]");	// 인덱스 번호 추척
		}
	}
}