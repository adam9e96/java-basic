package chapter13.test2;

public class Person {
    /* 클래스 작성 및 접근 제어
    Person 이라는 클래스를 작성하고 테스트 하라.
    Person 이라는 클래스는 다음과 같은 필드와 메서드를 가진다.
    # 필드
    name : 이름 (private)
    mobile : 핸드폰 번호 (private)
    office : 직장 전화번호 (private)
    email : 이메일 주소 (private)

    # 메서드
    Person(name, mobile, office, email) : 생성자 메서드
    printInfo() : 객체의 정보를 문자열로 변환하는 메서드
    setName(), getName() ... : 각 속성에 대한 접근자와 설정자 메서드
     */
    private String name;
    private String mobile;
    private String office;
    private String email;


    public Person() {

    }

    public Person(String name, String mobile, String office, String email) { // 생성자 메서드
        this.name = name;
        this.mobile = mobile;
        this.office = office;
        this.email = email;
    }

    @Override
    public String toString() { // 객체의 정보를 문자열로 변환하는 메서드
        return "name=" + "'" + name + "', mobile='" + mobile +
                "', office ='" + office + "', email='" + email + "'";
    }

    //    public String printInfo() { // 객체의 정보를 문자열로 변환하는 메서드
//        return "name=" + "'" + name + "', mobile='" + mobile + "', office ='" + office + "', email='" + email + "'";
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
