package chapter17;

/**
 * ===========================================================
 * fileName       : FinalClass_01
 * date           : 2024-02-13
 * description    :
 * final 변수 : 값을 더 이상 변경할 수 없는 상수
 * final 메소드 : 내용을 더 이상 변경할 수 없는 메서드. 오버라이딩 불가
 * final 클래스 : 내용을 더 이상 변경할 수 없는 클래스. 상속 불가
 * ===========================================================
 */

final class Finalclass {    // final 키워드를 사용하여 내용을 변경할 수 없는 final 클래스를 정의
    final int number = 4; // 상수 // final 변수 생성 및 초기화
}
class Parents  // extends Finalclass // 에러 발생 // final 클래스는 상속 불가능
{
    final void finalMethod() { // 오버라이딩 불가한 메서드 // final 메소드
        System.out.println("상속 불가한 메서드");
    }
}

class Son extends Parents {
    //void finalMethod() {} // 에러 발생 // final 메소드는 상속이 불가능함
}
public class FinalClass_01 {
    public static void main(String[] args) {
        Finalclass member1 = new Finalclass();
        System.out.println(member1.number);
//        member1.number=9; // 상수는 변경불가
    }
}