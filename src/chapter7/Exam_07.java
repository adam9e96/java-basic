package chapter7;

public class Exam_07 {
	public static void main(String[] args) {
		// 길이가 5인 배열 생성. 생성 및 초기화를 동시에 할 때는 배열 길이 생략
		int[] a = new int[] { 10, 20, 4, 25, 18 };
		System.out.println(a.length); // 크기계산시 1부터, 인덱스는 0부터 계산함

		// 길이가 7인 배열 생성, new int[] 생략 가능
		int[] b = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(b.length);
	}
}
