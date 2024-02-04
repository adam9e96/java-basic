package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
public class Arrays_ {

	public static void main(String[] args) {
//		int[][] scores = new int[3][4];
//		3행 4열
//		2차원 배열은 행과 열이다. 사용할때는 for문을 돌린다. 정도만 숙지하자
		int[][] arr = new int[2][3]; // 층은 2개 방은 3개

		// 2차원 배열의 초기값 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("행: " + arr.length); // 층(행)의 개수만 불러와짐
		System.out.println("열: " + arr[0].length); // 열의 개수만 불러와짐
		/*
		 * 1. 2차원 배열은 행열로 구성.
		 * 2. 데이터 타입 선언시에 대괄호가 하나 더 들어감. 예) int[][]
		 * 3. 메모리 할당시 (new 사용시) 행과 열에 간한 값이 따로 지정.
		 * 예) new int[2][3] [행][열]
		 * 4. 배열을 순회 하려면 for문이 2개 필요
		 */
	}

}
