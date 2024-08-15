package chapter_5_loop.b_practice;
/**
 * ===========================================================
 * fileName       : for_Ex01
 * date           : 2024-01-24
 * description    : for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
 * ===========================================================
 */
public class For_Ex01 {
	public static void main(String[] args) {

		int sum = 0;
		// case1
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 반복
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합 : " + sum);

		// 통상적으로 밑에 코드가 더 좋은 코드라고 한다.
		// 반복문 작업할 때 위는 100번 아래는 33번 정도 이기때문에 반복되는 횟수가 적은 밑에 꺼가 더 좋다
		sum = 0;
		int count = 0;	// 횟수 카운트
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
			count++;
		}
		System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합 : " + sum);
		System.out.println(count); // 코드 실행 횟수 조회
	}
}
