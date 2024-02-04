package chapter6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();

//		}
//		Random random = new Random();
//
//		int num1;
//		int num2;
//		//		while (true) {
////			int num1 = random.nextInt(6) + 1;
////			int num2 = random.nextInt(6) + 1;
//////			int num3 = random.nextInt(num2)
////			System.out.println("(" + num1 + ", " + num2 + ")");
////			
////			if (num1 + num2 ==5) {
////				break;
////			}
////		}
//		do {
//			 num1 = random.nextInt(6) +1;
//			 num2 = random.nextInt(6) + 1;
//			 
//			 System.out.println("(" + num1 + ", " + num2 + ")");
//		} while ( (num1+num2) != 5);

//		Random random = new Random();
//		Scanner scanner = new Scanner(System.in);
//		int answer = random.nextInt(6) +1;
//		boolean run = true;
//		while(true) {
//			System.out.print("주사위 값은 얼마일까요? >>>");
//			int value = scanner.nextInt();
//			if (answer == value) {
//				break;
//			}
//			System.out.println("오답입니다. 다시 시도하세요.");
//		}
//		System.out.println(answer+"! 정답입니다.");
//		scanner.close();
//		while (run) {
//			System.out.print("주사위 값은 얼마일까요? >>>");
//			int value = scanner.nextInt();
//			if (answer == value) {
//				run = false;
//			}
//			System.out.println("오답입니다. 다시 시도하세요.");
//		}
//		System.out.println(answer + "! 정답입니다.");
//		scanner.close();

//		while(answer != 0) {
//			System.out.print("주사위 값은 얼마일까요? >>> ");
//			int user = scanner.nextInt();
//			
//			if (!(answer == user)) {
//				System.out.println("오답입니다. 다시 시도하세요");
//			} else if (answer == user) {
//				System.out.println(answer+"! 정답입니다.");
//				answer = 0;
//			}
//		}
//		scanner.close();
//		int user;
//		boolean run1 = true;
//		do {
//			System.out.print("주사위 값은 얼마일까요? >>> ");
//			user = scanner.nextInt();
//			if(answer == user ) {
//				run1 = false;
//			} 
//			System.out.println("오답입니다. 다시 시도하세요.");
//		} while (run1);
//		System.out.println(answer + "! 정답입니다.");
		// 반복문을 빠져 나가는 방법
//		1) 조건식이 false -> boolean 변수를 이용.  
//		2) break 문 실행 
//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		int num;
//		
//		while (true) {
//			System.out.println("더할 숫자를 입력하세요:(종료하려면 0입력)");
//			num = scanner.nextInt();
//			if (num == 0) {
//				break;
//			}
//			sum += num;	
//		}
//		System.out.println("현재까지의 총합 :"+sum);
//		scanner.close();

//		Random random = new Random();
//		while(true) {
//		int num1 = random.nextInt(6)+1;
//		int num2 = random.nextInt(6)+1;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		}
//		Scanner scanner = new Scanner(System.in);
//		int month;
//		
//		while (true) {
//			System.out.print("올바른 월을 입력하세요. [1-12]");
//			month = scanner.nextInt();
//			if ((month>=1 && month <= 12)) {
//				break;
//			}
//		}
//		System.out.println("사용자가 입력한 월은 " + month + "입니다.");
//		scanner.close();
//		Scanner scanner = new Scanner(System.in);
//		int month = 13;

//		do {
//			System.out.print("올바른 월을 입력하세요 >>> ");
//			month = scanner.nextInt();
//			if(month >=1 && month <13) {
//				break;
//			}
//		} while (true);
//		System.out.println("사용자가 입력한 월은 "+ month + "입니다.");

