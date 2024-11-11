package chapter21_collection_set.queue;

import java.util.LinkedList;

/*
 * ===========================================================
 * fileName       : Queue01Example
 * date           : 2024-01-26
 * description    : LinkedList를 활용하여 큐(Queue) 자료구조를 구현하는 방법
 * 큐는 FIFO 구조로, 먼저 들어온 데이터가 먼저 나가는 방식으로 동작한다.
 * ===========================================================
 */
class Queue {
    private final LinkedList<String> linkedList = new LinkedList<>();

    public void enQueue(String data) {  // 큐의 맨 뒤에 추가
        linkedList.add(data);   // 추가는 동일함
    }

    public String deQueue() {    // 큐의 맨 앞에서 꺼냄.
        int len = linkedList.size();
        if (len == 0) {
            System.out.println("큐가 비었습니다");
            return null;
        }
        return linkedList.remove(0);  // LinkedList의 remove() 메서드를 사용하여 맨 앞의 데이터를 반환하고 제거
//      return (arrayStack.remove(len - 1)); // 맨 뒤에 있는 자료를 반환하고 배열에서 제거
    }

    @Override
    public String toString() {
        return "Queue01{" +
                "linkedList=" + linkedList +
                '}';
    }
}

public class Queue01 {
    public static void main(String[] args) {
        Queue queue01 = new Queue();
        queue01.enQueue("A");
        queue01.enQueue("B");
        queue01.enQueue("C");
        System.out.println(queue01);


        System.out.println(queue01.deQueue());  // A
        System.out.println(queue01.deQueue());  // B
        System.out.println(queue01);
        System.out.println(queue01.deQueue());  // C
        System.out.println(queue01.deQueue());  // C

        System.out.println(queue01);
    }
}
