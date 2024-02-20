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
    private String address;

    // 기본 생성자
    public Member() {
    }

    // 매개변수가 있는 생성자
    public Member(String id, String username, String name, int age, String address) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter와 Setter 메소드
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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString 메소드
    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
