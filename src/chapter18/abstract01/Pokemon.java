package chapter18.abstract01;

/**
 * ===========================================================
 * fileName       : Pokemon.java
 * date           : 2024-01-22
 * description    : 추상 메서드 연습-1
 * ===========================================================
 */
/*
추상 메서드는 선언부만 정의하고 구체적인 내용은 비워놓은 메서드.
구체적인 내용을 적지 않았기 때문에 이를 상속받은 하위 클래스에서는 사용하려면 반드시 구현하라는 의미
추상 메서드를 선언하는 방법은 '추상적인' 이라는 뜻의 제어자, `abstract`를 메서드명 앞에 붙여 줌.

추상 클래스는 추상 메서드를 멤버로 가지는 클래스
추상 클래스는 일반적인 메서드도 가질 수 있지만 추상 메서드를 하나라도 포함하는 클래스
 */
abstract public class Pokemon { // 포켓몬 추상 클래스
    protected String name;

    // 추상 메서드는 상속 받는 녀석에게 강제성을 부여하는것이 크다.
    abstract void attack(); // 공격 추상 메서드

    abstract void sound(); // 소리 추상 메서드

    public String getName() {
        return this.name;
    }
}

class Pikachu extends Pokemon { // 피카추 클래스 //상속 받을 클래스임.
    Pikachu() { // 생성자를 통해 name 필드  초기화
        this.name = "피카추";
    }

    @Override
    void attack() { // 구체적으로 구현
        System.out.println("전기 공격");
    }

    @Override
    void sound() {  // 추상 메소드 다 오버라이딩해야됨
        System.out.println("피카피카");
    }
}
class Squirtle extends Pokemon { // 피카주 클래스
    Squirtle() { // 이름을 지정하는 생성자
        this.name = "꼬부기";
    }

    @Override
    void attack() {
        System.out.println("물 공격");
    }

    @Override
    void sound() {
        System.out.println("꼬북 꼬북");
    }
}