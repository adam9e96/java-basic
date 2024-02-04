package chapter5;

public class For_03 {
	public static void main(String[] args) {
		/*
		 * for 문 외부에 변수 선언 할 경우엔 i 대신 다른 변수명 사용
		 */
		int sum = 0;
//		int sum;
		int num;

		for (num = 0; sum < 100; num++) {
			sum += num; // sum = sum + num -> sum을 초기화 하지 않으면 오류가 남
			System.out.println("num :" + num + " / sum : " + sum);
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		System.out.println("=======================================");
		/*
		 * num : 13 sum : 91일때 까지는 조건식이 참이지만 num++로 num이 14가 되고 sum += num;을 하며 sum은
		 * 105가 되고 조건식이 참이 되지 않아서 for문을 빠져나간다.
		 */
		/*
		 * for 문을 사용해서 10부터 15까지의 합을 구하고 출력.
		 */
		for (sum = 0, num = 10; num < 16; num++) {
			sum += num;
		}
		System.out.println("10부터 15까지의 합 :" + sum);
	}
}
