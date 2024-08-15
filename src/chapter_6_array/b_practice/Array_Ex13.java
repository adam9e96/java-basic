package chapter_6_array.b_practice;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_Ex13 {

	public static void main(String[] args) {
		/*
		 * 중첩 for 문을 이용해서 주어진 배열의 전체 항목의 합과 평균 값을 구하세요. 
		 * 각 행의 열의 갯수가 다른 경우
		 */
		int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

		int sum = 0;
		double avg = 0.0;
		int total = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++, total++) {
				sum += array[i][j];
			}
		}
		avg = (double) sum / total;
		System.out.println("합계 :" + sum); // 881
		System.out.println("평균 :" + avg); // 88.1
	}

}
