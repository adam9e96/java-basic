package chapter22_collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 이 프로그램은 아이디와 비밀번호를 사용자로부터 입력받아 저장된 맵(Map)과 비교하여
 * 로그인 절차를 수행한다.
 * <p>
 * 올바른 아이디와 비밀번호가 입력될 때까지 반복적으로
 * 로그인을 요청합니다.
 * <p>
 * 기능:
 * <ul>
 *     <li>아이디와 비밀번호가 모두 일치하면 "로그인되었습니다." 메시지 출력</li>
 *     <li>아이디는 일치하지만 비밀번호가 일치하지 않으면 "비밀번호가 일치하지 않습니다." 메시지 출력</li>
 *     <li>아이디가 일치하지 않으면 "입력하신 아이디가 존재하지 않습니다." 메시지 출력</li>
 * </ul>
 * </p>
 */
public class HashMapDemo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>(); // 아이디와 비밀번호를 저장하는 맵

        // 아이디와 비밀번호를 미리 저장
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");
        map.put("admin", "1234");

        // 로그인 시도 반복
        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요.");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();
            System.out.print("비밀번호 : ");
            String password = scanner.nextLine();
            System.out.println();

            // 입력된 아이디를 키로 하여 비밀번호를 가져옴
            String keyValueGets = map.get(id);  // get(id)는 키(id)에 해당하는 값을 가져옴, 없으면 null 반환

            // 입력한 아이디가 HashMap에 저장된 키값에 존재한다면
            if (keyValueGets != null) {
                // 아이디가 존재하고 비밀번호가 일치하는 경우
                if (password.equals(keyValueGets)) {
                    System.out.println("로그인되었습니다.");
                    break; // 로그인 성공 시 반복 종료
                } else {
                    // 아이디는 존재하지만 비밀번호가 일치하지 않는 경우
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                // 아이디가 존재하지 않는 경우
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
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
}
