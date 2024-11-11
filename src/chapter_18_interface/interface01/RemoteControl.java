package chapter_18_interface.interface01;

/**
 * {@code RemoteControl} 인터페이스는 스마트 홈의 가전 제품들을 원격으로 제어하기 위한 기본적인 기능을 정의한다.
 * 이 인터페이스는 가전 제품을 켜고 끄는 기능을 포함하며, 추가 기능을 제공하기 위해 상속될 수 있다.
 *
 * <p> 주요 특징:
 * <ul>
 *   <li>상수 필드: 상수 필드는 기본적으로 {@code public}, {@code static}, {@code final}로 선언됩니다.</li>
 *   <li>추상 메서드: 인터페이스 내의 모든 메서드는 묵시적으로 {@code public abstract}로 선언되므로,
 *       이를 명시적으로 적을 필요는 없습니다.</li>
 *   <li>확장성: 새로운 기능을 추가하려면 기존 인터페이스를 변경하지 않고도 서브 인터페이스로 확장할 수 있습니다.</li>
 * </ul>
 *
 * <p> 사용 예시:
 * <pre>
 * public class Television implements RemoteControl, AdvancedRemoteControl {
 *     {@literal @}Override
 *     public void turnOn() {
 *         System.out.println("TV가 켜졌습니다.");
 *     }
 *
 *     {@literal @}Override
 *     public void turnOff() {
 *         System.out.println("TV가 꺼졌습니다.");
 *     }
 * }
 * </pre>
 * <p>
 * 만약에 인터페이스에 추가로 기능을 넣고자 한다면 에러가 발생할 것이다. (인터페이스의 추상 메서드를 재정의한
 * 클래스에서 아직 추가된 추상 메서드를 오버라이딩을 못해서)
 * 그러면 추가를 하더라도 문제없이 할 수있는 방법은 없는건가?
 * -> 인터페이스를 상속 받으면 된다.
 */
public interface RemoteControl {
    // 상수 필드
//    int MAX_VOLUME = 10;
//    int MIN_VOLUME = 0;

    /**
     * 추상 메서드 정의
     * <br>
     * 기능 : 가전 제품을 켠다.
     * <br>
     * 이 메서드는 {@code RemoteControl}  을 구성하는 모든 클래스에서 반드시 구현해야 한다.
     */
    public abstract void turnOn();

    /**
     * 추상 메서드 정의2
     * <br>
     * 기능 : 가전 제품을 끈다.
     * <br>
     * 이 메서드는 {@code RemoteControl} 을 구성하는 모든 클래스에서 반드시 구현해야 한다.
     */
    public void turnOff();

    /*
     * 자바의 인터페이스는 모두 `public abstract` 가 자동으로(묵시적)으로 적용되기 때문에 굳이 적을 필요는 없다.
     */

//    public void volumUp(); // 추후에 필요해서 기능 추가함

//    public void volumDown(); // 추후에 필요해서 기능 추가함 <-- 문제발생

    //  나중에 추가된 기능(추상메서드) 때문에 구현 받은 클래스에서 문제가 발생한다..

//    void setVolume(int volume);

}
/*
 * 메서드들은 모두 이름과 매개변수만 존재하고, 몸체가 없으며 세미콜론으로 종료되는 점에 유의
 * 인터페이스 안에서 선언되는 메서드들은 모두 묵시적으로 `public abstract` 가 포함됨.
 *
 * 따라서 `public` 나 `abstract` 수식어는 없어도 됨.

 * 만약 다른 개발자들이 사용하고 있던 인터페이스를 변경시키면 해당 인터페이스로 구현된
 * 모든 클래스가 동작되지 않음.
 * 이런 경우 대비해서 인터페이스도 상속을 받아서 확장시킬 수 있도록 되어있음.
 * 인터페이스도 `extends` 를 이용하여 다른 인터페이스를 상속 받을 수 있음.
 */

/**
 * {@code AdvancedRemoteControl} 인터페이스는 {@code RemoteControl} 인터페이스를 상속받고,
 * 추가적인 볼륨 제어 기능을 제공한다.<br>
 * 이를 통해 가전 제품의 볼륨을 높이거나 낮출 수 있다.<br>
 * <p>
 * 기존 인터페이스에 새로운 기능을 추가하면서도, 기존 구현 클래스에 영향을 주지 않도록 설계 되었다.
 * </p>
 */
interface AdvancedRemoteControl extends RemoteControl { // RemoteControl 인터페이스에 상속을 받음

    /**
     * 가전 제품의 볼륨을 높인다.
     * <br>
     * 이 메서드는 {@code AdvancedRemoteControl}을 구현하는 모든 클래스에서 반드시 구현해야 한다.
     */
    void volumeUp(); // 가전 제품의 불륨을 높인다.

    /**
     * 가전 제품의 볼륨을 낮춘다.
     * <br>
     * 이 메서드는 {@code AdvancedRemoteControl}을 구현하는 모든 클래스에서 반드시 구현해야 한다.
     */
    void volumeDown(); // 가전 제품의 불륨을 낮춘다.
}
/*
 * 새로 추가될 메서드를 서브 인터페이스에 구현하면 RemoteControl 인터페이스를 구현하던 에러는 사라짐.
 * 이 경우 인터페이스의 사용자들은 예전의 인터페이스를 계속 사용할 것 인지 아니면
 * 새 버전으로 업그레이드 할 것 인지 선택할 수 있음.
 */

/*
 * 인터페이스는 다른 클래스에 의하여 구현(implement) 될 수 있음
 * 인터페이스를 구현한다는 말은 인터페이스에 정의된 추상 메서드의 몸체를 정의한다는 의미.
 * 클래스가 인터페이스를 구현하기 위해서는 `implement` 키워드를 사용.
 * 예를 들어 Television 클래스가 RemoteControl, AdvancedRemoteControl 인터페이스를 구현하기 위한 문법은 아래와 같음.
 *
 */
// 추상클래스의 주 목적은 협업할 때 필요한 기능을 무조건 구현하도록 하는 것임.

/*
 * AdvancedRemoteControl 인터페이스가 RemoteControl 인터페이스를 상속받고 있기 때문에 Television 클래스에서는
 * AdvancedRemoteControl 만 구현해도된다.
 * 이렇게 하면 RemoteControl 의  추상 메서드들도 AdvancedRemoteControl 을 통해 자동으로 포함되기 때문에,
 * Television 클래스는 두 인터페이스의 모든 추상 메서드를 구현하게 된다.
 */
//class Television implements RemoteControl, AdvancedRemoteControl { // 이렇게도 가능함
class Television implements AdvancedRemoteControl {
    private boolean on;
    private int volume = 0;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }


    @Override
    public void volumeUp() {
        System.out.println("볼륨 키우기");
        volume++;

    }

    @Override
    public void volumeDown() {
        System.out.println("볼륨 낮추기");
        volume--;
    }

}
