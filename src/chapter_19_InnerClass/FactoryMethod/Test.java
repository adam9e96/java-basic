package chapter_19_InnerClass.FactoryMethod;

// todo 팩토리 메소드연습1

/*
 * ===========================================================
 * fileName       : Test.java
 * date           : 2024-01-24
 * description    : 팩토리 메소드 패턴 연습1 :
 * #Factory_패턴은_객체_생성과_관련된_디자인_패턴
 * 팩토리 메소드는 부모 클래스에서 객체를 생성할 수 있는 인터페이스를 제공하지만,
 * 자식 클래스들이 생성될 객체들의 유형을 변경할 있도록 하는 생성 패턴.
 * ===========================================================
 */
interface Sugar {
    static Sugar getInstance() {
        return new WhiteSugar(); // 자식 클래스 객체 생성
    }
}

class WhiteSugar implements Sugar { // `Sugar` 인터페이스를 구현하는 `WhiteSugar` 클래스 정의

}

class Coffee {
    // 강력한 결합. WhiteSugar 클래스를 수정하게 되면 Coffee 클래스의 코드로 수정.
    WhiteSugar whiteSugar = new WhiteSugar();

    // 느슨한 결합. WhiteSugar 클래스를 수정하더라도 Coffee 클래스의 코드를 수정할 필요가 없음
    Sugar sugar = Sugar.getInstance();
}

public class Test {
}

/*
트렌드가 new 로 객체 생성하기 보다는 `static` 클래스명 getInstance 메소드를 불러오는 방식을 선호함
유지보수가 쉽기 때문
 */