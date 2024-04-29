package chapter2;

public class Ex_02 {
	/*
	 * 다음은 십의 자리 이하는 버리는 코드.
	 * 변수 value 의 값이 356이라면 300이 나올 수 있도록 코드 작성.
	 * 산술 연산자만 사용
	 * 코드 작성 후 value 값을 다른 세자리 숫자로 변경하고 맞게 나오는지 확인.
	 */
	public static void main(String[] args) {
		// case1
		int value = 356;
		System.out.println((value / 100) * 100);

		// case2
		int value2 = 356;
		System.out.println(value2 - (value2 % 100));
	}
}
