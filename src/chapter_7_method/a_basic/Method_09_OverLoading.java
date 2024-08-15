package chapter_7_method.a_basic;

/**
 * ===========================================================
 * fileName       : Method_12_OverLoading
 * date           : 2024-02-04
 * description    : 메소드 연습_12 메소드 오버로딩
 * ===========================================================
 */
public class Method_09_OverLoading {
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰수는 " + getMax(a, b, c) + "입니다.");
		System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰수는 " + getMax(a, b) + "입니다.");
	}

	public static int getMax(int a, int b) {
		return (a > b) ? a : b;
	}

	public static int getMax(int a, int b, int c) {
		// 변수 한개 만들고 해라
		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;
		return max;
	}
}