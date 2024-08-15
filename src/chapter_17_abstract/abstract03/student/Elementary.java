package chapter_17_abstract.abstract03.student;

public class Elementary extends Student {
    public Elementary(String name, int grade, String teacher) {
        super(name, grade, teacher);
        System.out.println("Elementary 생성자 호출");
        super.name = name;
        super.grade = grade;
        super.teacher = teacher;
    }
//    public Elementary(String name, int grade){
//        super.name = name;
//        super.grade = grade;
//    }

    @Override
    public String getTeacher() {
        return "담당 선생님:" + super.teacher;
    } // abstract로 강제하지 않으면 아래처럼 의도처럼 돌아가지 않는다.

    // 초등학교 담임선생님을 구하는 메서드
//    public String getClassTeacher() {
//        return "박길순 선생님";
//    }
}
