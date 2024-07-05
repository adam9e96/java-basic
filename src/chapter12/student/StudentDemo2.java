package chapter12.student;

public class StudentDemo2 {
    public static void main(String[] args) {
        // Student 클래스를 선언하고 StudentExample 클래스의 main() 메소드에서 Student 객체를 생성해보기
        Student s1 = new Student();
        System.out.println("S1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("S2 변수가 Student 객체를 참조합니다.");

        Student s3 = s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
