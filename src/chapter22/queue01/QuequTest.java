package chapter22.queue01;/*
 * ===========================================================
 * fileName       : QuequTest
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.LinkedList;

class Queue{
    LinkedList<String> linkedList = new LinkedList<>();

    public void enQueue(String data){
        linkedList.add(data);
    }
    public String deQueue(){
        int len = linkedList.size();
        if (len ==0){
            System.out.println("큐가 비었다.");
            return null;
        }
      return linkedList.remove(0);
    }
}
public class QuequTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue("갤럭시");
        queue.enQueue("아이폰");
        queue.enQueue("화웨이");
//        System.out.println(queue);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
