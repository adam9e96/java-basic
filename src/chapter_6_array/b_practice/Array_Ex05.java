package chapter_6_array.b_practice;

import java.util.Arrays;

public class Array_Ex05 {
	public static void main(String[] args) {
		// 로또 중복값 제거
		int[] numbers = new int[6];

		for (int i = 0; i < numbers.length; i++) { // 0, 1, 2, 3, 4, 5
			int temp = (int) (Math.random() * 45) + 1; // 1 ~ 45 의 임의의 값을 얻는다.
			numbers[i] = temp;
//			System.out.println(Arrays.toString(numbers)); // 테스트 코드
//			System.out.println("i : " + i); // 테스트 코드
			System.out.println("temp : " + temp); // temp 는 numbers[1] 의 값과 동일함
			// 기존에 값이 있는지 확인

			for (int j = 0; j < i; j++) { // 0, 1, 2, 3, 4, 5
				boolean isResult = true;
				if (numbers[j] == temp) {
					System.out.println(temp + "은 중복된 값입니다.");
					while (isResult) {
						int temp2 = (int) (Math.random() * 45) + 1; // 다시 뽑아서 temp2에 넣기
						numbers[j] = temp2; // numbers[j]에 넣어보고 다시 비교
						if (numbers[j] != temp) { // 다르면 빠져나감 아니라면 다시 올라가서 새로뽑고 넣기
							break;
						}
					}

				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
