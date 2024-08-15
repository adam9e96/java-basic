package chapter_21_collection_map.queue02;/*
 * ===========================================================
 * fileName       : Queue02
 * date           : 2024-01-26
 * description    : 자바에서 제공하는 Queue 인터페이스 활용
Stack은 클래스이지만 Queue는 인터페이스임
 * ===========================================================
 */

import java.util.LinkedList;
import java.util.Queue;

class Message { // Queue 를 이용한 메시지 큐
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
// Queue 를 이용한 메시지 큐

public class Queue02 {  // Queue는 인터페이스라서 new Queue가 안된다. new LinkedList 객체를 생성해야됨
    public static void main(String[] args) {
        // Stack은 class 이지만 Queue 는 interface
        Queue<Message> messageQueue = new LinkedList<>();

        // 메시지 저장
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "박성훈"));
        messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
        
        // size로 변경 가능
//        while (!messageQueue.isEmpty()) {    // 메시지 큐가 비었는지 확인
//            Message message = messageQueue.poll();  // 메시지 큐에서 1개의 메시지 꺼냄
//            switch (message.command) {
//                case "sendMail":
//                    System.out.println(message.to + "님에게 메일을 보냈습니다.");
//                    break;
//                case "sendSMS":
//                    System.out.println(message.to + "님에게 SMS를 보냈습니다.");
//                    break;
//                case "sendKakaotalk":
//                    System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
//                    break;
//            }
//
//        }
        // todo 복습안했다#
        while (messageQueue.size() != 0) {    // 메시지 큐가 비었는지 확인
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
