package test.chapter18.abstract03;

import chapter18.abstract03.student.Student;

public class Main {
    public static void main(String[] args) {

        University university = new University("홍길동", 2, 24, "김경순");
        Elementary elementary = new Elementary("박지성", 3, "박길순");
        Student[] students = new Student[2];
//        students[0] = university;
//        students[1] = elementary;
        for (Student student : students) {
            System.out.println("학생 이름:" + student.getName());
            System.out.println(student.getTeacher());
        }
    }
}
