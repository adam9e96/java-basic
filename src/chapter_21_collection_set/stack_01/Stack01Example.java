package chapter_21_collection_set.stack_01;
/*
 * ===========================================================
 * fileName       : Stack01Example
 * date           : 2024-01-26
 * description    : Stack 자료 구조 연습-1
 ArrayList로 Stack 자료 구조 구현 연습
 * ===========================================================
 */

public class Stack01Example {
    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();

        stack01.push("A"); // 스택의 맨 뒤 요소를 추가
        stack01.push("B");
        stack01.push("C");

        System.out.println(stack01.peek()); // C    // 스택의 맨 위 객체를 가져옴.(반환형 String) 제거하지 않음

        System.out.println(stack01.pop());  // C // 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거
        System.out.println(stack01.pop());  // B
        System.out.println(stack01.pop());  // A
        System.out.println(stack01.pop());  // 스택이 비었습니다.
                                            // null

    }
}
