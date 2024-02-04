package chapter7;

public class Continue_01 {
	public static void main(String[] args) {
		/*
		 * continue문 
		 * 현재의 반복을 뛰어넘고 다음 반복을 진행함. 반복문이 진행되다가 
		 * continue 문을 만나면 반복문의 제일 끝으로 가서
		 * 다음 반복을 계속 수행.
		 * 
		 * 0 ~ 100까지의 홀수만 더 함
		 */
		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) {
//			if (num %2 != 0) {
//				total += num;
//		}
			if (num % 2 == 0) {
				continue;
			}
			total += num; // continue를 위에서 실행되면 이건 실행안됨
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
	}
}
