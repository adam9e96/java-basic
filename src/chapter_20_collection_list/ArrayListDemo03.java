package chapter_20_collection_list;

import java.util.ArrayList;

/*
 * ===========================================================
 * Class Name      : Student
 * Author          : adam9e96
 * Created Date    : 2024-01-25
 * Version         : 1.0
 * Description     : Student 클래스는 학생의 정보를 관리하며, 학생이 수강한 과목을 ArrayList로 관리하는 기능을 제공합니다.
 * ===========================================================
 * Summary:
 * - 이 클래스는 학생의 고유 아이디, 이름, 성적 정보를 관리합니다.
 * - 학생이 수강한 과목과 성적을 관리하기 위해 내부 클래스 Course를 사용합니다.
 * - ArrayList를 사용하여 과목 정보를 동적으로 추가 및 관리할 수 있습니다.
 *
 * Usage:
 * - 학생 객체를 생성하고, addCourse() 메서드를 사용하여 수강 과목과 성적을 추가합니다.
 * - getCourseList() 메서드를 사용하여 학생이 수강한 과목 목록을 출력할 수 있습니다.
 */

/**
 * Student 클래스는 학생의 정보를 관리하며, 학생이 수강한 과목을 ArrayList로 관리하는 기능을 한다.
 */
class Student { // 외부 클래스
    private String studentID; // 학생의 고유 아이디
    private String studentName; // 학생의 이름
    private int score; // 학생의 성적

    // 학생이 수강한 과목 정보를 저장하는 ArrayList
    private final ArrayList<Course> courses = new ArrayList<>();

    /**
     * Course 클래스는 학생이 수강한 과목 정보를 저장하는 내부 클래스입니다.
     */
    class Course {  // 내부 클래스
        private final String courseName; // 수업 과목명
        private final String courseGrade; // 학생의 해당 과목 성적 (A, B, C, D, F)

        public Course(String courseName, String courseGrade) {
            this.courseName = courseName;
            this.courseGrade = courseGrade;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getCourseGrade() {
            return courseGrade;
        }
    }   // 내부 클래스 끝

    /**
     * Student 생성자: 학생의 고유 아이디와 이름을 초기화합니다.
     *
     * @param studentID   학생의 고유 아이디
     * @param studentName 학생의 이름
     */
    public Student(String studentID, String studentName, int score) {  // 외부 클래스 생성자
        this.studentID = studentID;
        this.studentName = studentName;
        this.score = score;
    }

    /**
     * 학생이 수강한 과목을 추가합니다.
     *
     * @param courseName  수업 과목명
     * @param courseGrade 과목 성적
     */
    void addCourse(String courseName, String courseGrade) {
        courses.add(new Course(courseName, courseGrade));
    }

    /**
     * 학생이 수강한 모든 과목 리스트를 반환합니다.
     *
     * @return 학생이 수강한 과목 리스트
     */
    ArrayList<Course> getCourseList() {
        return courses;
    }
}

public class ArrayListDemo03 {
    public static void main(String[] args) {
        // Student 객체 생성 및 초기화
        Student student = new Student("a1234", "tom", 90);

        // 수강 과목 추가
        student.addCourse("java", "A");
        student.addCourse("sql", "C");
        student.addCourse("python", "B");

        // 수강 과목 리스트 출력
        ArrayList<Student.Course> courses = student.getCourseList(); // 학생의 과목 리스트 가져오기

        for (Student.Course course : courses) {  // 수강 과목 출력
            System.out.println("과목: " + course.getCourseName() + " / 성적: " + course.getCourseGrade());
        }
        /*
        결과:
        과목: java / 성적: A
        과목: sql / 성적: C
        과목: python / 성적: B
         */

        // 추가 테스트 코드: ArrayList의 toString() 메서드를 사용하여 리스트 출력
        System.out.println(courses);
    }
}
