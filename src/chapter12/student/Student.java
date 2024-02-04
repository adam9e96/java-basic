package chapter12.student;

public class Student {
    String name;
    private String rollNo;
    int age;

    Student(String name, String rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        System.out.println("학생의 이름 : " + this.name);
        System.out.println("학생의 학번 : " + this.rollNo);
        System.out.println("학생의 나이 : " + this.age);
        System.out.println("Student 객체가 생성되었습니다.");
    }
}
