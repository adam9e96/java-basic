package chapter_7_method.b_practice;

/**
 * 이 클래스는 두 숫자의 합을 계산하는 메서드를 포함합니다.
 *
 * @since 2024.08.11
 */
public class MethodDemo02 {

    /**
     * 두 정수의 합을 계산하여 반환합니다.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @return 두 정수의 합
     */
    public int add(int a, int b) {
        return a + b; // return 다음에 위치하는 데이터는 반드시 메서드의 리턴 타입과 일치해야 함
        // return 3.5; // 리턴 타입과 다른 데이터 형을 반환하면 오류가 발생.
        // return 값으로 자동형변환이 되는 경우는 문제는 없음.
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        // MethodDemo02 객체 생성
        MethodDemo02 method = new MethodDemo02();
        result = method.add(num1, num2);

        // 메서드의 반환 값을 저장해서 출력
        System.out.println("두 수의 합은 " + result);

        // 메서드의 반환 값을 바로 출력
        System.out.println("두 수의 합은 " + method.add(num1, num2));
    }
}
