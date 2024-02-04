package chapter23.hashMap01;/*
 * ===========================================================
 * fileName       : HashMap01
 * date           : 2024-01-29
 * description    :
 자바에서  `HashMap` 을 사용하여 문자열 키와 정수 값을 저장하고
 다양한 방식으로 데이터에 접근한느 방식이다.

 * ===========================================================
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    // 이름은 Key, 정수를 value 로 저장하기
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        // <String, Integer> -> String 을 키로, Integer 를 값으로 사용
        // Map 컬렉션은 키와 값을 제네릭으로 지정해줘야한다.

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90); // insert 방식임.
        map.put("동장군", 80); // put 자체가 add기능만 있는게 아니라 변경하고 싶으면 수정도 할 수 있음.
        map.put("홍길동", 95); // key가 중복된 // Key 가 같기 때문에 제일 마지막에 저장한 값으로 대채 // update 방식임
        System.out.println("총 Entry 수: " + map.size());  // 총 사이즈 출력
        // size() 메소드를 사용하여 HashMap 에 저장된 총 엔트리 수를 출력한다.

        // 객체 찾기
        // 이름(Key) 으로 점수(value)를 검색
        System.out.println("\t홍길동 : " + map.get("홍길동")); // key로 정수 값 검색
        System.out.println();

        // key 만 가져와서 set으로 바꿔서 찾기
        // 객체를 하나씩 처리   // 찾는건 set이다. 중복된 값이 없으니까. map에서 set으로 바꿔도 오류가 없다.
        Set<String> keySet = map.keySet(); // keySet() : 모든 키를 Set 객체에 담아서 리턴. key Set 얻기   // 키에 선언된 타입이 Stirng이므로 Set도 제네릭을 String 으로 받아야한다.
        Iterator<String> keyIterator = keySet.iterator();   // iterator 메소드는 Set 인터페이스
        while (keyIterator.hasNext()) { // 반복해서 키를 얻고 값을 Map 에서 얻어냄
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        // key를 set 방식으로 바꿔서 찾기


        // foreach문을 이용해서 출력 // foreach 문을 이용하되 entrySet으로 해보기  // case1
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        for (var entry : map.entrySet()) {  // var : 타입추론 // Java 10 이상의 버전에서는 변수 타입 추론을 사용할 수 있음 // for each 문안에서만 임시적으로 쓸 수 있음
            String strKey = entry.getKey(); // 자바스크립트의 var과는 다름.
            Integer intValue = entry.getValue();
            System.out.println(strKey + ":" + intValue);
        }
        System.out.println();

        // foreach문을 사용해 출력. case2
        for (var strKey : map.keySet()) {
            Integer intValue = map.get(strKey);
            System.out.println(strKey + ":" + intValue);
        }

        System.out.println();

        // 객체를 하나씩 처리   // 1번과 2번 짬뽕
        // entrySet() : 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 SEt에 담아서 리턴
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  // Map.Entry Set 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();
        // 객체 삭제
        map.remove("홍길동");  // 키로 Map.Entry를 제거
        System.out.println("총 Entry 수 : " + map.size());// 총 Entry 수 : 2

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수 : " +map.size()); // 총 Entry 수 : 0
    }
}
