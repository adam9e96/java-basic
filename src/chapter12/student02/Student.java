package chapter12.student02;

/**
 * Student 클래스는 학생의 학번, 이름, 학년, 주소를 나타내며,
 * 클래스 외부에서 이러한 필드에 접근할 수 있는 메서드를 제공합니다.
 */
public class Student {
    /**
     * 학생의 학번
     */
    int studentId; // 학번
    /**
     * 학생의 이름
     */
    String studentName; // 이름
    /**
     * 학생의 학년
     */
    int grade; // 학년
    /**
     * 학생의 주소
     */
    String address; // 주소

    /*
    클래스 외부에서 클래스의 변수(필드)에 접근할 수 있는 방법은 2가지.
    Student student = new Student();
    1) 바로 접근하는 방법. student.StudentName()
    2) 메서드로 접근하는 방법. student.getStudentName()
    자바에서는 보안문제로 2번을 주로 사용하게 됨.
     */

    /**
     * 학생의 학년을 반환합니다.
     *
     * @return 학생의 학년
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 학생의 학년을 설정합니다.
     *
     * @param grade 학생의 학년
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * 학생의 이름과 주소를 출력합니다.
     */
    public void showStudentInfo() {
        // 저장된 이름, 주로를 알려줌
        System.out.println(studentName + ", " + address); // 이름, 주소
    }

    /**
     * 학생의 이름을 반환합니다.
     *
     * @return 학생의 이름
     */
    public String getStudentName() {
        // studentName 을 반환
        return studentName;
    }

    /**
     * 학생의 이름을 설정합니다.
     *
     * @param name 학생의 이름
     */
    public void setStudentName(String name) {
        // studentName 을 저장
        studentName = name;
    }

    /**
     * 학생의 주소를 반환합니다.
     *
     * @return 학생의 주소
     */
    public String getAddress() {
        return address;
    }

    /**
     * 학생의 주소를 설정합니다.
     *
     * @param address 학생의 주소
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
