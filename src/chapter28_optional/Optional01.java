package chapter28_optional;

import java.util.Optional;

/**
 * <p>
 * Optional01 클래스는 Java의 Optional 클래스 사용 예제1
 * Optional 객체를 생성하고, 값의 존재 여부를 확인하며,
 * 값을 안전하게 처리하는 다양한 방법을 시연합니다.
 * </p>
 *
 * <p>
 * Optional 클래스는 NullPointerException을 방지하고,
 * 값의 존재 여부를 명확하게 표현하기 위해 사용됩니다.
 * </p>
 *
 * @author adam9e96
 * @version 1.0
 * @since 2024-12-02
 */
public class Optional01 {
    public static void main(String[] args) {

        /**
         * 비어 있는 Optional 객체를 생성합니다.
         * 이 Optional에는 값이 없기 때문에 isPresent() 메소드는 false를 반환합니다.
         */
        Optional<String> empty = Optional.empty();
        System.out.println("empty.isPresent(): " + empty.isPresent()); // 값이 있으면 true 반환하고, 그렇지 않으면 false 반환합니다

        /**
         * 값이 "hello"인 Optional 객체를 생성합니다.
         * 이 Optional에는 값이 있으므로 isPresent() 메소드는 true를 반환합니다.
         */
        Optional<String> optional = Optional.of("hello");
        System.out.println("optional.isPresent(): " + optional.isPresent());

        /**
         * null을 사용하여 Optional 객체를 생성합니다.
         * 이 경우 Optional은 비어 있으므로 isPresent() 메소드는 false를 반환합니다.
         */
        Optional<String> nullableOpt = Optional.ofNullable(null);

        /**
         * 값이 "World"인 Optional 객체를 생성합니다.
         * 이 Optional에는 값이 있으므로 isPresent() 메소드는 true를 반환합니다.
         */
        Optional<String> nonNullOpt = Optional.ofNullable("World");

        System.out.println("nullableOpt.isPresent(): " + nullableOpt.isPresent());
        System.out.println("nonNullOpt.isPresent(): " + nonNullOpt.isPresent());

        /**
         * nullableOpt에 값이 있을 경우 해당 값을 출력합니다.
         * 현재 nullableOpt는 비어 있으므로 아무 것도 출력되지 않습니다.
         */
        nullableOpt.ifPresent(value -> System.out.println("Value: " + value));

        /**
         * nonNullOpt에 값이 있을 경우 해당 값을 출력합니다.
         * 현재 nonNullOpt는 "World"를 포함하고 있으므로 "Value: World"가 출력됩니다.
         */
        nonNullOpt.ifPresent(value -> System.out.println("Value: " + value));
    }
}
