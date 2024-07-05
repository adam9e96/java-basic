package chapter12.computer;

/**
 * Computer 클래스는 가변 길이 매개변수를 사용하여 여러 정수의 합을 계산하는 메서드를 연습
 */
public class Computer {

    /**
     * 여러 개의 정수를 입력 받아(가변길이 매개변수) 그 합을 계산하는 메서드
     *
     * @param values 합산할 정수들
     * @return 입력된 정수들의 합
     */
    int sum(int... values) {
        // 합을 저장할 변수 sum 선언
        int sum = 0;

        //values 는 배열 타입의 변수처럼 사용
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 합산 결과를 리턴
        return sum;
    }
}
