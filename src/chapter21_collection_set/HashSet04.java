package chapter21_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 이 프로그램은 HashSet을 사용하여 중복 없는 문자열 집합을 관리하고,
 * 저장된 요소를 다양한 방법으로 순회하며 출력하는 방법을 보여줍니다.
 * <p>
 * Set 컬렉션은 인덱스를 사용하여 요소를 검색할 수 없으며, 요소를 하나씩 반복하여 가져와야 합니다.
 * 이를 위한 두 가지 방법이 있습니다:
 * 1. for-each 문 사용
 * 2. Set 컬렉션의 `iterator()` 메소드를 사용하여 반복자를 통해 요소를 하나씩 가져오기
 */
public class HashSet04 {
    public static void main(String[] args) {
        // String 객체를 중복 없이 저장하는 HashSet 생성
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");    // "JAVA"는 중복된 요소이므로 한 번만 저장됨
        set.add("iBATIS");

        // 저장된 객체 수 확인
        int size = set.size();
        System.out.println("총 객체 수: " + size);  // 출력: 총 객체 수: 4

        // case 1: for-each 문을 이용한 요소 순회 및 출력
        System.out.println("for-each 문으로 출력 시작:");
        for (String s : set) {
            System.out.println("\t" + s);
        }
        System.out.println();

        // case 2: Iterator를 이용한 요소 순회 및 출력
        System.out.println("Iterator를 사용한 출력 시작:");
        Iterator<String> iterator = set.iterator(); // 반복자 얻기
        while (iterator.hasNext()) { // 요소가 있을 때까지 반복
            String element = iterator.next();   // 1개의 요소 가져오기
            System.out.println("\t" + element);
        }
        System.out.println();

        // 요소 제거
        set.remove("JDBC"); // "JDBC" 제거
        set.remove("iBATIS"); // "iBATIS" 제거

        // 제거 후 저장된 객체 수 확인
        System.out.println("총 객체 수: " + set.size()); // 출력: 총 객체 수: 2

        // 요소 순회 및 출력 (for-each 문 사용)
        System.out.println("for-each 문으로 출력 시작:");
        for (String s : set) {
            System.out.println("\t" + s);
        }
        System.out.println();

        // 모든 1요소 제거
        set.clear(); // 모든 요소 제거

        // HashSet이 비어있는지 확인
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
    }
}
