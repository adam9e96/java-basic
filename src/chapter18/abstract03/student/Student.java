package chapter18.abstract03.student;

public abstract class Student {
    public String name; // 이름
    public int grade; // 학년
    public String teacher;

    public Student() {
    }

    public Student(String name, int grade, String teacher) {
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudInfo() {
        System.out.println("Student 클래스의 getStudInfo() 메소드 호출");
        return "이름은 : " + name + " , 학년은 " + grade;
    }

    // 학생의 담임선생님의 이름을 구하는 메서드
    public abstract String getTeacher();
//    {
//       return "김길동 선생님";
//    }
}
