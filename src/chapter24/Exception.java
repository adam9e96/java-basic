package chapter24;

/**
 * ===========================================================
 * fileName       : Exception
 * date           : 2024-02-02
 * description    :
 * 예외처리
 * 프로그램이 에러를 발생하더라도 비정상종료를 막아서 일단 끝까지 실행하게 하도록 하는것임.
 * <p>
 * ===========================================================
 */
public class Exception {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 0;

//        System.out.println(" ** 정숫값을 0으로 나누는 연산 **");
//        System.out.println(" 10/0=" + (num / num2));
//        System.out.println("try/catch 구문 밖 문장 수행"); // 위에서 예외가 발생해서 실행을 못하고 끝남
////        예외처리는 예외를 해결해주는게 아니라 비정상종료로 인해 실행못한 뒷 문장까지 실행 해주는 거임
//
        try {
            System.out.println(" ** 정숫값을 0으로 나누는 연산 **");
            System.out.println(" 10/0=" + (num / num2));
            System.out.println(" ** 정숫값을 0으로 나누는 연산완료 **"); // 위에서 예외가 발생해서 실행을 못하고 끝남
//        예외처리는 예외를 해결해주는게 아니라 비정상종료로 인해 실행못한 뒷 문장까지 실행 해주는 거임

        } catch (java.lang.Exception e) {
            System.out.println(e);
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램을 정상 수행합니다.");
    }
        // 컴파일 하고 콘솔에서 출력되는 코드 번호로도 정상 종료 되었는지 여부를 확인 할 수 있음
        //Process finished with exit code 0 : 정상 종료
        //Process finished with exit code 1 : 비정상 종료
//    try/catch는 예외 해결이 아님. 에러가 발생하더라도 정상적으로 실행되도록 하는거
}
/*
    try {
        // 예외가 발생할 수 있는 코드
    } catch (예외클래스 변수) {
        // 예외르 ㄹ처리하는 코드
    } finally {
        // 여기 있는 코드는 try 블록이 끝나면 무조건 실행
    }
    // 예외는 우선 개발자가 인식하는거에서 부터 시작함 -> 여기 코드에서 예외가 발생할거같다 -> try catch로 감쌈

    // 예외가 발생하는 경우
    // 예외가 발생하지 않는 경우
 */