package chapter3;

public class test1 {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;// 11 20
		int z = (++x) + (y--);
		System.out.println(z); // 31

		System.out.println("==========");

		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result); // 가
		System.out.println("==========");

		/*
		 * 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇 개를 가질 수 있고, 
		 * 마지막에 몇 개가 남는지를 구하는
		 * 코드
		 */
		int pencils = 534;
		int students = 30;

		// 1인당 가질 수 있는 연필 개수
		int pencilsPerStudents = (pencils / students);

		// 남은 연필 수
		int pencilsLeft = (pencils % students);

		System.out.println(pencilsPerStudents);
		System.out.println(pencilsLeft);

		System.out.println("==========");

		/*
		 * 십의 자리 이하를 버리는 코드. 변수 value 의 값이 356이라면 300이 나올 수 있도록 코드를 작성
		 */
		int value = 356;
		System.out.println((value / 100) * 100);
		System.out.println(value - (value % 100));

		System.out.println("==========");

		/*
		 * 사다리꼴의 넓이를 구하는 코드
		 */

		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		System.out.println("==========");

		int x2 = 10;
		int y2 = 5;
		System.out.println((x2 > 7) && (y2 <= 5)); // true
		System.out.println((x2 % 3 == 2) || (y2 % 2 != 1)); // false

		System.out.println("==========");

	}
}
