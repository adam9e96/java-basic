package chapter_20_collection_list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * User 클래스는 사용자 정보를 담고 있는 객체를 정의합니다.
 */
class User {
    private int userId;   // 회원 아이디
    private String userPw;  // 회원 비밀번호

    public User(int userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userPw='" + userPw + '\'' +
                '}';
    }
}

/**
 * UserArrayList 클래스는 ArrayList를 사용하여 사용자 목록을 관리합니다.
 */
class UserArrayList {
    private final ArrayList<User> arrayList;  // ArrayList 선언

    UserArrayList() {
        this.arrayList = new ArrayList<>(); // User 형으로 선언한 ArrayList 생성
    }

    /**
     * 회원을 ArrayList에 추가합니다.
     *
     * @param user 추가할 회원 객체
     */
    public void addMember(User user) {
        arrayList.add(user);  // 회원을 추가
    }

    /**
     * 회원을 ID를 기준으로 ArrayList에서 삭제합니다.
     *
     * @param userId 삭제할 회원의 ID
     */
    public void removeMember(int userId) {
        for (User user : arrayList) {
            if (user.getUserId() == userId) {
                arrayList.remove(user);   // 해당 회원을 삭제
                return;
            }
        }
        System.out.println(userId + "가 존재하지 않습니다.");  // 회원 ID가 존재하지 않을 경우 출력
    }

    /**
     * ArrayList에 저장된 모든 회원을 출력합니다.
     */
    public void showAllMember() {
        for (User user : arrayList) {
            System.out.println(user);
        }
        System.out.println();  // 추가적인 줄바꿈을 위해 출력
    }
}

/**
 * UserLinkedList 클래스는 LinkedList를 사용하여 사용자 목록을 관리합니다.
 */
class UserLinkedList {
    private final LinkedList<User> linkedList;  // LinkedList 선언

    UserLinkedList() {
        this.linkedList = new LinkedList<>();  // User 형으로 선언한 LinkedList 생성
    }

    /**
     * 회원을 LinkedList에 추가합니다.
     *
     * @param user 추가할 회원 객체
     */
    public void addMember(User user) {
        linkedList.add(user);  // 회원을 추가
    }

    /**
     * 회원을 ID를 기준으로 LinkedList에서 삭제합니다.
     *
     * @param userId 삭제할 회원의 ID
     */
    public void removeMember(int userId) {
        for (User user : linkedList) {
            if (user.getUserId() == userId) {
                linkedList.remove(user);   // 해당 회원을 삭제
                return;
            }
        }
        System.out.println(userId + " 가 존재하지 않습니다.");  // 회원 ID가 존재하지 않을 경우 출력
    }

    /**
     * LinkedList에 저장된 모든 회원을 출력합니다.
     */
    public void showAllMember() {
        for (User user : linkedList) {
            System.out.println(user);
        }
        System.out.println();  // 추가적인 줄바꿈을 위해 출력
    }
}

/**
 * ArrayListDemo02 클래스는 UserArrayList와 UserLinkedList 클래스의 기능을 테스트하는 예제입니다.
 */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        UserArrayList userArrayList = new UserArrayList(); // UserArrayList 객체 생성
        UserLinkedList userLinkedList = new UserLinkedList(); // UserLinkedList 객체 생성

        // 새로운 회원 인스턴스 생성
        User memberLee = new User(1001, "123123");
        User memberSon = new User(1002, "123456");
        User memberPark = new User(1003, "123123");
        User memberHong = new User(1004, "123412");

        // UserArrayList에 회원 추가
        userArrayList.addMember(memberLee);
        userArrayList.addMember(memberSon);
        userArrayList.addMember(memberPark);
        userArrayList.addMember(memberHong);

        // UserArrayList에서 회원 삭제 및 전체 회원 출력
        userArrayList.removeMember(1003); // memberPark 삭제
        userArrayList.showAllMember();

        // UserLinkedList에 회원 추가
        userLinkedList.addMember(memberLee);
        userLinkedList.addMember(memberSon);
        userLinkedList.addMember(memberPark);
        userLinkedList.addMember(memberHong);

        // UserLinkedList에서 전체 회원 출력
        userLinkedList.showAllMember();

        // UserArrayList에서 회원 삭제 및 전체 회원 출력
        userArrayList.removeMember(1003); // 이미 삭제된 memberPark을 다시 삭제 시도
        userArrayList.showAllMember();
    }
}
