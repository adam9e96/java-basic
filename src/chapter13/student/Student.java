package chapter13.student;

public class Student {
    /*
    Student 클래스를 생성하세요.
    이름 name, 반 ban, 번호 no 를 입력 받는 생성자를 만드시오.
    국어 kor, 영어 eng, 수학 math 성적을 입력받는 updateRecord() 메서드를 작성하시오.
    학생의 이름을 반환하는 getName(), 입력받은 성적의 합계를 구하는 getTotal(),
    평균을 반환하는 getAverage() 를 작성하세요.
     */
    private String name;
    private int ban, no;
    private int kor, eng, math;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    public void updateRecord(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", no=" + no +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return this.getTotal() / (double) 3;
    }
}
