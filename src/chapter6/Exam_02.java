package chapter6;

public class Exam_02 {
	public static void main(String[] args) {
		/*
		 * for 문을 이용해서 다음과 같이 * 을 출력하는 코드를 작성해보세요.
		 *    * i=1 j=4,3,2,[1]
		 *   ** i=2 j=4,3,[2,1]
		 *  *** i=3 j=4,[3,2,1,]
		 * **** i=4 j=[4,3,2,1,]
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
	}
}
