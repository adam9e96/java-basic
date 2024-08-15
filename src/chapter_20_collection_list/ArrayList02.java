package chapter_20_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================================
 * fileName       : ArrayList02
 * date           : 2024-01-25
 * description    : ArrayList 연습 예제
 * ===========================================================
 */
public class ArrayList02 {
    // String 객체를 저장하는 ArrayList 예제
    public static void main(String[] args) {
        // String 객체를 저장하는 ArrayList 생성
        List<String> list = new ArrayList<>();

        // ArrayList에 문자열 추가
        list.add("Java");   // 인덱스 0
        list.add("JDBC");   // 인덱스 1
        list.add("Servlet/JSP");  // 인덱스 2 -> 3으로 이동
        list.add(2, "Database");  // 인덱스 2에 "Database" 추가
        list.add("iBATIS"); // 인덱스 4

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체수: " + size);   // 출력: 총 객체수: 5
        System.out.println();

        // 2번 인덱스에 저장된 객체 얻기
        String skill = list.get(2);
        System.out.println("2: " + skill);   // 출력: 2: Database
        System.out.println();

        // 저장된 모든 객체 출력 (일반 for문 사용)
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        // 출력:
        // 0:Java
        // 1:JDBC
        // 2:Database
        // 3:Servlet/JSP
        // 4:iBATIS

        // 저장된 모든 객체 출력 (foreach문 사용)
        System.out.println();
        for (String str : list) {
            System.out.println(str);
        }
        // 출력:
        // Java
        // JDBC
        // Database
        // Servlet/JSP
        // iBATIS

        // ArrayList에서 요소 제거
        list.remove(2); // 인덱스 2의 "Database" 삭제
        list.remove(2); // 인덱스 2의 "Servlet/JSP" 삭제

        // 저장된 모든 객체 출력 (일반 for문 사용)
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }
        // 출력:
        // 0:Java
        // 1:JDBC
        // 2:iBATIS

        // 저장된 모든 객체 출력 (foreach문 사용)
        System.out.println();
        for (String str2 : list) {
            System.out.print(str2 + " ");
        }
        // 출력: Java JDBC iBATIS
    }
}
