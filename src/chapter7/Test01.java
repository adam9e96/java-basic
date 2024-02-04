package chapter7;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Random random = new Random();
		String[] menu1 = {"버거킹","편의점","집밥","한솥","피자헛"};

		boolean run = true;
		
		while(run) {
			
		System.out.println("==========");
		System.out.println("뭐 먹 을 까");
		System.out.println("==========");
		
		int user = random.nextInt(menu1.length);
		System.out.println("랜덤추천>>> "+menu1[user]);
		run = false;
		
		}
	}
}
