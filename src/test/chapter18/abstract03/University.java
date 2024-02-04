package test.chapter18.abstract03;

public class University extends Student {
    private int courses; // 신청 학점


    public University(String name, int grade, int courses, String teacher) {
        super(name, grade, teacher);
//        super.name = name;
//        super.grade = grade;
        this.courses = courses;
        System.out.println("University 생성자 호출");
    }

    @Override
    public String getStudInfo() {
        System.out.println("University 클래스의 getStudInfo 메소드 호출");
        return "이름은>> " + getName() + ", 학년은>> " + getGrade() + ", 신청 학점은>> " + courses;
    }

    @Override
    public String getTeacher() {
        return "담당 선생님: "+this.teacher;
    }
}
