package chapter23.hashMapExam02;/*
 * ===========================================================
 * fileName       : HashMapExam02
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */
// HashMap에 아이디(String) 와 점수(Integer) 가 저장되어 있음
// 실행 결과와 같이 평균 점수를 출력하고, 최고점수와 최고점수를 받은 아이디를 출력할 것.

import java.util.HashMap;
import java.util.Map;

public class HashMapExam02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        System.out.println(map.toString());
        String name = null; // 최고 점수를 받은 아이디 저장
        int maxScore = 0; // 최고 점수 저장
        int totalScore = 0; // 점수 합계 저장
        double avgScore = 0.0;
        // 작성위치
        /*
            최고 점수를 받은 아이디 : blue
            최고 점수 : 96
            평균 점수 : 91.3333333333
         */
        for (String key : map.keySet()) {
            int thisScore = map.get(key);
            totalScore += thisScore;
            if (maxScore < thisScore) {
                maxScore = thisScore;
                name = key;
            }
        }


        System.out.println("최고 점수를 받은 아이디 : " + name);
        System.out.println("최고 점수: " + maxScore);
        avgScore = (double) totalScore / map.size();
        System.out.println("평균 점수 : " + avgScore);
    }

}
