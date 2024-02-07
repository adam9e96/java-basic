package chapter6;

/**
 * ===========================================================
 * fileName       : Break_02
 * date           : 2024-01-24
 * description    :
 * 무한루프를 이용하여 `num` 변수의 값을 0부터 시작하여 num이 10이 되면
 * 반복문을 종료하는 프로그램
 * ===========================================================
 */
public class Break_02 {
	public static void main(String[] args) {
		int num = 0;
		// 초기화, 조건식, 증감식 모두 생략 가능
		for (;;) {	// 무한루프가 생성됨
			System.out.println("num = " + num);
			num++;
			if (num == 10) {
				break;
			}
		}
	}
}
