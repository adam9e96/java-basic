package chapter_18_interface.interface00;

/**
 * {@code RemoteControl} 인터페이스는 다양한 장치들이 공통적으로 가져야 할
 * 전원 제어 기능을 정의하는 인터페이스입니다. 이 인터페이스를 구현하는 클래스는
 * 반드시 {@code turnOn()} 메서드를 구현해야 합니다.
 *
 * <p> 주요 특징:
 * <ul>
 *   <li>인터페이스 선언: {@code interface} 키워드를 통해 선언됩니다.</li>
 *   <li>추상 메서드: 모든 인터페이스 메서드는 추상적이며, 구현 클래스에서
 *       반드시 구현해야 합니다.</li>
 *   <li>다중 상속: 자바 클래스는 여러 인터페이스를 구현할 수 있습니다.</li>
 * </ul>
 *
 * <p> 예시:
 * <pre>
 * public class Television implements RemoteControl {
 *     {@literal @}Override
 *     public void turnOn() {
 *         System.out.println("TV를 켭니다.");
 *     }
 * }
 * </pre>
 *
 * @since 2024.07.30
 */
public interface RemoteControl {

    /**
     * 장치를 켜는 기능을 제공합니다. 이 메서드는 {@code RemoteControl}을 구현하는
     * 모든 클래스에서 필수적으로 구현해야 합니다.
     */
    public void turnOn();
}

/**
 * {@code Television} 클래스는 {@code RemoteControl} 인터페이스를 구현하며,
 * 텔레비전 장치의 전원을 켜는 구체적인 기능을 제공합니다.
 */
class Television implements RemoteControl {

    /**
     * {@code turnOn()} 메서드를 구현하여, TV가 켜졌을 때의 동작을 정의합니다.
     * TV가 켜졌음을 알리는 메시지를 출력합니다.
     */
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
