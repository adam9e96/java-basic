package chapter22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 이 프로그램은 HashMap에 저장된 아이디(String)와 점수(Integer)를 사용하여
 * 최고 점수를 받은 아이디와 최고 점수, 그리고 평균 점수를 계산하여 출력합니다.
 */
public class HashMapDemo05 {
    public static void main(String[] args) {
        // HashMap에 아이디와 점수 저장
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        // 초기화: 최고 점수를 받은 아이디, 최고 점수, 총 점수
        String name = null; // 최고 점수를 받은 아이디를 저장할 변수
        int maxScore = 0; // 최고 점수를 저장할 변수
        int totalScore = 0; // 모든 점수의 합계를 저장할 변수

        // HashMap의 모든 항목에 대해 점수 합계와 최고 점수를 계산
        for (String key : map.keySet()) {
            int thisScore = map.get(key);
            totalScore += thisScore;
            if (maxScore < thisScore) { // 최고 점수 갱신
                maxScore = thisScore;
                name = key;
            }
        }

        // 평균 점수 계산
        double avgScore = (double) totalScore / map.size();

        // 결과 출력
        System.out.println("최고 점수를 받은 아이디 : " + name);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("평균 점수 : " + avgScore);
    }
}
