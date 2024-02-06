package chapter6;

/**
 * ===========================================================
 * fileName       : For_07
 * date           : 2024-01-24
 * description    : For문연습_7
 * ===========================================================
 */
public class For_07 {
	public static void main(String[] args) {
		/*
		 * 3개의 주사위를 던지는 게임이 있다고 가정하자. 
		 * 중첩 for문을 이용하여 3개의 주사위의 합이 6이 되는 경우를 출력하는 프로그램 작성
		 */
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 6; k++) {
					if (i + j + k == 6) {
						System.out.println("i값 :" + i + ", j값 :" + j + ", k값 : " + k + " = " + (i + j + k));
					}
				}
			}
			System.out.println();
		}
	}
}
