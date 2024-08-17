package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 사용자 데이터 관리
 * 사용자 정보를 관리할 때, 사용자 ID를 키로, 사용자 객체를 값으로 저장하여 빠르게 검색
 */
class User {
    private final String id;
    private final String name;
    private final String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "', email='" + email + "'}";
    }
}

class UserManager {
    private final Map<String, User> userMap = new HashMap<>();

    // 사용자 추가
    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }

    // 사용자 조회
    public User getUser(String id) {
        return userMap.get(id);
    }

    // 사용자 삭제
    public void removeUser(String id) {
        userMap.remove(id);
    }

    // 모든 사용자 출력
    public void printAllUsers() {
        for (Map.Entry<String, User> entry : userMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

public class HashMapDemo01 {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // 사용자 추가
        userManager.addUser(new User("1", "Alice", "alice@example.com"));
        userManager.addUser(new User("2", "Bob", "bob@example.com"));
        userManager.addUser(new User("3", "Charlie", "charlie@example.com"));

        // 특정 사용자 조회
        User user = userManager.getUser("2");
        System.out.println("조회된 사용자: " + user);

        // 모든 사용자 출력
        System.out.println("\n모든 사용자:");
        userManager.printAllUsers();

        // 특정 사용자 삭제
        userManager.removeUser("2");

        // 모든 사용자 출력
        System.out.println("\n사용자 삭제 후:");
        userManager.printAllUsers();
    }
}
