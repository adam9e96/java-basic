package chapter_7_method.a_basic;

//created : 2024-01-9
//updated : 2024-01-10
public class Method_07 {

	public static void main(String[] args) {
		/*
		 * 깊은 복사. 값복사. 기본형 변수
		 * deep copy
		 * 데이터 자체가 복사된다.
		 * 복사된 두 객체는 완전히 독립적인 메모리를 차지.
		 */
		int a = 1;
		int b = a; // a를 가르키는게 아니라 a의 값 1을 복사
		b++;

		System.out.println("a: " + a + ", b: " + b); // a: 1, b : 2

		/*
		 * 얉은 복사. 참조 복사. 참조형 변수
		 * shallow copy
		 * 
		 * : 값 자체를 복사하는 것이 아니라 주소 값을 복사하여 같은 메모리를
		 * 가리키기 때문
		 */
		int[] nums_01 = new int[1];
		nums_01[0] = 1;

		int[] nums_02 = nums_01; // nums_01 의 참조 주소값을 복사함
		nums_02[0] = 2;

		System.out.println("nums_01[0]: " + nums_01[0] + ", nums02[0]:" + nums_02[0]);
		// nums_01[0]: 2, nums_02[0]:2
		
		System.out.println(nums_01);
		System.out.println(nums_02);
		int[] intArr = new int[3];
		
		System.out.println(intArr);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
	}
}
