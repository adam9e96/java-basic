package chapter_5_loop.c_advanced;
/**
 * ===========================================================
 * fileName       : For_05
 * date           : 2024-02-05
 * description    : For 문 연습_05 FloatingPointPrecision
 * ===========================================================
 */
public class For_05FloatingPointPrecision {

	public static void main(String[] args) {
		/*
		 * for 문 돌릴 때는 정수로만 돌리고 실수는 돌리지 마라는 거임 정학하지 않아서.
		 * 
		 * float 타입 카운터 변수 for문을 작성할 때 주의할 점은 초기화 식에서 루프 카운터 변수를 선언할 때 
		 * 부동 소수점을 쓰는 float * 타입을 사용하지 말아야 함 0.1 은 float 타입으로 정확하게 표현할 수 없기 때문에
		 *  x에 더해지는 값이 0.1 보다 약간 커서, 
		 *   * 루프는 9번 실행
		 * 
		 * float과 double 은 계산이 부정확함. 대안으로
			1) 정수로 변환 후 계산 결과 값을 실수로 변환 
			2) 자바에서는 정확한 실수
		 * 계산을 위해 Decimal 클래스를 제공
		 */
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
			/*
			 * 0.1 0.2 0.3 0.4 0.5 0.6 0.70000005 0.8000001 0.9000001
			 */
		}
		// 반복문을 빠져 나오는 경우
		// break문을 만나거나 조건식을 벗어났거나
	}
}
