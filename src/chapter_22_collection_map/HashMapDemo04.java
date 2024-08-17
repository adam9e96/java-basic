package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 4. 로그 메시지 카운터
 * 로그 메시지의 발생 빈도를 세는 경우에도 HashMap을 사용할 수 있습니다.
 */
class LogCounter {
    private final Map<String, Integer> logCountMap = new HashMap<>();

    // 로그 메시지 카운트 증가
    public void logMessage(String message) {
        logCountMap.put(message, logCountMap.getOrDefault(message, 0) + 1);
    }

    // 특정 로그 메시지의 카운트 조회
    public int getMessageCount(String message) {
        return logCountMap.getOrDefault(message, 0);
    }

    // 모든 로그 메시지와 카운트 출력
    public void printLogCounts() {
        for (Map.Entry<String, Integer> entry : logCountMap.entrySet()) {
            System.out.println("Message: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }


}

public class HashMapDemo04 {
    public static void main(String[] args) {
        LogCounter logCounter = new LogCounter();

        // 로그 메시지 기록
        logCounter.logMessage("ERROR 404: Not Found");
        logCounter.logMessage("INFO: User logged in");
        logCounter.logMessage("ERROR 404: Not Found");
        logCounter.logMessage("INFO: User logged in");
        logCounter.logMessage("ERROR 500: Internal Server Error");

        // 특정 로그 메시지의 카운트 조회
        int count = logCounter.getMessageCount("ERROR 404: Not Found");
        System.out.println("ERROR 404 발생 횟수: " + count);

        // 모든 로그 메시지 카운트 출력
        System.out.println("\n모든 로그 메시지 카운트:");
        logCounter.printLogCounts();
    }
}
