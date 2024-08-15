package chapter_5_loop.a_basics;

/**
 * ===========================================================
 * fileName       : Switch_01
 * date           : 2024-02-04
 * description    : 스위치문 연습_01
 * if 문과 비슷하지만 좀 더 일정한 형식이 있는 조건 ㆍ 판단문이다.
 * <p>
 * 하나의 변수 안에 저장되어 있는 값을 다수의 값과 비교해야 할 때 주로 사용한다.
 * <p>
 * 입력 변수로 올 수 있는 자료형
 * : byte, short, char, int, enum, String 만 가능하다
 * ===========================================================
 */
public class Switch_01 {

    public static void main(String[] args) {

        String medal = "Gold"; // String 타입 변수 선언 및 초기화
        String medal2 = "Silver";
//		switch (medal2) {
//		case "Gold":
//			System.out.println("금메달 입니다.");
//			break;
//		case "Silver":
//			System.out.println("은메달 입니다.");
//			break;
//		case "Bronze":
//			System.out.println("동메달 입니다.");
//			break;
//		default:
//			System.out.println("메달이 없습니다.");
//			break;
//		}
        switch (medal) {    // 입력 변수
            case "Gold":    // 변수와 "GOLD"가 같을때	// 조건 1
                System.out.println("금메달 입니다.");    // 위 조건이 만족하면 실행하는 코드
                break;    // switch 문 빠져나가기
            case "Silver":    // 조건 2
                System.out.println("은메달 입니다.");
                break;
            case "Bronze":    // 조건 3
                System.out.println("동메달 입니다.");
                break;
            default:    // 조건 1, 2, 3 모두 만족하지 않을 때
                System.out.println("메달이 없습니다.");
                break;
        }

        System.out.println("==============================");

        if (medal2.equals("Gold")) {
            System.out.println("금메달입니다.");
        } else if (medal2.equals("Silver")) {
            System.out.println("은메달 입니다.");
        } else if (medal2.equals("Bronze")) {
            System.out.println("동메달 입니다.");
        } else {
            System.out.println("메달이 없습니다.");
        }
        /*
         * switch 문은 if else if 문으로 변경이 가능하다. 문자열은 equals() 메소드를 이용한다.
         */
    }
}
