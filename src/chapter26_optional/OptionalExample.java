package chapter26_optional;

import java.util.Optional;

// Optional: NullPointerException을 방지하기 위해 도입된 클래스. 값이 있거나 없을 수 있는 컨테이너 객체.
// isPresent(): Optional 객체에 값이 포함되어 있는지 여부를 확인하는 메서드. 값이 있으면 true, 없으면 false 반환.
// 사용 예: 데이터베이스 조회 결과가 존재하는지 확인하는 데 사용.
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalWithValue = Optional.of("Hello, World!");
        Optional<String> emptyOptional = Optional.empty();

        // isPresent()를 사용하여 값의 존재 여부를 확인
        if (optionalWithValue.isPresent()) {
            System.out.println("Optional contains: " + optionalWithValue.get());
        } else {
            System.out.println("Optional is empty");
        }

        if (emptyOptional.isPresent()) {
            System.out.println("Optional contains: " + emptyOptional.get());
        } else {
            System.out.println("Optional is empty");
        }
    }
}
