package chapter19_InnerClass.FactoryMethod;

/**
 * Factory Method 패턴 연습 예제:
 * <p>
 * 팩토리 메소드는 객체 생성과 관련된 디자인 패턴 중 하나로,
 * 부모 클래스에서 객체를 생성할 수 있는 인터페이스를 제공하지만,
 * 자식 클래스들이 생성될 객체들의 유형을 변경할 수 있도록 하는 생성 패턴입니다.
 * 이 패턴을 사용하면 객체 생성 로직을 캡슐화하여 코드의 유연성과 확장성을 높일 수 있습니다.
 */
interface Sugar {

    /**
     * Sugar 객체의 인스턴스를 반환하는 팩토리 메소드.
     * <p>
     * 이 메소드는 Sugar 인터페이스를 구현하는 WhiteSugar 클래스의 인스턴스를 생성하여 반환합니다.
     * 팩토리 메소드 패턴을 통해 객체 생성 로직을 캡슐화하여 코드의 유지보수를 용이하게 합니다.
     *
     * @return Sugar 인터페이스를 구현한 WhiteSugar 객체의 인스턴스
     */
    static Sugar getInstance() {
        return new WhiteSugar(); // 자식 클래스 객체 생성
    }
}

/**
 * Sugar 인터페이스를 구현하는 WhiteSugar 클래스.
 * <p>
 * 이 클래스는 Sugar 인터페이스의 구체적인 구현체로, WhiteSugar 객체를 생성합니다.
 */
class WhiteSugar implements Sugar {
    // WhiteSugar 클래스는 Sugar 인터페이스를 구현하는 구체적인 클래스입니다.
}

/**
 * Coffee 클래스는 Sugar 객체를 이용하여 커피에 설탕을 추가하는 기능을 제공합니다.
 * <p>
 * 이 클래스는 WhiteSugar에 강하게 결합된 방법과 느슨하게 결합된 방법을 모두 보여줍니다.
 */
class Coffee {

    // 강하게 결합된 방식: WhiteSugar 클래스에 직접 의존하는 경우
    WhiteSugar whiteSugar = new WhiteSugar();

    // 느슨하게 결합된 방식: Sugar 인터페이스를 사용하여 의존성을 줄이는 경우
    Sugar sugar = Sugar.getInstance();
}

/**
 * Test 클래스는 팩토리 메소드 패턴을 활용한 Sugar 객체 생성을 테스트합니다.
 */
public class Test {
    // 이 클래스는 Coffee 객체를 생성하고, Coffee 객체가 어떻게 Sugar 객체를 사용하는지 보여줍니다.
}
