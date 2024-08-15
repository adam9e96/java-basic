package chapter_4_condition;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_Ex08
 * date           : 2024-01-24
 * description    :
 * 1번은 강아지, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램
 * ===========================================================
 */
public class Switch_Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("번호를 입력하세요 >>>");
        int inputNumber = scanner.nextInt();
        String result = "";

        switch (inputNumber) {
            case 1:
                result = "bog";
                break;
            case 2:
                result = "cat";
                break;
            case 3:
                result = "chick";
                break;
            default:
                result = "번호가 잘못되었습니다.";
        }
        System.out.println(result);
        scanner.close();
    }
}
