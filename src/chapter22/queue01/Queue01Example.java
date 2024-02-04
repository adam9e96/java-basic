package chapter22.queue01;
/*
 * ===========================================================
 * fileName       : Queue01Example
 * date           : 2024-01-26
 * description    :
 * ===========================================================
 */

public class Queue01Example {
    public static void main(String[] args) {
        Queue01 queue01 = new Queue01();
        queue01.enQueue("A");
        queue01.enQueue("B");
        queue01.enQueue("C");

        System.out.println(queue01.deQueue());  // A
        System.out.println(queue01.deQueue());  // B
        System.out.println(queue01.deQueue());  // C
    }
}
