package chapter21_collection_set.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 은행 대기열에서 고객을 관리하는 예제.
 * 고객들은 도착 순서대로 큐에 추가되고, 서비스가 완료되면 큐에서 제거됩니다.
 */
class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Queue03_BankQueue {
    public static void main(String[] args) {
        Queue<Customer> bankQueue = new LinkedList<>();

        // 고객들이 도착하여 큐에 추가됨
        bankQueue.offer(new Customer("홍길동"));
        bankQueue.offer(new Customer("이순신"));
        bankQueue.offer(new Customer("강감찬"));
        bankQueue.offer(new Customer("유관순"));

        // 은행 창구에서 고객 서비스 처리
        while (!bankQueue.isEmpty()) {
            Customer currentCustomer = bankQueue.poll();
            System.out.println(currentCustomer.getName() + "님이 창구에서 서비스를 받습니다.");
            // 서비스 처리 시간이 걸리는 작업을 시뮬레이션할 수 있습니다 (예: Thread.sleep).
        }


        System.out.println("모든 고객이 서비스를 받았습니다.");
    }
}
