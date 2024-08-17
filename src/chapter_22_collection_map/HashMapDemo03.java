package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 캐시(Cache) 시스템 구현
 * HashMap은 캐시 시스템의 간단한 구현에도 사용된다.
 * 자주 사용되는 데이터를 메모리에 저장해 두고 필요할 때 빠르게 접근 할 수 있도록 한다.
 */
class CacheManager {
    private final Map<String, String> cache = new HashMap<>();

    // 캐시에 데이터 추가
    public void put(String key, String value) {
        cache.put(key, value);
    }

    // 캐시에서 데이터 조회
    public String get(String key) {
        return cache.get(key);
    }

    // 캐시에서 데이터 삭제
    public void remove(String key) {
        cache.remove(key);
    }

    // 캐시 데이터 확인
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }
}

public class HashMapDemo03 {
    public static void main(String[] args) {
        CacheManager cacheManager = new CacheManager();

        // 캐시에 데이터 추가
        cacheManager.put("user:1001", "Alice");
        cacheManager.put("user:1002", "Bob");

        // 캐시에서 데이터 조회
        String user = cacheManager.get("user:1001");
        System.out.println("캐시에서 조회된 데이터: " + user);

        // 캐시에 데이터 존재 여부 확인
        boolean exists = cacheManager.containsKey("user:1002");
        System.out.println("user:1002 존재 여부: " + exists);

        // 캐시에서 데이터 삭제
        cacheManager.remove("user:1001");

        exists = cacheManager.containsKey("user:1001");
        System.out.println("삭제후 user:1001 존재 테스트: " + exists);


    }
}
