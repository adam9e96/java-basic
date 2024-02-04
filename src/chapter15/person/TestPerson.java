package chapter15.person;

public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student(); // 학생 인스턴스 student 생성
        student.breath(); // 사람 클래스의 breath 메서드를 상속 받았음
        student.learn();
        student.say(); // 사람 클래스의 say 메서드를 상속 받았음
        student.eat(); // 사람 클래스의 eat 메서드를 상속 받았음

        Teacher teacher = new Teacher(); // 선생 인스턴스 teacher 생성
        teacher.eat(); // 사람 클래스의 eat 메서드를 상속 받았음
        teacher.teach();
        teacher.say();

        Person person = new Person();
        person.breath();
//        person.learn(); // 자식 클래스의 메서드나 멤버 변수는 사용하지 못함.
    }
}
