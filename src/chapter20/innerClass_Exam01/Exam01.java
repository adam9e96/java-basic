package chapter20.innerClass_Exam01;

/**
 * ===========================================================
 * fileName       : Exam01
 * date           : 2024-01-24
 * description    : 내부클래스 연습문제-1
 * ===========================================================
 * 1. Student 클래스를 작성하세요.
 * 이 클래스는 다음과 같은 속성을 가져야 합니다.
 * <p>
 * studentID (문자열): 학생의 고유 아이디
 * studentName (문자열): 학생의 이름
 * score (정수): 학생의 성적
 * <p>
 * 2. Student 클래스 내에 내부 클래스 Course 를 작성하세요.
 * Course 클래스는 다음과 같은 속성을 가져야 합니다.
 * <p>
 * courseName (문자열): 수업 과목명
 * courseGrade (문자열): 학생의 해당 과목 성적 (A, B, C, D, F)
 * <p>
 * 3. Student 클래스 내에서 addCourse(String courseName, String courseGrade) 메서드를 작성하세요. <-- 매개변수가 내부클래스의 변수와 동일함
 * 이 메서드는 수업 과목명과 성적을 인자로 받아 Course 객체를 생성하고 학생의 과목 배열에 추가합니다. <-- new 키워드로 객체 생성 및 배열에 넣기
 * <p>
 * 4. Student 클래스 내에서 getCourseList() 메서드를 작성하세요.
 * 이 메서드는 학생이 수강한 과목 배열을 반환합니다.
 * <p>
 * 5. Main 클래스에서 다음과 같은 작업을 수행하세요.
 * <p>
 * Student 객체를 생성하고, addCourse() 메서드를 사용하여 여러 과목을 추가합니다.
 * getCourseList() 메서드를 사용하여 학생의 과목 리스트를 출력합니다.
 * 이 문제를 해결하기 위해 Student 클래스 내에 내부 클래스 Course 를 작성하고,
 * addCourse() 및 getCourseList() 메서드를 작성하여 학생의 과목 관리를 수행하세요.
 * 그리고 Main 클래스에서 객체를 생성하여 작업을 수행하세요.
 */
class Student { // 외부 클래스
    private String studentID; // 학생의 고유 아이디
    private String studentName; // 학생의 이름
    private int score; // 학생의 성적
    private int index = 0; // 인덱스
    private Course[] courses = new Course[10]; // 내부 클래스 객체 배열 생성. 크기는 자유

    class Course {  // 내부 클래스
        private String courseName; // 수업 과목명
        private String courseGrade; // 학생의 해당 과목 성적 (A, B, C, D, F)

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

    public Student(String studentID, String studentName) {  // 외부 클래스 생성자
        this.studentID = studentID;
        this.studentName = studentName;
    }

    void addCourse(String courseName, String courseGrade) {
        courses[index++] = new Course(courseName, courseGrade);
//        this.courseGrade = courseGrade;
    }

    Course[] getCourseList() {  // 내부 클래스 객체 배열 리턴(=학생이 수강한 과목 배열을 반환)
        return courses;
    }

    public int getIndex() {
        return index;
    }
}

public class Exam01 {
    public static void main(String[] args) {
        Student student = new Student("a1234", "tom");  // 외부 클래스 객체 생성 및 초기화
        student.addCourse("java", "A");
        student.addCourse("sql", "C");
        student.addCourse("python", "B");

        Student.Course[] courses = student.getCourseList(); // 내부 클래스 객체 배열 생성

        for (int i = 0; i < student.getIndex(); i++) {
            System.out.println("과목: " + courses[i].getCourseName() + " / 성적: " + courses[i].getCourseGrade());
        }
        /*
        결과)
        과목: java / 성적: A
        과목: sql / 성적: C
        과목: python / 성적: B
         */
    }
}
