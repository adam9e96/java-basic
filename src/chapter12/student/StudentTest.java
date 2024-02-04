package chapter12.student;

public class StudentTest {
    public static void main(String[] args) {
         /*
        학생을 나타내는 클래스 Student 을(를) 만든다.
        학생은 이름(name)과 학번(rollNo), 나이(age)를 가진다.
        학번은 private 을(를) 선언한다.
        메서드는 생성자만 가진다.
        생성자를 실행하면 아래의 결과 값이 출력된다.
         */
        Student student = new Student("Kim", "0001", 20);
        /*
        학생의 이름 : Kim
        학생의 학번 : 0001
        학생의 나이 : 20
        Student 객체가 생성되었습니다.
         */
    }
}
