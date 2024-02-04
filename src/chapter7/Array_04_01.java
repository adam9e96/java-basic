package chapter7;

public class Array_04_01 {
	public static void main(String[] args) {
		// for문을 이용해서 주어진 배열의 항목에서 최대값을 구하세요.
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
	}
}
