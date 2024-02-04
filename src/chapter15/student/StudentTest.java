package chapter15.student;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("김철수", 8086, new int[]{90, 85, 78, 92});
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("김수기", 8765, new int[]{90, 85, 78, 92}, 1);

        System.out.println(Arrays.toString(student.getGrades()));
        System.out.println(Arrays.toString(highSchoolStudent.getGrades()));
        System.out.println(student.calculateAverageGrade());
        System.out.println(highSchoolStudent.calculateAverageGrade());

    }
}
