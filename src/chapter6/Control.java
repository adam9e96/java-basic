package chapter6;

public class Control { 
	public static void main(String[] args) {
		int num = 0;
		// 초기화, 조건식, 증감식 모두 생략 가능
		for (;;) {
			System.out.println("num = " + num);
			num++;
			if (num == 10) {
				break;
			}
		}
	}
}
