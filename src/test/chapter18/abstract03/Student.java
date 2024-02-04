package test.chapter18.abstract03;

public abstract class Student {
    public String name; // 이름
    public int grade; // 학년
    public String teacher;

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
        System.out.println("Student 클래스의 getStudINfo() 메소드 호출");
        return "이름은 : "+ name + ", 학년은 " + grade;
    }
    public abstract String getTeacher();

}
