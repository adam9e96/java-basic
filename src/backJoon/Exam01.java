package backJoon;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		/*
		 * 정수 1개를 입력 받아서, 그 수가 50 이상의 수인지 
		 * 50미만의 수인지 판단해보자.
		 */
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		long start = System.nanoTime();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>>");
		
		int num = sc.nextInt();
		
		String msg = "50 미만 입니다";
		if (num >= 50) {
			msg = "50 이상 입니다.";
		}
		System.out.println("입력한 정수는 "+msg);
		sc.close();
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		System.out.println("시간차이(s) : "+(afterTime - beforeTime)/1000+" s");
		System.out.println("코드실행시간(ms) : "+ (afterTime - beforeTime)+" ms");
		long end = System.nanoTime();		
		System.out.println("코드실행시간(ns) : " + (end - start) + " ns");	
		}

}
