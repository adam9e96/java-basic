package chapter_21_collection_set.hashSet01;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet04_isEmptySoAdd {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("임정순");
        hashSet.add("박현정");
        hashSet.add("홍연의");
        hashSet.add("강감찬");

        // 중복된 강감찬 추가 시도
        hashSet.add("강감찬"); // 중복된 값이라 저장되지 않음

        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 HashSet: " + hashSet);
        System.out.print("추가 또는 제거할 이름을 입력하세요");
        String name = scanner.nextLine();


        if (hashSet.contains(name)) {
            hashSet.remove(name);
            System.out.println(name + "이(가) 제거되었습니다.");
        } else {
            hashSet.add(name);
            System.out.println(name + "이(가) 추가되었습니다.");
        }

        System.out.println("변경된 HashSet: " + hashSet);
        System.out.println("HashSet 크기: " + hashSet.size());
    }
}