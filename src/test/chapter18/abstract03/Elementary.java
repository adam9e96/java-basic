package test.chapter18.abstract03;

public class Elementary extends Student {
    public Elementary(String name, int grade, String teacher) {
        super(name, grade, teacher);
        System.out.println("Elementary 생성자 호출");
    }

    @Override
    public String getTeacher() {
        return "담당 선생님:" + super.teacher;
    }
}
