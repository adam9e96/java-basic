package chapter6;

public class DoWhile_01 {
	public static void main(String[] args) {
		/*
		 * while 문과 유사한데 조건식이 맞든 틀리든 일단 한번은 실행하고 조건식 검사를 원하는 경우
		 * do ~ while 를 문법을 사용할 수 있다.
		 * do{
		 * // 실행할 코드
		 * } while (조건식);
		 */
		int num = 100;
		do {
			System.out.println("적어도 한번은 출력되는 문장");
		} while (num < 10);
	}
}
