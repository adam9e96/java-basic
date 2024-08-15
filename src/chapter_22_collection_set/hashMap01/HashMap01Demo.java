package chapter_22_collection_set.hashMap01;/*
 * ===========================================================
 * fileName       : HashMap01Test
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01Demo {
    public static void main(String[] args) {

        // Map 객체 생성
        Map<String, Integer> map = new HashMap<>();

        //데이터 추가
        map.put("갤럭시", 24);
        map.put("갤럭시", 24);
        map.put("갤럭시", 24);
        map.put("아이폰", 15);
        map.put("픽셀", 8);

        // entrySet() 을 사용하여 Map.Entry 객체들을 얻음
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // 각 Entry에 대해 정보 출력
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", value: " + value);
        }

        System.out.println("총 Entry 수: " + map.size());

        // 키로 값 얻기
        String key = "갤럭시";
        int value = map.get(key);   // 키를 매개값으로 주면 값을 리턴함
        System.out.println(key + ": " + value);
        System.out.println();
        ;

        System.out.println("[키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기]");
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();


        // todo 해야됨
//        System.out.println("[엔트리 SEt 컬렉션을 얻고, 반복해서 키와 값을 얻기");
//        Set<Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Entry<String,Integer>> entryIterator = map.entrySet();
//        while (entrySet.hasNext()){
//            Entry<String, Integer> entry = entrySet.next();
//            String k =entry.getKey();
//            int v = entry.getValue();
//            System.out.println(k + " : " + v);
//        }
//        System.out.println();

        // 키로 엔트리 삭제
        map.remove("아이폰");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
        System.out.println(map);

        Set<String> keySet1 = map.keySet();
//        System.out.println(keySet1.size());
        System.out.println(keySet1); // 테스트 코드
        Iterator<String> keyIterator1 = keySet1.iterator();
        while (keyIterator1.hasNext()){
            String key1 = keyIterator1.next();
            int value1 = map.get(key1);
            System.out.println(key1 +" : " + value1);
        }
        System.out.println();


//        Set<String> keySet = map.keySet(); // keySet() : 모든 키를 Set 객체에 담아서 리턴. key Set 얻기   // 키에 선언된 타입이 Stirng이므로 Set도 제네릭을 String 으로 받아야한다.
//        Iterator<String> keyIterator = keySet.iterator();   // iterator 메소드는 Set 인터페이스
//        while (keyIterator.hasNext()) { // 반복해서 키를 얻고 값을 Map 에서 얻어냄
//            String key = keyIterator.next();
//            Integer value = map.get(key);
//            System.out.println("\t" + key + " : " + value);
//        }
//        System.out.println();
    }
}
