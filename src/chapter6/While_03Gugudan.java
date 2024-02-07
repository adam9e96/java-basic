package chapter6;

/**
 * ===========================================================
 * fileName       : While_03
 * date           : 2024-01-24
 * description    : 중첩 While 문을 이용해 구구단 출력
 * ===========================================================
 */
public class While_03Gugudan {
	public static void main(String[] args) {

		int i = 2;
		while (i <= 9) {
			System.out.println("*** " + i + "단 ***");
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			i++;
		} // end of while (i <= 9)
	}
}
