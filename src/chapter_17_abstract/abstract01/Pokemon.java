package chapter_17_abstract.abstract01;

/**
 * ===========================================================
 * fileName       : Pokemon.java
 * date           : 2024-01-22
 * description    : 추상 메서드 연습-1
 * - 추상 메서드
 * 선언부만 정의하고 구체적인 내용은 비워놓은 메서드.
 * 구체적인 내용을 적지 않았기 때문에 이를 상속받은 하위 클래스에서는 사용하려면 반드시 구현해한다.
 * 추상 메서드를 선언하는 방법은 '추상적인' 이라는 뜻의 제어자, `abstract`를 메서드명 앞에 붙여 줌.
 *
 * - 추상 클래스
 * 추상 메서드를 멤버로 가지는 클래스
 * 추상 클래스는 일반적인 메서드도 가질 수 있지만 추상 메서드를 하나라도 포함하는 클래스
 *
 * 추상 메서드가 하나라도 있다면 추상클래스로 만들어야 한다.
 * ===========================================================
 */

/*
포켓몬을 나타내는 추상 클래스인 Pokemon과 그 추상 클래스를 상속받는 두 개의 구체적인 포켓몬 클래스인 Pikachu와 Squirtle을 정의한다.
추상클래스에는 공격을 나타내는 attack 추상 메소드와, 소리를 내는 sound 추상 메서드가 포함되어있어야한다.
이를 구현하여 피카추와 꼬부기가 공격과 소리를 낼 수 있도록 구현하여라.
 */
abstract public class Pokemon { // 포켓몬 추상 클래스
    protected String name;  //

    // 추상 메서드는 상속 받는 녀석에게 강제성을 부여하는것이 크다.
    abstract void attack(); // 공격 추상 메서드

    abstract void sound(); // 소리 추상 메서드

    public String getName() {
        return this.name;
    }
}

class Pikachu extends Pokemon { // 피카추 클래스 //상속 받을 클래스임.
    Pikachu() { // 생성자를 통해 name 필드  초기화
//        this.name = "피카추";
        super.name = "피카추";
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

class Squirtle extends Pokemon { // 꼬부기 클래스
    Squirtle() { // 이름을 지정하는 생성자
//        this.name = "꼬부기";
        super.name = "꼬부기";
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