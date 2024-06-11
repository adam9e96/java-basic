package chapter26_designPattern.adapter01;

/**
 * 옵저버 패턴
 */
// 타겟 인터페이스 정의
interface Target {
    public void request();
}

// 기존 클래스 (Adaptee)
class Adaptee {
    public void specificRequest() {
        System.out.println("기존 클래스의 메서드 호출");
    }
}

// 어댑터 클래스
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 기존 클래스의 메서드를 호출하여 타겟 인터페이스 요청 처리
        adaptee.specificRequest();
    }
}

// 클라이언트 코드
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request(); // 기존 클래스의 메서드 호출

    }
}
/*
 Target 인터페이스는 클라이언트가 사용할 인터페이스입니다.
 Adaptee 클래스는 기존에 있던 클래스로, 클라이언트가 요구하는 인터페이스와 다른 메서드 specificRequest()를 가지고 있습니다.

Adapter 클래스는 Target 인터페이스를 구현하고 Adaptee 객체를 포함합니다.
request() 메서드에서는 Adaptee 객체의 specificRequest() 메서드를 호출하여 클라이언트가 요청한 작업을 처리합니다.

클라이언트 코드에서는 Adaptee 객체와 Adapter 객체를 생성한 후, Target 인터페이스 타입의 참조 변수에 Adapter 객체를 할당합니다.
그리고 request() 메서드를 호출하면 어댑터를 통해 기존 클래스의 메서드가 호출됩니다.

이렇게 어댑터 패턴을 사용하면 기존 코드를 수정하지 않고 새로운 인터페이스를 사용할 수 있습니다. 또한, 기존 코드와 새로운 코드 간의 호환성 문제를 해결할 수 있습니다.
 */

// Target 인터페이스는 클라이언트(사용자)가 필요로 하는 기능을 정의한 인터페이스입니다. 여기서는 request() 메서드를 포함하고 있습니다.
//Adaptee 클래스는 기존에 있던 표준 클래스로, 클라이언트가 원하는 Target 인터페이스와 다른 specificRequest() 메서드를 가지고 있습니다.
//Adapter 클래스는 Target 인터페이스를 구현하면서 동시에 Adaptee 객체를 포함하고 있습니다.
//클라이언트에서 Target 인터페이스의 request() 메서드를 호출하면, Adapter 클래스의 request() 메서드가 실행됩니다.
//Adapter 클래스의 request() 메서드 내부에서는 포함된 Adaptee 객체의 specificRequest() 메서드를 호출하여 기존 클래스의 기능을 사용합니다.
//
//이렇게 어댑터 패턴을 사용하면 클라이언트 코드에서는 Target 인터페이스만 알고 있으면 되고, 기존 Adaptee 클래스의 구현 내용은 모르더라도 Adapter를 통해 해당 기능을 사용할 수 있습니다. 기존 코드를 수정할 필요 없이 새로운 인터페이스에 맞추어 기능을 제공할 수 있습니다.