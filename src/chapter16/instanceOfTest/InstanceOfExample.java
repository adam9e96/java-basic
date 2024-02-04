package chapter16.instanceOfTest;

// 객체 타입 확인
public class InstanceOfExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void PersonInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // person 이(가) 참조하는 객체가 Student 타입인지 확인
//        if (person instanceof Student) {
//            // Student 객체 일 경우 강제 타입 변환
//            Student student = (Student) person;
//            // Student 객체만 가지고 있는 필드 및 메소드 사용
//            System.out.println("studentNO: " + student.studentNo);
//            student.study();
//        }

        // person 이 참조하고 있는 객체가 Student 타입일 경우
        // student 변수에 대입 (타입 변환 발생)
        if (person instanceof Student student) {
            System.out.println("StudentNo: " + student.studentNo);
            student.study();
        }
    }


    public static void main(String[] args) {
        // Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        PersonInfo(p1);

        System.out.println();

        // Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        PersonInfo(p2);
    }
}
