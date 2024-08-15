package chapter_6_array.b_practice;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_Ex12 {

	public static void main(String[] args) {
//		중첩 for 문을 이용해서 주어진 배열의 전체 항목의 합과 평균 값을 구하세요.
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int total = 0;
		float average = 0;

		// 작성위치
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float) total / (arr.length * arr[0].length);
		System.out.println("total = " + total); // 325
		System.out.println("average = " + average); // 16.25
	}
}
