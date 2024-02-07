package chapter5;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_02
 * date           : 2024-02-04
 * description    : 스위치문 연습_02
 * - switch 문
 * 입력 변수의 값과 일치하는 case 입력값(입력값1, 입력값2...) 이 있다면 해당 case 문에 속한 문장들이 실행된다.
 * <p>
 * - break
 * switch 문에서도 break문이 쓰이는데 각 case 의 영역을 구분하는 역할을 한다.
 * case 문을 실행한 뒤 switch문을 빠져나가기 위한것이다.
 * break; 를  빼먹고 실행할 경우 조건에 맞는 case 문을 시작으로 뒤따라오는 모든 case 구문이 모두 실행된다.
 * ===========================================================
 */
public class Switch_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("월을 입력해 주세요 >>> ");
        int month = scanner.nextInt();
        int day;
        boolean isFlag = true;

        switch (month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            case 1, 3, 5, 7, 8, 10, 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:    // case 문의 값이 switch 문의 식과 일치하는 것이 없을 경우 실행 // 생략이 가능하다.
                isFlag = false;
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");
        }

        if (isFlag) { // month >= 1 && month <= 12
            System.out.println(month + "월은 " + day + "일까지 있습니다.");
        }
        scanner.close();
    }
}
