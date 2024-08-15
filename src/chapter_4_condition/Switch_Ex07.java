package chapter_4_condition;

import java.util.Scanner;

/**
 * ===========================================================
 * fileName       : Switch_Ex07
 * date           : 2024-01-24
 * description    :
 * * 주민등록번호를 입력받아 남자인지 여자인지 구분하는 프로그램 입력
 * * 예) 당신의 주민번호를 입력하세요 : 123456-3351312 출력 예)
 * * 당신은 여자입니다.
 * ===========================================================
 */
public class Switch_Ex07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민번호를 입력하세요 : ");
        String  identificationNumber = scanner.nextLine();
        char sexual = identificationNumber.charAt(7); // 성별을 나타내는 인덱스 990224-[여기]416711

        switch (sexual) {
            case '1', '3':
                System.out.println("남자");
                break;
            case '2', '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("잘못입력하였습니다.");
        }
        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("당신의 주민번호를 입력하세요. : ");
//        char identificationNumber = scanner.next().charAt(7);
//        String result = "당신은 %s입니다.";
//        String gender = "";
//
//        switch (identificationNumber) {
//            case '1', '3':
//                gender = "남자";
//                break;
//            case '2', '4':
//                gender = "여자";
//                break;
//            default:
//                result = "입력값이 잘못되었습니다.";
//        }
//        System.out.printf(result, gender);
    }

}
