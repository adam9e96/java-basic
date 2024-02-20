package Project1;

/**
 * ===========================================================
 * fileName       : Member
 * date           : 2024-02-20
 * description    : Member DTO
 * Member 클래스 최종.
 * ===========================================================
 */
public class Member {
    private int memberId; // 완성
    private String userId; // 완성
    private String name;    // 완성
    private int age;    // 완선
    private String addr; //완성

    // 기본 생성자
    public Member() {
    }

    public Member(int memberId, String userId, String name, int age, String addr) {
        this.memberId = memberId;
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
