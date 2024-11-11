package chapter_18_interface.interface02;
/**
 * <h1>MyInterfaceDemo</h1>
 * <p>
 * 이 클래스는 {@link MyInterface}와 {@link InterfaceImplementation}를 사용하여 인터페이스의 상수와 메서드의 동작을 확인한다.
 * 인터페이스 상수는 묵시적으로 <code>public static final</code>이며,
 * 메서드는 <code>public abstract</code>가 묵시적으로 붙는 것을 알 수 있다.
 * </p>
 *
 * <p>
 * 인터페이스의 상수를 직접 사용하고, 인터페이스를 구현한 클래스의 인스턴스를 생성하여
 * 메서드를 호출하는 예제를 포함하는 데모클래스
 * </p>
 *
 */
public class MyInterfaceDemo {

    /**
     * <p>
     * 인터페이스의 상수는 직접 접근이 가능하며, 인터페이스를 구현한 클래스의 인스턴스를 통해
     * 추상 메서드를 호출할 수 있습니다.
     * </p>
     */
    public static void main(String[] args) {
        // 인터페이스는 단독으로 객체 생성이 불가능합니다.
//         MyInterface mi = new MyInterface(); // 오류 발생

        // 인터페이스의 상수 필드는 변경할 수 없습니다.
//         MyInterface.w = 50; // 오류 발생: 상수 값은 변경 불가

        // 인터페이스의 상수 필드는 정적 변수이므로 직접 접근이 가능합니다.
        System.out.println("w = " + MyInterface.w);
        System.out.println("x = " + MyInterface.x);
        System.out.println("y = " + MyInterface.y);
        System.out.println("z = " + MyInterface.z);

        // 인터페이스를 구현한 클래스의 상수 필드에 접근 (인터페이스의 상수를 상속받음)
        int w = InterfaceImplementation.w;
        System.out.println("w (from Interface2) = " + w);

        // 인터페이스의 추상 메서드는 구현 클래스의 인스턴스를 통해 호출해야 합니다.
        InterfaceImplementation interface2 = new InterfaceImplementation(); // 인터페이스를 구현한 클래스의 인스턴스 생성
        interface2.aba();   // 추상 메서드를 구현한 메서드 호출

        // 인터페이스 타입의 참조 변수를 통해서도 메서드를 호출할 수 있습니다.
        MyInterface myInterface = new InterfaceImplementation();
        myInterface.aba();

        // 인터페이스의 상수 필드는 구현 클래스의 인스턴스를 통해서는 접근할 수 없습니다.
//         interface2.x; // 오류 발생: 인터페이스의 정적 필드는 클래스 인스턴스로 접근 불가
    }
}
