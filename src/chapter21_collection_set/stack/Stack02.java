package chapter21_collection_set.stack02;

import java.util.Stack;

/**
 * {@code Coin} 클래스는 동전을 나타내는 간단한 클래스입니다.
 * 동전의 값을 나타내는 정수형 {@code value} 필드를 포함하고 있습니다.
 *
 * <p>이 클래스는 Stack 자료구조를 이용한 동전 케이스 예제에서 사용됩니다.</p>
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-01-26
 */
record Coin(int value) {
}

/**
 * {@code Stack02} 클래스는 {@link Stack}을 이용한 동전 케이스 예제를 구현합니다.
 *
 * <p>동전을 스택에 추가하고, 스택에서 동전을 하나씩 꺼내어 출력하는 기능을 포함합니다.
 * 자바에서 제공하는 {@link Stack} 클래스를 활용하여 동전 케이스의 동작을 모사합니다.</p>
 *
 * <p>이 예제에서는 LIFO(Last In, First Out) 원칙에 따라 동전이 처리됩니다.</p>
 *
 * @author Your Name
 * @version 1.0
 * @since 2024-01-26
 */
public class Stack02 {

    /**
     * 프로그램의 진입점으로, 동전 케이스 스택을 생성하고 동전을 추가 및 제거하는 작업을 수행합니다.
     *
     * @param args 명령줄 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();    // 스택을 생성

        // 동전을 스택에 추가
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 스택이 비어있지 않은 동안 동전을 하나씩 꺼내어 출력
        while (!coinBox.isEmpty()) {
            // 동전을 스택에서 꺼내어 출력
            System.out.println("꺼내온 동전 : " + coinBox.pop().value() + "원");
        }

        /*
        출력 결과:
        꺼내온 동전 : 10원
        꺼내온 동전 : 500원
        꺼내온 동전 : 50원
        꺼내온 동전 : 100원
         */
    }
}
