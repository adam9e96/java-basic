package chapter12.student;

/**
 * Student 클래스는 학생의 이름, 학번, 나이를 나타내는 객체를 정의합니다.
 */
public class Student {
    /**
     * 학생의 이름
     */
    String name;
    /**
     * 학생의 학번(비공개)
     */
    private String rollNo;
    /**
     * 학생의 나이
     */
    int age;

    Student() {

    }

    /**
     * 학생의 이름, 학번, 나이로 Student 객체를 생성
     *
     * @param name   학생의 이름
     * @param rollNo 학생의 학번
     * @param age    학생의 나이
     */
    Student(String name, String rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        System.out.println("학생의 이름 : " + this.name);
        System.out.println("학생의 학번 : " + this.rollNo);
        System.out.println("학생의 나이 : " + this.age);
        System.out.println("Student 객체가 생성되었습니다.");
    }

    /**
     * 학생의 학번을 반호나
     *
     * @return 학생의 학번
     */
    public String getRollNo() {
        return this.rollNo;
    }

    /**
     * 학생의 학번을 설정합니다.
     *
     * @param rollNo 학생의 학번
     */
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
