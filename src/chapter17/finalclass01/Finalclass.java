package chapter17.finalclass01;
/*
final 변수 : 값을 더 이상 변경할 수 없는 상수
final 메소드 : 내용을 더 이상 변경할 수 없는 메서드. 오버라이딩 불가
final 클래스 : 내용을 더 이상 변경할 수 없는 클래스. 상속 불가
 */

public final class Finalclass {
    final int number = 4; // 상수
}
class Parents  // extends Finalclass // 에러 발생
{
    final void finalMethod() { // 오버라이딩 불가한 메서드
        System.out.println("상속 불가한 메서드");
    }
}

class Son extends Parents {
     //void finalMethod() {} // 에러 발생
}
