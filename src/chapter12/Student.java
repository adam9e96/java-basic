package chapter12;

public class Student {
    int studentId; // 학번
    String studentName; // 이름
    int grade; // 학년
    String address; // 주소

    /*
    클래스 외부에서 클래스의 변수(필드)에 접근할 수 있는 방법은 2가지.
    Student student = new Student();
    1) 바로 접근하는 방법. student.StudentName()
    2) 메서드로 접근하는 방법. student.getStudentName()
    자바에서는 보안문제로 2번을 주로 사용하게 됨.
     */
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void showStudentInfo() {
        // 저장된 이름, 주로를 알려줌
        System.out.println(studentName + ", " + address); // 이름, 주소
    }

    public String getStudentName() {
        // studentName 을 반환
        return studentName;
    }

    public void setStudentName(String name) {
        // studentName 을 저장
        studentName = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
