package chapter3;

public class MyOper_12 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자 `단독으로 사용하지 않는 경우` 에는 전위, 후위에 따라 결과 값이 다름
		 */

		/*
		 * 단독으로 사용되지 않고 println과 같이 사용된다면 어떨까
		 */
		int i = 5, j = 5;

		System.out.println(i++); // 5. 출력 후 증가
		// print i; i = i + 1;
		System.out.println(++j); // 6. 증가 후 출력
		// j = j + 1; print j;
		System.out.println("i = " + i + ", j = " + j); // 6 6 실행 후에는 동일

	}

}
