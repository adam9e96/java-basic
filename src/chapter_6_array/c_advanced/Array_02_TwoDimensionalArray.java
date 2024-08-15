package chapter_6_array.c_advanced;

public class Array_02_TwoDimensionalArray {

	public static void main(String[] args) {
		// 2차원 배열 초기화 및 출력
		int[][] arr = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		}; // 2차원 배열 선언 및 초기화

		// 배열의 행과 열의 수를 출력
		System.out.println("행: " + arr.length); // 행의 수 출력
		System.out.println("열: " + arr[0].length); // 첫 번째 행의 열 수 출력

		// 2차원 배열의 모든 요소를 출력
		for (int i = 0; i < arr.length; i++) { // 행 반복
			for (int j = 0; j < arr[i].length; j++) { // 열 반복
				System.out.print(arr[i][j] + " "); // 요소 출력
			}
			System.out.println(); // 행이 끝날 때 줄 바꿈
		}
	}
}
