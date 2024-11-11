package chapter28_optional;

import java.util.Optional;

public class Optional04 {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("John");

        Optional<String> upperCaseValue = optionalWithValue.map(String::toUpperCase);
        System.out.println(upperCaseValue);

        Optional<Integer> stringLength = optionalWithValue.flatMap(s -> Optional.of(s.length()));
        System.out.println(stringLength);

        Optional<String> filteredValue = optionalWithValue.filter(val -> val.startsWith("H"));
        System.out.println(filteredValue);

    }
}

