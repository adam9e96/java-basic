package chapter_18_interface.interface02;

/**
 * <h1>MyInterface</h1>
 * <p>
 * 이 인터페이스는 인터페이스에서 상수를 다루는 방법을 배운다.
 * 모든 필드는 묵시적으로 <code>public static final</code> 이므로, 별도로 명시하지 않아도 된다.
 * </p>
 *
 * <h2>상수 필드</h2>
 * <ul>
 *     <li>{@code int w = 10;} - <code>public static final</code> 생략</li>
 *     <li>{@code static int x = 20;} - <code>public</code>과 <code>final</code> 생략</li>
 *     <li>{@code final int y = 30;} - <code>public</code>과 <code>static</code> 생략</li>
 *     <li>{@code public static final int z = 40;} - 모든 수식어 명시</li>
 * </ul>
 *
 * <h2>추상 메서드</h2>
 * <ul>
 *     <li>{@code void aba();} - 구현 클래스에서 반드시 구현해야 하는 메서드</li>
 * </ul>

 */
public interface MyInterface {

    // 모든 필드는 묵시적으로 public static final 이 붙습니다.
    int w = 10;             // public static final 생략
    static int x = 20;      // public, final 생략
    final int y = 30;       // public, static 생략
    public static final int z = 40; // 모든 수식어 명시

    /**
     * 구현 클래스에서 반드시 구현해야 하는 추상 메서드
     */
    void aba();
}

/**
 * <h1>InterfaceImplementation</h1>
 * <p>
 * {@link MyInterface} 인터페이스를 구현한 클래스
 * <br>
 * 인터페이스의 추상 메서드인 {@code aba()}를 구현하여 기능을 제공한다.
 * </p>
 *
 * <h2>사용 예시</h2>
 * <pre>
 * Interface2 obj = new Interface2();
 * obj.aba(); // 출력: "MyInterface 구현 받은 클래스"
 * </pre>
 *
 */
class InterfaceImplementation implements MyInterface {

    /**
     * {@inheritDoc}
     * <p>
     * 이 메서드는 인터페이스의 추상 메서드를 구현한 것으로, 간단한 메시지를 출력한다.
     * </p>
     */
    @Override
    public void aba() {
        System.out.println("MyInterface 구현 받은 클래스");
    }
}
