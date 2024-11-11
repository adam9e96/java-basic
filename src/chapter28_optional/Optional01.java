package chapter28_optional;

import java.util.Optional;

public class Optional01 {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty(); // 비어 있는 Optional 객체를 생성
        System.out.println(empty.isPresent()); // 값이 있으면 true 반환하고, 그렇지 않으면 false 반환합니다
//        System.out.println(empty.get()); // NoSuchElementException 예외 발생
        Optional<String> optional = Optional.of("hello");
        System.out.println(optional.isPresent());

        Optional<String> nullableOpt = Optional.ofNullable(null); // empty Optional
        Optional<String> nonNullOpt = Optional.ofNullable("World");
        System.out.println(nullableOpt.isPresent());
        System.out.println(nonNullOpt.isPresent());

        nullableOpt.ifPresent(value -> System.out.println("Value: " + value));

    }
}
