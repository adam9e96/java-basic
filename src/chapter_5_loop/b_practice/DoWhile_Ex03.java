package chapter_5_loop.b_practice;

import java.util.Random;

/**
 * ===========================================================
 * fileName       : DoWhile_Ex03
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class DoWhile_Ex03 {
    public static void main(String[] args) {
        /*
         * while문과 Random.nextInt() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
         * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요.
         * 눈의 합이 5가 되는 조합은 (1, 4), (4, 1) (2, 3), (3, 2) 입니다.
         * 예) (5, 1)
         */
        Random random = new Random();

//        while (true) {
//            int num1 = random.nextInt(6) + 1;
//            int num2 = random.nextInt(6) + 1;
//
//            System.out.println("(" + num1 + ", " + num2 + ")");
//
//            if ((num1 + num2) == 5) {
//                break;
//            }
//        }
        // do ~ while 문 변경

			int num1;
			int num2;
			do {
				num1 = random.nextInt(6) + 1;
				num2 = random.nextInt(6) + 1;

				System.out.println("(" + num1 + ", " + num2 + ")");

			} while ((num1 + num2) != 5);
    }
}
