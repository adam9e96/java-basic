package chapter_21_collection_map.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * 주요 메소드
 * put(K key, V value): 지정된 키와 값을 맵에 추가합니다.
 * get(Object key): 지정된 키에 해당하는 값을 반환합니다.
 * remove(Object key): 지정된 키에 해당하는 키-값 쌍을 맵에서 제거합니다.
 * containsKey(Object key): 맵에 지정된 키가 포함되어 있는지 확인합니다.
 * containsValue(Object value): 맵에 지정된 값이 포함되어 있는지 확인합니다.
 * isEmpty(): 맵이 비어 있는지 확인합니다.
 * size(): 맵의 크기를 반환합니다.
 * clear(): 맵의 모든 요소를 제거합니다.
 * keySet(): 맵의 모든 키를 포함하는 Set을 반환합니다.
 * values(): 맵의 모든 값을 포함하는 Collection을 반환합니다.
 * entrySet(): 맵의 모든 키-값 쌍을 포함하는 Set을 반환합니다.
 */
public class HashMap01 {
    public static void main(String[] args) {

        // 요소 선언 및 초기화
        HashMap<String, String> capitalCities = new HashMap<>();

        // 요소 추가           //Key  ,  Value
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");

        // 요소 접근
        System.out.println("Capital of England: " + capitalCities.get("England"));
        System.out.println();

        // 요소 제거
        capitalCities.remove("Germany");

        // 크기 확인
        System.out.println("Size of the HashMap: " + capitalCities.size()); // 3

        // 요소 순회
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        System.out.println("=======================");

        // HashMap 초기화 및 요소 추가
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // entrySet()을 사용하여 요소 순회
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // HashMap 특징
        // 요소의 순서를 보장하지 않음
        // --> 내부적으로 해싱을 사용하여 요소를 저장하기 때문
        // 따라서 삽입된 순서에 상관없이 요소가 저장되고 검색된다.
        // 순서가 중요한 경우 : LinkedHashMap, TreeMap과 같은 다른 맵을 사용해야 한다.
    }
}
