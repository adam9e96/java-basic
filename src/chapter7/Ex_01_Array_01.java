package chapter7;

public class Ex_01_Array_01 {
	public static void main(String[] args) {
		/*
		 * for문을 이용해서 arr 배열의 합을 구하세요
		 */
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		// 작성 위치
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum); // 150

		// for each 문으로 작성
		sum =0;
		for (int item : arr) {
//			System.out.println(item);
			sum += item;
		}

		System.out.println("sum = " + sum); // 150

		sum = 0;
		// for 문 역순으로 실행
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum); // 150
	}
}
