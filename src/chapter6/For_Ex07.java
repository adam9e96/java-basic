package chapter6;
/**
 * ===========================================================
 * fileName       : For_Ex07
 * date           : 2024-01-24
 * description    :
 * ===========================================================
 */
public class For_Ex07 {
	public static void main(String[] args) {
		/*
		 * for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요.
		 *    * i=1 j=1,2,3,4
		 *   ** i=2 j=1,2,3,4
		 *  *** i=3
		 * **** i=4 
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		/*  ****
		 *	***
		 *	**
		 *	*
		 */
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
