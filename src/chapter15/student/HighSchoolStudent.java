package chapter15.student;

public class HighSchoolStudent extends Student {
    private int year; // 고등학교 학년 (1부터 3까지)

    public HighSchoolStudent(String name, int studentId, int[] grades, int year) {
        super(name, studentId, grades);
        this.year = year;
    }

    @Override
    public double calculateAverageGrade() {
        double avg = switch (year) {
            case 1 -> grades[0] * 0.3 + grades[1] * 0.3 + grades[2] * 0.2 + grades[3] * 0.2;
            case 2 -> grades[0] * 0.25 + grades[1] * 0.25 + grades[2] * 0.25 + grades[3] * 0.25;
            case 3 -> grades[0] * 0.2 + grades[1] * 0.2 + grades[2] * 0.3 + grades[3] * 0.3;
            default -> 0.0;
        };
        return avg;


    }

}
