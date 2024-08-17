package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 이 클래스는 Java에서 HashMap을 사용하는 기본적인 예제 <p>
 * - 배우는 메소드 <p>
 * <p>
 * 1. 요소 추가
 * 2. 접근
 * 3. 제거
 * 4. HashMap의 엔트리 순회등
 * </p>
 * <p>
 * Note:
 * </p>
 * HashMap은 Java Collections Framework의 일부로, Map 인터페이스를 구현합니다.
 * 요소를 저장할 때 해시 테이블을 사용하기 때문에 요소의 순서를 유지하지 않습니다.
 * 또한 null 값과 null 키를 허용합니다.
 * <p>
 * 이 예제에서 다루는 주요 메서드:
 * </p>
 * <ul>
 *   <li>{@link java.util.HashMap#put(Object, Object) put(K key, V value)}: 지정된 키-값 쌍을 맵에 추가합니다.</li>
 *   <li>{@link java.util.HashMap#get(Object) get(Object key)}: 지정된 키와 연관된 값을 반환합니다.</li>
 *   <li>{@link java.util.HashMap#remove(Object) remove(Object key)}: 지정된 키와 연관된 키-값 쌍을 맵에서 제거합니다.</li>
 *   <li>{@link java.util.HashMap#containsKey(Object) containsKey(Object key)}: 맵에 지정된 키가 포함되어 있는지 확인합니다.</li>
 *   <li>{@link java.util.HashMap#containsValue(Object) containsValue(Object value)}: 맵에 지정된 값이 포함되어 있는지 확인합니다.</li>
 *   <li>{@link java.util.HashMap#isEmpty() isEmpty()}: 맵이 비어 있는지 확인합니다.</li>
 *   <li>{@link java.util.HashMap#size() size()}: 맵의 크기를 반환합니다.</li>
 *   <li>{@link java.util.HashMap#clear() clear()}: 맵의 모든 요소를 제거합니다.</li>
 *   <li>{@link java.util.HashMap#keySet() keySet()}: 맵에 있는 모든 키를 포함하는 Set을 반환합니다.</li>
 *   <li>{@link java.util.HashMap#values() values()}: 맵에 있는 모든 값을 포함하는 Collection을 반환합니다.</li>
 *   <li>{@link java.util.HashMap#entrySet() entrySet()}: 맵에 있는 모든 키-값 쌍을 포함하는 Set을 반환합니다.</li>
 * </ul>
 */
public class HashMap01 {
    /*
     *  HashMap에 나라의 수도를 저장하는 클래스
     */
    public static void main(String[] args) {

        // 수도를 저장할 HashMap 선언 및 초기화
        // Key : String 타입
        // Value : String 타입
        HashMap<String, String> capitalCities = new HashMap<>();

        // HashMap 요소 추가 (put 메소드)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Russia", "Moscow");

        // 요소 접근 (get 메소드)
        System.out.println("England의 수도: " + capitalCities.get("England"));
        System.out.println("Germany의 수도: " + capitalCities.get("Germany"));
        System.out.println();

        // 요소 제거
        capitalCities.remove("Germany"); // Germany 키와 관련된 요소 삭제

        // HashMap 크기 확인
        System.out.println("HashMap의 크기: " + capitalCities.size()); // 3
        System.out.println();

        System.out.println("내 지갑이 비웠소");
        System.out.println(capitalCities.entrySet());

        // HashMap 엔트리 순회
        // entrySet()을 사용하여 요소 순회
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("나라: " + entry.getKey() + ", 수도: " + entry.getValue());
        }

        System.out.println("=======================");

        // 다른 데이터 타입을 사용하는 HashMap 초기화
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // entrySet()을 사용하여 요소 순회
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // HashMap의 특징:
        // 요소의 순서는 보장되지 않음.
        // 요소는 삽입 순서와 상관없이 해시 코드에 기반하여 저장 및 검색됨.
        // 순서가 중요한 경우 LinkedHashMap 또는 TreeMap 사용을 고려해야 함.
    }
}
