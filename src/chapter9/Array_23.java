package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_23 {

	public static void main(String[] args) {
		/* 극장에 앉아있는 관객들을 2차원 배열로 나타낼수 있음.
        관객이 있는 좌석은 1로, 관객이 없는 좌석은 0으로 나타냄.
        현재 극장에 앉아있는 관객들의 수를 세는 프로그램을 작성.
     */
    int[][] seats = {
            {0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}
    };
	int count = 0;
	// 코드 작성
	for (int i = 0; i < seats.length; i++) {
		for (int j = 0; j < seats[i].length; j++) {
//				System.out.println(seats[i][j]);
//			if (seats[i][j] != 0) {
//				count++;
//			}
			count += seats[i][j]; 
		// if 문을 쓰기보다 0은 더해도 0이니 그냥 다 더해도 결과는
		} // 동일한데 조건문 하나를 안쓰니 더 좋은 코드이다.
	}
	System.out.println("현재 관객 수는 " + count + "명입니다.");
	}
}
