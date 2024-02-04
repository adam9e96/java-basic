package chapter9;

//created : 2024-01-9
//updated : 2024-01-10
public class Array_22 {

	public static void main(String[] args) {
		// 2차원 배열 초기화 및 출력
		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 } 
				}; // 2차원 배열 선언
				//
				System.out.println("행: " + arr.length);
				System.out.println("열: " + arr[0].length);

				for (int i = 0; i < arr.length; i++) { // 행
					for (int j = 0; j < arr[i].length; j++) { // 열
						System.out.println(arr[i][j] + " ");
					}
					System.out.println();
				}

			}

		}
