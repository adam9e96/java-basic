package chapter12.student02;

public class Student02Demo02 {
    public static void main(String[] args) {
    /*
    멤버 변수로 접근하는 방법
    1) 바로 접근
    2) 메서드를 통한 접근이 가능.
    일반적으로는 메서드를 통한 접근을 사용.
     */
        Student student1 = new Student();
        student1.setStudentName("김문도");
        System.out.println(student1.getStudentName());

        Student student2 = new Student();
        student2.setStudentName("홍길동");
        System.out.println(student2.getStudentName());
    }
}
