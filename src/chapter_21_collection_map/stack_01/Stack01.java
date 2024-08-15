package chapter_21_collection_map.stack_01;
/*
 * ===========================================================
 * fileName       : Stack01
 * date           : 2024-01-26
 * description    : Stack 자료 구조 연습-1
    ArrayList를 이용해서 stack 자료 구조 구현
    stack 를 구현할 때 ArrayList, LinkedList 중 어느 것을 선택하는 것이 좋을까?
    >>> ArrayList
    >>> LIFO 성능면에서 ArrayList가 유리함
    >>> add(인덱스번호, e) 을 사용할 경우 LinkedList가 유리함
    >>> add(e) 의 경우 ArrayList가 유리함
    *
    *  Stack Stack 클래스는 LIFO 자료구조를 구현한 클래스
 * ===========================================================
 */

import java.util.ArrayList;

public class Stack01 {
    // push(E Item) : 주어진 객체를 스택에 넣음.
    // peek() : 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거하지 않음
    // pop() : 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거.
    // peek 구현
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {  // 스택의 맨 뒤 요소를 추가
        arrayStack.add(data);
    }


    public String pop() {   // 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거
        int len = arrayStack.size();    // 저장된 개수
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.remove(len - 1)); // 맨 뒤에 있는 자료를 반환하고 배열에서 제거
    }   // pop처럼 remove() 메소드는 삭제도 하고 리턴도 됨

    public String peek() {  // 스택의 맨 위 객체를 가져옴.(반환형 String) 제거하지 않음
        int len = arrayStack.size();    // 저장된 개수
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return (arrayStack.get(len - 1));    // 맨 뒤에 있는 자료 반환.
    }
}