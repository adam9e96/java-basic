package chapter12;
/*
    클래스 메서드는 객체를 생성하지 않아도 호출이 가능. -> 객체를 선언안해도 사용가능함.
    인스턴스 메서드는 객체를 생성해야만 호출이 가능.
    왜냐하면 인스턴스 메서드는 객체가 생성되어야 메모리상(힙 영역)에 실제로 존재하고
    클래스 메서드는 클래스가 메모리에 올라갈 때 생성(데이터 영역)되기 때문.
    static 이 붙은 메서드 : 클래스 메서드
    static 이 붙은 변수 : 클래스 변수
    static 이 붙으면 글꼴이 기울여지는 특징도 있다.
     */

public class AreaTest {
    public static void main(String[] args) {
        Area.manual(); // 클래스 메서드 접근 가능
//        Area.triangle(3, 5); // 에러 발생
//        Area.rectangle(3, 5); // 에러 발생

        Area cal = new Area();
        cal.manual(); // 가급적 클래스 단위로 호출하는 것이 좋음
        System.out.println(cal.triangle(3, 5));
        System.out.println(cal.rectangle(3, 4));
    }

}
