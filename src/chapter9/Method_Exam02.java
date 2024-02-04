package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
import java.util.Scanner;

public class Method_Exam02 {
	/*
	 * 좌하변이 직각이 직각삼각형을 표시하세요.
	 * 별이 출력되는 부분은 putStars() 메서드를 정의해서 구현하세요.
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 */
	public void putStars(int n, int total) { // 5
		// 1
//		for (int j = 1; j < total - n; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j <= n; j++) {
//			System.out.print("*");
//		}
		// 2
//		for (int i = 1 ; i<= 5 ; i ++){
//		    for ( int j = 5 ; j > i ; j--){
//		    System.out.print(" ");
//		    }
//		    for ( int k = 0 ; k < i; k++){
//		    System.out.print("*");
//		    }
//		    System.out.println();
//		}
		for (int i = 1; i <= total; i++) { // 5
			if (i <= total - n) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Method_Exam02 exam1 = new Method_Exam02();

		System.out.println("좌하변이 직각인 직각삼각형을 표시합니다.");
		System.out.print("볓 단 : ");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			// putStars() 메서드 호출
			exam1.putStars(i, n);
			System.out.println();
		}
		stdIn.close();
	}
}
