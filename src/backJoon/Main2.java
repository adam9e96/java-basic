package backJoon;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt(); 
		int M = scanner.nextInt();
		// https://www.acmicpc.net/problem/2884
			
		if (M < 45) {
			System.out.println(--H);
			// 30 -45 = -15
			M -= 45;
			System.out.println(60+M);
		} else { // M > 45
			
		}
		
		scanner.close();
	}

}
