package chapter18.abstract03.student;

public class University extends Student {
    private int courses; // 신청 학점

    //    public University(String name, int grade, int courses) {
//        super(name, grade);
//        this.courses = courses;
//        System.out.println("University 생성자 호출");
//    }
    public University(String name, int grade, int courses, String teacher) {
        super();
        super.name = name;
        super.grade = grade;
        super.teacher = teacher;

        this.courses = courses;
        System.out.println("University 생성자 호출");
    }
//    public University(String name, int grade, int courses) {
//        super(name, grade);
//        this.courses = courses;
//        System.out.println("University 생성자 호출");
//    }

    @Override
    public String getStudInfo() {
        System.out.println("University 클래스의 getStudInfo 메소드 호출");
        return "이름은>> " + getName() + ", 학년은>> " + getGrade() + ", 신청 학점은>> " + courses;
    }

    @Override
    public String getTeacher() {
//        return "김경순 교수님";
        return "담당 선생님:" + super.teacher;
    }

    // 지도 교수의 이름을 구하는 메서드
//    public String getProfessor() {
//        return "김경순 교수님";
//    }
}
