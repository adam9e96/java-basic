package chapter28_optional;

import java.util.Optional;

class opt {
    final String name;
    final Integer age;

    opt(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

public class Optional03 {
    public static void main(String[] args) {

        Optional<opt> optional = Optional.of(new opt("John", 23));
        System.out.println(optional.isPresent());

        String nullValue = null;

//        Optional<String> optional1= Optional.of(nullValue);
        Optional<String> optionalWithNullableValue = Optional.ofNullable(nullValue);
//        System.out.println(optionalWithNullableValue.isPresent());

        Optional<String> optionalWithValue = Optional.of("John");
//        if (optionalWithValue.isPresent()) {
//            System.out.println("value exists!");
//        }
        if (optionalWithValue.isEmpty()) {
            System.out.println("No value present!");
        }
        String value = optionalWithValue.get();
        System.out.println(value);
        String GenValue = "곰방와곰디";

        optionalWithValue.ifPresent(d -> System.out.println(d));

        String valueOrDefault = optionalWithNullableValue.orElse("Default value");
        System.out.println(valueOrDefault);

        String valueOrSupplier = optionalWithNullableValue.orElseGet(() -> GenValue);
        System.out.println(valueOrSupplier);

        System.out.println("=====");

        String valueOrException = optionalWithNullableValue.orElseThrow();
//        String valueOrCustomException = optionalWithNullableValue.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        System.out.println(valueOrException);
//        System.out.println(valueOrCustomException);

    }
}
