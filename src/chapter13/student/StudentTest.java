package chapter13.student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 1, 1);
        student.updateRecord(100, 60, 76);
        System.out.println(student);

        System.out.println("이름: " + student.getName());
        System.out.println("총점: " + student.getTotal());
        System.out.println("평균: " + student.getAverage());

    }

}
