package chapter9;
//created : 2024-01-10
//updated : 2024-01-10
import java.util.Scanner;

public class Method_06 {

	static int getMax(int a, int b) { // a, b의 최대값을 반환
		// return 이 여러번 나와도 된다.
		System.out.println("함수 시작");
		if (a > b)  return a;
		 else {
			 return b;
		}
//		System.out.println("함수 종료");// <-- 실행 안되는 코드라 에러뜸.
	}

	public static void main(String[] args) {
		/*
		 * return 의 기능 
		 * 1) 값을 반환 
		 * 2) 함수를 종료 (반복문의 break와 비숫)
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 a: ");
		int a = scanner.nextInt();
		System.out.print("정수 b: " );
		int b = scanner.nextInt();
		System.out.println(getMax(a,b));
		scanner.close();
	}
}
