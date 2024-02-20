package Project1;

/**
 * ===========================================================
 * fileName       : Member
 * date           : 2024-02-20
 * description    : Member DTO
 * ===========================================================
 */
public class Member {
    private String id;
    private String username;
    private String name;
    private int age;
    private String addr;

    // 기본 생성자
    public Member() {
    }

    public Member(String id, String username, String name, int age, String address) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.addr = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAddress() {
        return addr;
    }

    public void setAddress(String address) {
        this.addr = address;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + addr + '\'' +
                '}';
    }
}
