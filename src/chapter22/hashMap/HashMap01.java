package chapter22.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // 요소 추가
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");

        // 요소 접근
        System.out.println("Capital of England: " + capitalCities.get("England"));

        // 요소 제거
        capitalCities.remove("Germany");

        // 크기 확인
        System.out.println("Size of the HashMap: " + capitalCities.size());

        // 요소 순회
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
