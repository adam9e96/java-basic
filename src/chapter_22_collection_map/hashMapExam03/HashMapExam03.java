package chapter_22_collection_map.hashMapExam03;/*
 * ===========================================================
 * fileName       : HashMapExam03
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    TITLE : 아이디와 비밀번호 검사하기
    아이디 비번을 입력을 받아서 map 에 저장된 값과 비교를 해서
    1) 동일한 아이디 비번이 있는 경우에는 "로그인되었습니다."
    2) 동일한 아이디는 잇는데 비번이 틀릴 경우 "비밀번호가 일치하지 않습니다."
    3) 동일한 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 가 출력 되도록 해라
    4) 로그인을 성공할 때 까지 계속 로그인을 요청하도록 해라.
 */
public class HashMapExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>(); // 키와 값으로 String 사용

        // 아이디와 비밀번호를 미리 저장
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요.");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();
            System.out.print("비밀번호 : ");
            String password = scanner.nextLine();
            System.out.println();

            // 작성위치

//            if (id.equals(map.get(id))) {
//                if (password.equals(map.get(password))) {
//                    System.out.println("로그인되었습니다.");
//                    break;
//                } else {
//                    System.out.println("비밀번호가 일치 하지 않습니다.");
//                }
//            } else {
//                System.out.println("입력하신 아이디가 존재하지 않습니다.");
//            }
//        }
            // 수정된 부분
            String keyValueGets = map.get(id);  // get(id) key(id)값을 가져와라 못가져오면 null임
            if (keyValueGets != null) {
                if (password.equals(keyValueGets)) {
                    System.out.println("로그인되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }
        // todo
//            - for 문으로도 해봐라. 조금길다. <<< 이해하는데 좋음
    }
}












/*
Map에서 get 메소드를 사용하여 값을 가져올 때, 만약 주어진 키에 해당하는 값이 맵에 존재하지 않으면 null을 반환합니다.
따라서 특정 키에 대한 get 호출의 반환 값이 null이라면 해당 키가 맵에 존재하지 않는 것을 의미합니다.

여기서 id.equals(map.get(id))와 같이 직접적으로 id와 map.get(id)를 비교하는 것은 문제가 될 수 있습니다.
만약 id에 해당하는 키가 맵에 존재하지 않는 경우, map.get(id)는 null을 반환할 것이고, null.equals(id)를 시도하게 됩니다.
이는 NullPointerException을 발생시킬 수 있습니다.

따라서 수정된 부분에서는 map.get(id)의 반환 값을 keyValueGets 변수에 저장하고,
그 후에 keyValueGets가 null인지 여부를 체크한 후에 비밀번호와 비교하고 있습니다.
이렇게 함으로써 NullPointerException을 방지할 수 있습니다.
 */
