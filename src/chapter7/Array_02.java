package chapter7;

public class Array_02 {
	public static void main(String[] args) {
		/*
		 * 학생 5명의 성적을 가지고 총점과 평균을 구함 
		 * 1. 배열을 사용하지 않는 경우
		 */
		int score_001 = 95;
		int score_002 = 76;
		int score_003 = 67;
		int score_004 = 56;
		int score_005 = 87;
//
		int total = score_001 + score_002 + score_003 + score_004 + score_005;///
		double avg = (double) total / 5;//
		System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

		// 변수(학생)이 추가될 때마다 변수를 추가로 선언하고 total 변수에 더해야 하며 avg 변수 계산도 수정해줘야 한다.
		
		// 2. 배열을 사용하는 경우
		/*
		 * 총점은 for 문을 이용해서 구할 수 있고, 배열의 갯수가 늘어난다 해도
		 * 총점을 구하는 for문과 평균을 구하는 코드를 수정할 필요가 없음
		 */
		total = 0;
//		total[] =0;
		int[] scores = { 95, 76, 67, 56, 87 }; // 배열 생성 // 추가 시 여기만 수정하면 됨
		for (int i = 0; i < scores.length; i++) { // scores.length -> 배열의 갯수
			total += scores[i];
		}
		avg = (double) total / scores.length;
		System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

		// 가독성차이?
		total = 0; // 원래라면 new int[5]; 을 해야하는데 개발자가 만들고 일일히 초기화 하는게 귀찮으니
		// 바로 배열생성할 때 초기화를 할거면 new는 알아서 적용 되도록 했다.
		int scores2[] = { 95, 76, 67, 56, 87 }; // 배열 생성
		for (int i = 0; i < scores2.length; i++) { // scores.length -> 배열의 갯수
			total += scores2[i];
		}
		avg = (double) total / scores2.length;
		System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");
		/*
		 * for문의 실무 주 사용 용도가 반복문. 그 중에서도 배열에서 대부분 사용한다.
		 */
		/*
		 * 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것이다.
		 * 배열이 필요한 이유.
		 * 1. 배열을 사용하면 변수의 개수를 줄일 수 있다.
		 * 2. 배열을 사용하면 반복문과 함께 효율적인 연산을 수행할 수 있다.
		 * 3. 배열을 사용하면 다차원의 데이터를 표현 할 수 있다.
		 */
	
		/*
		 * 자바 배열의 특징
		 * 1. 동일한 자료형만 저장
		 * 2. 변수 선언시에 저장할 데이터의 개수를 지정
		 * 배열은 0번 부터 시작함
		 * 인덱스
		 */
	}
}
