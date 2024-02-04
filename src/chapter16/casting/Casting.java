package chapter16.casting;

public class Casting {
    public static void main(String[] args) {
        Parent p = new Child(); // 업캐스팅 : 자식 객체를 부모 객체로 형변환
        p.print();              // 동적 메소드 호출, 자식의 print() 호출 <-- 오버라이딩된 자식 메소드가 있으면 그거 실행. 호출되는건 부모 메소드임. 헷갈릴 수 있다.
        p.a = 0;

//        p.b = 0;
//        Child c = new Parent(); // 이것은 컴파일 오류. 업캐스팅의 경우는 부모클래스 맴버만 사용가능하다(오버라이딩 경우만 제외)

        Child c = (Child) p; // 다운캐스팅 : 부모 객체를 자식 객체로 형변환 <-- 실제 p(부모 타입)의 객체가 자식 객체(힙영역)를 참조하고 있어서 형변환이 되는거임. 위에 주석 참고
        c.print();          // 메소드 오버라이딩, 자식 객체의 print() 호출된다.
        c.a = 10;
        c.b = 11;
//        System.out.println(p.a);
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
