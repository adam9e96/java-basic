package chapter_4_condition;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_Ex05
 * date           : 2024-01-24
 * description    : 현재 월을 입력 받아 입력받은 월에 해당하는 계절을 출력하는 프로그램
 * ===========================================================
 */
public class Switch_Ex05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 월을 입력하세요. : ");
        int month = scanner.nextInt();

        String season = "";

        if (month > 0 && month < 13) {
            switch (month / 3) {
                case 1: // 3, 4, 5
                    season = "봄";
                    break;
                case 2: // 6, 7, 8
                    season = "여름";
                    break;
                case 3: // 9, 10, 11
                    season = "가을";
                    break;
                default:
                    season = "겨울";
                    break;
            }
            System.out.println("현재 계절은 " + season + "입니다");
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
        scanner.close();
    }
}
