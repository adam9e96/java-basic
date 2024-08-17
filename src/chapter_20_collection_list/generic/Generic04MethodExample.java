package chapter_20_collection_list.generic;

/*
 * ===========================================================
 * Class Name      : Generic04MethodExample
 * Author          : adam9e96
 * Created Date    : 2024-01-26
 * Version         : 1.0
 * Description     : 제네릭(Generic) 메서드 사용법을 연습하는 예제 클래스
 * ===========================================================
 * Summary:
 * - 이 클래스는 제네릭 메서드를 사용하여 다양한 타입의 데이터를 비교하는 방법을 연습하는 예제이다.
 * - 메서드에 제네릭 타입 매개변수를 사용하여, 동일한 메서드로 여러 타입을 유연하게 처리할 수 있는 방법을 보여준다.
 *
 * Usage:
 * - 제네릭 메서드를 사용하는 방법을 이해하고자 하는 개발자를 위한 예제이다.
 * - 다양한 타입을 비교하는 메서드를 작성하고, 제네릭을 통해 여러 타입의 데이터를 처리하는 방법을 보여준다.
 *
 * Notes:
 * - 제네릭 메서드는 메서드 선언 시 타입 매개변수를 정의하여, 반환 타입 앞에 선언한다.
 * - 메서드 호출 시 타입을 명시적으로 지정할 수 있지만, 컴파일러가 매개변수를 통해 타입을 추론할 수 있으므로 생략할 수 있다.
 */

/**
 * GenMethod 클래스는 제네릭 메서드를 사용하여 다양한 타입의 데이터를 비교하는 예제 클래스.
 */
class GenMethod {
    /**
     * 두 쌍의 키-값을 비교하는 제네릭 메서드
     *
     * @param <K>    첫 번째 키의 타입
     * @param <V>    첫 번째 값의 타입
     * @param fKey   첫 번째 키
     * @param fValue 첫 번째 값
     * @param sKey   두 번째 키
     * @param sValue 두 번째 값
     * @return 두 쌍의 키와 값이 모두 동일한 경우 true, 그렇지 않으면 false
     */
    public <K, V> boolean compare(K fKey, V fValue, K sKey, V sValue) {
        return fKey.equals(sKey) && fValue.equals(sValue);
    }
}

public class Generic04MethodExample {
    public static void main(String[] args) {
        GenMethod genMethod = new GenMethod();

        // 메서드를 호출할 때 제네릭 타입을 명시적으로 지정할 수 있음
        boolean check = genMethod.<Integer, String>compare(1, "홍길동", 1, "홍길동");
        System.out.println("check: " + check); // 출력: true

        // 제네릭 타입을 생략할 수도 있음. 컴파일러가 매개변수로부터 타입을 추론함
        boolean check2 = genMethod.compare(1, "홍길동", 1, "홍길동");
        System.out.println("check2: " + check2); // 출력: true

        // 제네릭 타입을 생략할 수도 있음. 컴파일러가 매개변수로부터 타입을 추론함
        boolean check3 = genMethod.compare(1, "홍길동", 2, "홍길동");
        System.out.println("check2: " + check3); // 출력: true

        // 제네릭 타입을 생략할 수도 있음. 컴파일러가 매개변수로부터 타입을 추론함
        boolean check4 = genMethod.compare(1, "홍길동", 1, "홍길동1");
        System.out.println("check2: " + check4); // 출력: true
    }
}
