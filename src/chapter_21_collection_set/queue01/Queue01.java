package chapter_21_collection_set.queue01;
/*
 * ===========================================================
 * fileName       : Queue01
 * date           : 2024-01-26
 * description    : Queue 자료 구조 연습-1
 * ===========================================================
 */

import java.util.LinkedList;

public class Queue01 {
    private LinkedList<String> linkedList = new LinkedList<>();

    public void enQueue(String data) {  // 큐의 맨 뒤에 추가
        linkedList.add(data);   // 추가는 동일함
    }
    public String deQueue(){    // 큐의 맨 앞에서 꺼냄.
        int len = linkedList.size();
        if (len ==0 ){
            System.out.println("큐가 비었습니다");
            return null;
        }
        return (linkedList.remove(0));  // 맨 앞의 자료 반환하고 배열에서 제거
//      return (arrayStack.remove(len - 1)); // 맨 뒤에 있는 자료를 반환하고 배열에서 제거
    }
}