//		do {
//			System.out.print("올바른 월을 입력하세요 >>> ");
//			month = scanner.nextInt();
//		} while ( !(month>=1 && month <13));
//		System.out.println("사용자가 입력한 월은 "+ month + "입니다.");
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if (i + j == 6) {
//					System.out.println(i + " + " + j + " = " + (i + j));
//				}
//			}
//		}

//		// for 문을 이용햇 ㅓ다음과 같이 * 을 출력하는 코드 
//		int total = 0;
//		int[] scores = {95, 76, 67, 56, 87 };
//		for ( int i =0; i< scores.length; i++) {
//			total += scores[i];
//		}
//		double avg = (double)total / scores.length;
//		
//		System.out.println("총점은 "+ total + "점이고, 평균은 "+ avg + "입니다.");

//		int[] number = new int[] {1,2,3,4,5,6,6,7,8,9,10};
//		int[] number = {1,2,3,4,5,6,7,8,9,10};
//		
//		for (int i=0; i< number.length; i++) {
//			System.out.println(number[i]);
//		}
//		int max = 0;
//		int[] array = {1, 5, 3, 8, 2};
//		
//		for ( int i = 0; i< array.length;i++) {
//			if (max < array[i] ) {
//				max = array[i];
//				System.out.println(max); // 테스트 코드
//			}
//			
//		}
//		System.out.println(max);

//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//		
//		int max = score[0];
//		int min = score[0];
//		
//		for (int i=1; i< score.length; i++) {
//			if (max < score[i]) {
//				max = score[i];
//			}
//			if (min > score[i]) {
//				min = score[i];
//			}
//		}
//		System.out.println("max :"+max + "min : "+min);
//		
//		
//		int total = 0;
//		int num;
//		
//		for (num = 1 ; num <=100; num++) {
//			if (num %2 == 0) {
//				continue;
//			}
//			total += num;
//		}
//		System.out.println("1부터 100까지의 홀 수 의 합은 : "+total);
//
//		boolean run = true;
//		int studentNum = 0;
//		int[] scores = null;
//		Scanner scanner = new Scanner(System.in);
//
//		while (run) {
//			System.out.println("=============================================================");
//			System.out.println("1 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
//			System.out.println("=============================================================");
//			System.out.print("선택>>> ");
//			int selectNo = scanner.nextInt();
//
//			if (selectNo == 1) {
//				System.out.println("학생수> ");
//				studentNum = scanner.nextInt();
//				scores = new int[studentNum];
//				System.out.println(Arrays.toString(scores));
//			} else if (selectNo == 2) {
//				for (int i = 0; i < scores.length; i++) {
//					System.out.print("scores[" + i + "] : ");
//					scores[i] = scanner.nextInt();
//				}
//			} else if (selectNo == 3) {
//				for (int i = 0; i < scores.length; i++) {
//					System.out.println("scores[" + i + "]" + scores[i]);
//				}
//			} else if (selectNo == 4) {
//				int max = 0;
//				int sum = 0;
//				double avg = 0;
//				for (int i = 0; i < scores.length; i++) {
//					if (max < scores[i]) {
//						max = scores[i];
//					}
//					sum += scores[i];
//				}
//				avg = (double) sum / scores.length;
//				System.out.println("max : " + max);
//				System.out.println("avg : " + avg);
//			} else if (selectNo == 5) {
//				run = false;
//			}
//			
//		}
//		System.out.println("종료합니다.");
//		scanner.close();

//		Scanner scanner = new Scanner(System.in);
//		boolean run = true;
//		int money = 10000;
//		System.out.println("현재 가진 돈은" + money + " 원입니다.");
//		
//		while(run) {
//			System.out.print("얼마를 사용하시겠습니까?");
//			int spendMoney = scanner.nextInt();
//			if (spendMoney <= 0 || spendMoney > money) {
//				System.out.println("다시 입력해라");
//				continue;
//			} else if (spendMoney >1000 ) {
//				System.out.println("1000원 미만 씩만 꺼내 쓸 수 있다");
//				continue;
//			}
//			money -= spendMoney;
//			System.out.println("이제 " + money + "원이 남았습니다.");
//			
//			if (money == 0 ) {
//				run = false;
//			}
//		}
//		System.out.println("모든 돈을 사용합낟. 종료");
//		scanner.close();
//		int[] student;
//		student = new int[3];
//		
//		int[] student;
//		student = new int[3];
//		
//		System.out.println("현재 자동으로 초기화 된 값: "+ student[0]);
//		System.out.println("현재 자동으로 초기화 된 값: "+ student[1]);
//		System.out.println("현재 자동으로 초기화 된 값: "+ student[2]);
//		
//		student[0] = 10;
//		student[1] = 20;
//		student[2] = 30;
//		
//		System.out.println("첫 번째 요소 값 :"+student[0]);
//		System.out.println("두 번째 요소 값 :"+student[1]);
//		System.out.println("세 번째 요소 값 :"+student[2]);
//		int[] arr;
//		int num = 0;
//		arr = new int[5];
//		
//		for (int i = 0; i< arr.length; i++, num +=20) {
//			arr[i] += num;
//		}
//		System.out.println(Arrays.toString(arr));
//	String grade = "B";
//	int score1= 0;
//	switch (grade) {
//	case "A":
//		score1 = 100;
//		break;
//	case "B":
//		int result = 100-20;
//		score1 = result;
//		break;
//	default:
//			score1 = 60;
//	}

//		int sum = 0;
//		for (int i= 1; i<=100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		// 4x +5y = 60이 되는 모든해. x와 y는 10이하의 자연수. (x,y)형태로 추렭해야 함 (5,8) (10,4) 두개임
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j <= 10; j++) {
//				if( ((4*i) +(5*j) == 60) ) {
//					System.out.println( "(" + i + " ," + j + ")" );
//				}
//			}
//		}

		// for 문을 이용
		/*
		 *  *
			**
			***
			****
			*****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}