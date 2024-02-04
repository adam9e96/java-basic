package chapter18.abstract03.student;

public class Main {
    public static void main(String[] args) {
        /*
        해당 소스를 추상클래스를 도입해서 오버라이딩에 강제성을 부여할 것.
        객체 생성 시에 담당 교수나 선생을 입력하는 생성자를 추가할 것.
         */
        University university = new University("홍길동", 2, 24, "김경순");
        Elementary elementary = new Elementary("박지성", 3, "박길순");

        // 선생님 혹은 교수님의 이름을 호출
//        Student student1 = new Student(); 
        Student[] students = new Student[2];
        students[0] = university;
        students[1] = elementary;
        for (Student student : students) {
            System.out.println("학생 이름:" + student.getName());
            System.out.println(student.getTeacher());
        }
    }
}
/*
University 생성자 호출
Elementary 생성자 호출
학생 이름:홍길동
담당 선생님:김경순
학생 이름:박지성
담당 선생님:박길순
 */
/*
개발 관리자가 Student 상위 클래스를 만들면서 학생의 담당 선생이나 교수를 구하는 메서드 getTeacher()를 만들었고,
각 개발자에게 오버라이딩을 하라고 시킴.
하지만 기존의 개발자가 교체되어서 해당 프로젝트에 익숙하지 않은 경우
관리자의 지시를 잘못 이해해서 Elementary, University 클래스 제작시에 기능은 유사하지만 이름은 다른 메서드를 만들게 됨.

이 후에 다른 개발자들이 만든 Student 를 상속한 클래스와 통일성을 잃어버리게 됨.
현재 프로그래밍 경향은 개발자가 각 기능을 알아서 구현하는 것 보다는
프로젝트의 규모가 점점 커지므로 향후 유지보수나 관리를 위해서는
누구나 쉽게 소스를 이행하고, 소스의 구조를 일정하게 유지해야 할 필요성이 있음.

하지만 이런 방식으로 오버라이딩을 구현하면 개발자가 임의로 소스를 구현할 수 있기 때문에
통일성을 읽어버릴 수 있음.
단순한 프로그램의 개발 보다 개발 생산성이 높고, 유지보수가 ㅇ쉬우며, 기능의 변경이나 확장이 용이함.
 */