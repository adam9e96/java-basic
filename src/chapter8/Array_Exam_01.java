package chapter8;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_Exam_01 {
	public static void main(String[] args) {
		// Array_11 을 로또 당첨기로 바꿀려면?

		int[] number = new int[45];
		// 1번부터 45 번 공이 필요

		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.print(number[i] + " ");

			int n = (int) (Math.random() * 45); // 1 ~ 45 중 한 값을 임의의 얻는다.
//			int n = (int) (Math.random() * 10); // 0 ~ 9 중 의 한 값을 임의로 얻는다.

			// swap
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;

		}

		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
