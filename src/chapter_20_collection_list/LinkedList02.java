package chapter_20_collection_list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @since 2024.08.11
 * ArrayList와 LinkedList의 실행 성능 비교
 * 끝에서부터 (순차적으로) 추가 또는 삭제하는 경우 ArrayList가 빠르지만,
 * 중간에 추가, 삭제하는 경우에는 앞뒤 링크 정보만 변경하는 LinkedList가 더 빠름.
 * ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하므로 처리 속도가 느림.
 */
public class LinkedList02 {
    /**
     * 성능 비교를 실행하는 메인 메서드입니다.
     *
     * @param args 커맨드라인 인수 (사용되지 않음)
     */
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        // 1. 중간에 요소를 추가하는 경우
        System.out.println("1. 중간에 요소를 추가하는 경우");

        // ArrayList: 요소를 리스트의 시작 부분에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, String.valueOf(i)); // 10만번 추가
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간: " + (endTime - startTime) + " ns");
        /*
         * ArrayList 요소 10만번 추가 하는데 소요된 시간 : 412090700 ns
         */

        // LinkedList: 요소를 리스트의 시작 부분에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간: " + (endTime - startTime) + " ns");
        /*
         * LinkedList 요소 10만번 추가 하는데 소요된 시간 : 4712200 ns
         */
        // 결과 LinkedList 압승 
        
        // 다음 테스트 전에 리스트를 비움
        list1.clear();
        list2.clear();

        // 2. 끝에 순차적으로 요소를 추가하는 경우
        System.out.println("2. 끝에 순차적으로 요소를 추가하는 경우");

        // ArrayList: 요소를 리스트의 끝에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간: " + (endTime - startTime) + " ns");

        // LinkedList: 요소를 리스트의 끝에 추가
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list2.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간: " + (endTime - startTime) + " ns");
        
        /*
         * 결과 ArrayLIst 승
         */
    }
}