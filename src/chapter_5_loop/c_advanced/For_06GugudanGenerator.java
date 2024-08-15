package chapter_5_loop.c_advanced;

/**
 * ===========================================================
 * fileName       : For_06GugudanGenerator
 * date           : 2024-01-24
 * description    : For 문을 이용한 구구단 출력
 * ===========================================================
 */
public class For_06GugudanGenerator {

	public static void main(String[] args) {
		/*
		 * 중첩 for 문
		 * 중첩 for문으로 구구단 출력
		 * for문은 또 다른 for문을 내포할 수 있는데, 이것을 중첩 for문이라고 함.
		 * 이 경우 바깥쪽 for문이 한 번 실행될 때마다 중첩된 for문은 지정된 횟수만큼
		 * 반복해서 돌다가 다시 바깥쪽 for 문이 돌아감.
		 */
//		for (int dan = 2; dan <= 9; dan++) { // 바깥 쪽 for 문. 8번 반복
//			System.out.println("[" + dan + "단]");
//			for (int times = 1; times <= 9; times++) {
//				System.out.println(dan + " X " + times + " = " + dan * times + "	");
//			}
//			System.out.println();
//		}
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.println("["+ dan+ "단" +"]");
//			for (int j = 1; j<=9 ; j++) {
//				System.out.println(dan+ " X "+ j + " = " + dan * j + "    ");
//			}
//		}
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan+"단");
			for (int times = 1; times<= 9; times++) {
				System.out.println(dan + " x " + times + " = "+ dan * times + "    ");
			}
		}
		System.out.println();
	}

}
