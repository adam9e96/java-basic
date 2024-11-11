package chapter21_collection_set.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 메시지를 저장하고 처리하기 위해 Queue 인터페이스를 활용한 예제입니다.
 * Queue는 인터페이스로, LinkedList 클래스를 사용하여 구현합니다.
 * 이 예제에서는 메시지를 큐에 추가하고, 큐에서 메시지를 하나씩 꺼내어 처리합니다.
 * <p>
 * Stack은 클래스이지만 Queue는 인터페이스입니다.
 * </p>
 *
 * @version 2024-01-26
 */
class Message {
    /**
     * 명령어를 나타내는 문자열입니다.
     */
    public String command;

    /**
     * 메시지를 보낼 대상의 이름을 나타내는 문자열입니다.
     */
    public String to;

    /**
     * 주어진 명령어와 대상 이름으로 Message 객체를 생성합니다.
     *
     * @param command 명령어
     * @param to      대상 이름
     */
    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}

/**
 * 이 클래스는 Queue 인터페이스를 이용하여 메시지 큐를 구현하는 예제입니다.
 * <p>
 * Queue는 인터페이스이므로 직접 인스턴스를 생성할 수 없으며,
 * 대신 LinkedList를 사용하여 구현합니다.
 * </p>
 */
public class Queue02 {
    public static void main(String[] args) {
        // Queue 인터페이스의 구현체로 LinkedList를 사용
        Queue<Message> messageQueue = new LinkedList<>();

        // 메시지 저장
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "박성훈"));
        messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

        // 메시지를 큐에서 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {    // 메시지 큐가 비었는지 확인
            Message message = messageQueue.poll();  // 메시지 큐에서 1개의 메시지 꺼냄
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냈습니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냈습니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
                    break;
            }
        }
    }
}
