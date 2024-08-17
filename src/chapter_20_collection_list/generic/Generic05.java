package chapter_20_collection_list.generic;

/*
 * ===========================================================
 * Class Name      : Generic05
 * Author          : adam9e96
 * Created Date    : 2024-01-26
 * Version         : 1.0
 * Description     : 제네릭(Generic)의 범위 지정 및 제한을 연습하는 예제 클래스
 * ===========================================================
 * Summary:
 * - 이 클래스는 제네릭 타입에 특정 범위를 지정하는 방법을 연습하는 예제이다.
 * - 제네릭 타입을 특정 클래스나 인터페이스의 하위 타입으로 제한할 때 "extends" 키워드를 사용하는 방법을 보여준다.
 *
 * Usage:
 * - 제네릭의 범위를 제한하여 특정 타입만 허용하는 방법을 이해하고자 하는 개발자를 위한 예제이다.
 * - 제네릭 클래스에서 타입 매개변수를 특정 클래스 및 인터페이스로 제한하여, 올바른 타입만 사용하도록 유도할 수 있다.
 *
 * Notes:
 * - "extends" 키워드를 사용하여 제네릭 타입 매개변수를 특정 클래스나 인터페이스의 하위 타입으로 제한할 수 있다.
 * - 클래스는 하나만 상속받을 수 있으며, 인터페이스는 여러 개를 구현할 수 있다. 클래스 없이 인터페이스만 사용할 수도 있다.
 */

/**
 * 여러 클래스와 인터페이스를 정의하여 제네릭의 범위 제한을 연습하는 예제.
 */
interface First {
}

interface Second {
}

class Third {
}

class Fourth implements First {
}

class Fifth implements Second {
}

class Sixth extends Third {
}

class Seventh extends Third implements First, Second {
}

/**
 * MyBox 클래스는 제네릭 타입 T가 Third를 상속받고, First와 Second 인터페이스를 구현하는 타입으로 제한됨.
 *
 * @param <T> Third를 상속받고 First와 Second를 구현하는 타입
 */
class MyBox<T extends Third & First & Second> {
}

/**
 * NumberBox 클래스는 제네릭 타입 T가 Number 클래스의 하위 타입으로 제한됨.
 *
 * @param <T> Number를 상속받는 타입 (예: Integer, Double 등)
 */
class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public boolean compare(T otherNumber) {
        return number.equals(otherNumber);
    }
}

public class Generic05 {
    public static void main(String[] args) {
        // MyBox<Seventh>는 정상적으로 작동, Seventh 클래스는 제약 조건에 맞음.
        MyBox<Seventh> myBox = new MyBox<>();

        // NumberBox는 Number를 상속받는 타입만 허용. Integer는 사용 가능.
        NumberBox<Integer> nBox = new NumberBox<>(100);
        System.out.println("check = " + nBox.compare(1100)); // 출력: check = false

        // String은 Number를 상속받지 않으므로 컴파일 오류 발생.
//         NumberBox<String> nBox2 = new NumberBox<>("홍길동"); // 컴파일 오류 발생
    }
}
