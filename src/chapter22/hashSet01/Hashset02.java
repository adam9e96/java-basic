package chapter22.hashSet01;
import java.util.HashSet;

/**
 * ===========================================================
 * fileName       : Hashset02
 * date           : 2024-03-03
 * description    :
 * ===========================================================
 */
public class Hashset02 {
    public static void main(String[] args) {
            HashSet<String> hset = new HashSet<String>();

            // 요소 추가
            hset.add("Apple");
            hset.add("Mango");
            hset.add("Grapes");
            hset.add("Orange");
            // 중복된 요소는 추가되지 않음
            hset.add("Apple");

            // 요소 순회
            for (String fruit : hset) {
                System.out.println(fruit);
            }

            // 요소 포함 여부 확인
            boolean isPresent = hset.contains("Mango"); // true 반환
            System.out.println("Is Mango present: " + isPresent);

            // 요소 제거
            hset.remove("Grapes");

            // HashSet의 크기 확인
            int size = hset.size();
            System.out.println("Size of HashSet: " + size);
        }
    }
