package chapter12.student02;

public class Student02Demo {
    public static void main(String[] args) {

        Student studentAhn = new Student();
        System.out.println(studentAhn.studentName);

        studentAhn.studentName = "안승연";

        // 같은 결과가 나옴.
        System.out.println(studentAhn.studentName); // 안승연
        System.out.println(studentAhn.getStudentName()); // 안승연

        // 위처럼 인스턴스변수에 직접 접은은 막고 보안을 위해 메서드 get, set 를 통해 접근하는 것이
        //  자바에선 권장된다.
    }
}
