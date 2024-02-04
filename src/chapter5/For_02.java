package chapter5;

public class For_02 {

	public static void main(String[] args) {
		/*
		 * for 문의 순서
		 */
		int sum = 0; // 총 합을 담을 변수. 초기화가 꼭 필요.

		// for (초기값; 조건식; 증감식)
		for (int i = 1; i <= 10; i++) { // 1부터 10까지의 합
			System.out.println("i = " + i + ", sum = " + (sum += i));
			// for 실행 순서
			// 1) 초기값 실행 i = 1
			// 2) 조건식 확인 i <= 10
			// 3) 조건식이 참이면 명령문 실행 i:1
			// 4) 증감식 실행 i++ , i:2
			// 5) 조건식 확인2 <= 10
			// 6) 조건식이 참이면 명령문 실행 i:2
			// 4) 5) 6) 반복
		}
//		System.out.println(i); // i 는 for 문에서만 유효함

		// 조건문 작성 시 주의 할점
		// if는 틀리면 오류 나는데 for문은 잘못하면 무한루프가 되어버린다.
	}
}
