package chapter7_array;
/**
 * ===========================================================
 * fileName       : Array_Ex01
 * date           : 2024-01-24
 * description    : 주어진 배열의 합을 계산하는 프로그램 작성
 * 여러 방법으로 객체요소의 합을 구해보자
 * ===========================================================
 */
public class Array_Ex01 {
	public static void main(String[] args) {
	
	
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		// for 문을 이용하여 arr 배열 요소의 합을 구하기
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum); // 150

		// for each 문을 이용하여 배열 요소의 합을 구하기
		sum =0;
		for (int item : arr) {
//			System.out.println(item);
			sum += item;
		}

		System.out.println("sum = " + sum); // 150

		sum = 0;
		// for 문을 역순으로 실행하여 배열 요소를 합산하기
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum); // 150
	}
}
