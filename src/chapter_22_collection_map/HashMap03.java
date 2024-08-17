package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * ===========================================================
 * 파일명       : HashMap03
 * 작성일       : 2024-01-29
 * 설명         : HashMap을 사용하여 데이터를 추가, 조회, 삭제하고,
 * 다양한 방법으로 데이터를 순회(iterate)하는 예제
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">Java HashMap Documentation</a>
 * ===========================================================
 */
public class HashMap03 {
    public static void main(String[] args) {

        // HashMap 객체 생성 및 데이터 추가
        Map<String, Integer> map = new HashMap<>();

        // 데이터 추가 (중복된 키 "갤럭시"가 추가되며, 기존 값이 덮어써짐)
        map.put("갤럭시", 24);
        map.put("아이폰", 15);
        map.put("픽셀", 8);

        // entrySet()을 사용하여 Map.Entry 객체들의 Set을 얻음
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        var entrySet = map.entrySet(); // 이것도 되는듯

        // 각 Entry에 대해 키와 값을 출력
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        // 현재 Map에 있는 총 Entry 수 출력
        System.out.println("총 Entry 수: " + map.size());

        // 특정 키로 값 얻기
        String key = "갤럭시";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // keySet()을 사용하여 모든 키의 Set을 얻고, 이를 통해 각 키와 값을 반복하여 출력
        System.out.println("[키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기]");
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 특정 키로 Entry 삭제 ("아이폰" 키에 해당하는 Entry 삭제)
        map.remove("아이폰");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
        System.out.println(map);

        // 남은 키들을 반복하여 출력
        Set<String> keySet1 = map.keySet();
        System.out.println(keySet1);
        Iterator<String> keyIterator1 = keySet1.iterator();
        while (keyIterator1.hasNext()) {
            String key1 = keyIterator1.next();
            int value1 = map.get(key1);
            System.out.println(key1 + " : " + value1);
        }
        System.out.println();
    }
}
