package chapter_5_loop.b_practice;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : DoWhile_Ex02
 * date           : 2024-01-24
 * description    :
 * * do while 문을 사용해서 사용자로 부터 월의 번호를 입력받는 프로그램을 작성해 보세요.
 * * 사용자가 올바른 월 번호를 입력할 때 까지 반복을 계속합니다.
 * * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다.
 * <p>
 * <p>
 * * while 문은 처음부터 조건식을 확인해야 하는데 `do~while`문은 일단 한번은 실행한다.
 * * 반복문을 빠져나오는 방법
 * * 1. break
 * * 2. 조건식이 false
 */

public class DoWhile_Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int month = 13;
		int month = 1;

        do {
            System.out.print("올바른 월을 입력하세요. [1-12]");
            month = scanner.nextInt();
        } while (month < 1 || month > 12);
        System.out.println("사용자가 입력한 월은 " + month + "입니다.");
        scanner.close();

//        while (true) {
//            System.out.print("올바른 월을 입력하세요. [1-12]");
//            month = scanner.nextInt();
//            if (!(month < 1 || month > 12)) {
//                System.out.println("사용자가 입력한 월은 " + month + "입니다.");
//                break;
//            }
//        }
//        scanner.close();
    }

}
