package chapter21_collection_set;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 이 프로그램은 HashSet을 사용하여 문자열 집합을 관리하고, 사용자가 입력한 이름을 추가하거나 제거하는 기능을 구현합니다.
 * 이미 HashSet에 존재하는 이름을 입력하면 제거하고, 존재하지 않는 이름을 입력하면 HashSet에 추가합니다.
 */
public class HashSet05 {
    public static void main(String[] args) {
        // HashSet 생성 및 초기화
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("임정순");
        hashSet.add("박현정");
        hashSet.add("홍연의");
        hashSet.add("강감찬");

        // 중복된 "강감찬" 추가 시도 (저장되지 않음)
        hashSet.add("강감찬"); // 중복된 값이므로 추가되지 않음

        // 현재 HashSet의 내용 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 HashSet: " + hashSet);

        // 사용자로부터 추가 또는 제거할 이름 입력받기
        System.out.print("추가 또는 제거할 이름을 입력하세요: ");
        String name = scanner.nextLine();

        // 이름이 이미 HashSet에 존재하는지 확인
        if (hashSet.contains(name)) {
            hashSet.remove(name); // 존재하면 제거
            System.out.println(name + "이(가) 제거되었습니다.");
        } else {
            hashSet.add(name); // 존재하지 않으면 추가
            System.out.println(name + "이(가) 추가되었습니다.");
        }

        // 변경된 HashSet 출력 및 크기 출력
        System.out.println("변경된 HashSet: " + hashSet);
        System.out.println("HashSet 크기: " + hashSet.size());
    }
}
