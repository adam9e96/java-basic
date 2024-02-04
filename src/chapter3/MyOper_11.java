package chapter3;

public class MyOper_11 {
	public static void main(String[] args) {
		/*
		 * 증감연산자 '단독으로 사용 할 때'는 전위(++a) 나 후위(++a)나 값이 동일하다.
		 */
		int i = 5;
		i++; // i = i + 1; 과 같은 의미이디ㅏ. ++i; 로 바꿔 써도 결과는 같다.
		System.out.println(i);

		i = 5;
		++i; // 결과 값을 비교하기 위해 i 값을 다시 5 로 변경.
		System.out.println(i);

		/*
		 * 증감연산자를 단독으로 쓰는 경우 결과는 동일하게 나온다.
		 */
	}
}
