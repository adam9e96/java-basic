package chapter21.linkedList02;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ===========================================================
 * fileName       : LinkedList02
 * date           : 2024-01-25
 * description    : LinkedList 연습_02
 * ===========================================================
 * ArrayList와 LinkedList의 실행 성능 비교
 * 끝에서 부터 (순차적으로) 추가 또는 삭제 하는 경우 ArrayList가 빠르지만,
 * 중간에 추가, 삭제하는 경우에는 앞 뒤 링크 정보만 변경하느 LinkedList가 더 빠름.
 * ArrayList는 뒤 쪽 인덱스들을 모두 1씩 증가 또는 감소 시키는 시간이 필요하므로 처리 속도가 느리다.
 */
public class LinkedList02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        // 1. 중간에 추가하는 경우
        System.out.println("1. 중간에 추가하는 경우");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns"); // ArrayList 걸린시간 : 497953200 ns

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedSList 걸린시간: " + (endTime - startTime) + " ns"); // LinkedList 걸린 시간 : 4916000 ns
        // todo 면접에서도 둘의 차이점을 물을 수 있다.

        // 2. 끝에 순차적으로 추가하는 경우
        System.out.println("2. 끝에 순차적으로 추가하는 경우");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns"); // ArrayList 걸린시간: 4363800 ns

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns"); // LinkedList 걸린시간: 25947300 ns
    }
    // todo 자바의 심화과정은 2개가있다.  이펙티브자바(스킬적인 파트), 자료구조(시간관련) 시간나면 해보셈.
}
