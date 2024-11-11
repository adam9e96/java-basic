package chapter21_collection_set.stack;

import java.util.ArrayList;

/**
 * {@code Stack01} 클래스는 {@link ArrayList}를 사용하여 간단한 스택 자료 구조를 구현합니다.
 * 이 스택은 LIFO(Last In, First Out) 원칙을 따릅니다.
 *
 * <p>스택은 다음과 같은 연산을 제공합니다:</p>
 * <ul>
 *     <li>{@code push(String data)}: 주어진 요소를 스택의 맨 위에 추가합니다.</li>
 *     <li>{@code pop()}: 스택의 맨 위 요소를 제거하고 반환합니다.</li>
 *     <li>{@code peek()}: 스택의 맨 위 요소를 제거하지 않고 반환합니다.</li>
 * </ul>
 *
 * <p>이 구현은 스택에서 요소를 추가하고 제거하는 작업이 주로 수행되는 경우에 적합합니다.</p>
 *
 * <p>참고: 스택이 비어 있는 경우, {@code pop()} 및 {@code peek()}는 {@code null}을 반환하며
 * 스택이 비어 있다는 메시지를 출력합니다.</p>
 *
 * @since 2024-01-26
 */
class Stack01 {

    /**
     * {@link ArrayList}로 구현된 스택의 기본 저장소입니다.
     */
    private final ArrayList<String> arrayStack = new ArrayList<>();

    /**
     * 지정된 요소를 스택의 맨 위에 추가합니다.
     *
     * @param data 스택에 추가할 요소
     */
    public void push(String data) {
        arrayStack.add(data);
    }

    /**
     * 스택의 맨 위 요소를 제거하고 반환합니다.
     *
     * @return 스택의 맨 위 요소, 스택이 비어 있을 경우 {@code null}
     */
    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(len - 1);
    }

    /**
     * 스택의 맨 위 요소를 제거하지 않고 반환합니다.
     *
     * @return 스택의 맨 위 요소, 스택이 비어 있을 경우 {@code null}
     */
    public String peek() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.get(len - 1);
    }
}

/**
 * {@code Stack01Example} 클래스는 {@link Stack01} 클래스의 사용 예제를 보여줍니다.
 */
public class Stack01Example {

    /**
     * 프로그램의 진입점으로 사용되는 메인 메서드입니다.
     *
     * @param args 명령줄 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();

        stack01.push("A");
        stack01.push("B");
        stack01.push("C");

        System.out.println(stack01.peek()); // 출력: C

        System.out.println(stack01.pop());  // 출력: C
        System.out.println(stack01.pop());  // 출력: B
        System.out.println(stack01.pop());  // 출력: A
        System.out.println(stack01.pop());  // 출력: 스택이 비었습니다. (null)
    }
}
