package chapter_20_collection_list.generic;

/*
 * ===========================================================
 * Class Name      : Generic03
 * Author          : adam9e96
 * Created Date    : 2024-01-25
 * Updated Date    : 2024-08-16
 * Version         : 1.0
 * Description     : 제네릭(Generic) 연습 - 3
 * ===========================================================
 * Summary:
 * - 이 클래스는 제네릭을 사용하여 다양한 타입의 데이터를 처리하는 방법을 연습하는 예제이다.
 * - 제네릭을 사용하여 여러 타입에 대해 하나의 클래스를 생성하고, 코드 재사용성을 높일 수 있다.
 * - 클래스 이름이나 변수 이름에 제네릭 약자를 사용하는 규칙에 대해 간단히 설명한다.
 *
 *  Usage:
 * - 제네릭을 사용하는 방법을 이해하고자 하는 개발자를 위한 예제이다.
 * - 다양한 타입을 사용하는 클래스를 작성하고, 제네릭을 통해 동일한 클래스로 여러 타입을 처리할 수 있는 방법을 보여준다.
 *
 * Notes:
 * - E: Element의 약자. 컬렉션 프레임워크에서 각 객체를 지칭하는 의미로 사용된다.
 * - K: Key의 약자. 키-값 쌍에서 키의 의미로 사용된다.
 * - V: Value의 약자. 키-값 쌍에서 값의 의미로 사용된다.
 * - T: Type의 약자. 일반적인 자료형이나 클래스의 의미로 사용된다. (제네릭2 클래스에서 사용한거)
 * - N: Number의 약자. 숫자 계열을 의미하며, 여러 개의 숫자 타입을 사용 시 N1, N2 등으로 표기할 수 있다.
 */

/**
 * IntString 클래스는 Integer와 String 타입의 키-값 쌍을 처리하는 예제 클래스.
 */
class IntString {
    private Integer key;
    private String value;

    public IntString(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("key: " + key + ", value: " + value);
    }
}

/**
 * StringDouble 클래스는 String과 Double 타입의 키-값 쌍을 처리하는 예제 클래스.
 */
class StringDouble {
    private String key;
    private Double value;

    public StringDouble(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("key: " + key + ", value: " + value);
    }
}

/**
 * PairClass<K, V> 클래스는 제네릭을 사용하여 키-값 쌍을 처리하는 범용 클래스.
 *
 * @param <K> 키의 타입을 나타냄
 * @param <V> 값의 타입을 나타냄
 */
class PairClass<K, V> {
    private K key;
    private V value;

    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("key: " + key + ", value: " + value);
    }
}

public class Generic03 {
    public static void main(String[] args) {

        // 제네릭을 사용
        PairClass<Integer, String> pairClass1 = new PairClass<>(1, "홍길동");
        PairClass<String, Double> pairClass2 = new PairClass<>("pi", 3.141592);

        pairClass1.display(); // 출력: key: 1, value: 홍길동
        pairClass2.display(); // 출력: key: pi, value: 3.141592

        IntString intString = new IntString(1, "아담");
        intString.display();

        StringDouble stringDouble = new StringDouble("pi", 3.141592);
        stringDouble.display();

        /*
         * 제네릭을 사용하지 않은 IntString 과 StringDouble 클래스 차이점
         * 1. 타입 고정 : 각 클래스는 특정 타입의 키와 값을 처리하는데 특화되어 있다. 정해놓은 타입만 처리할 수 있다.
         * 2. 재사용성 낮음 : 새로운 타입의 키-값을 처리하기 위해서는 새로운 클래스를 만들어야 한다. Double 과 String 타입을
         *    처리할려면 DoubleString 클래스를 만들어야 한다.
         * 3. 유연성 부족 : 동일한 구조를 갖는 여러 클래스가 생겨날 수 있지만, 각 클래스가 특정 타입에 고정되어 있어 유연성이 떨어진다.
         *
         * 제네릭 사용시
         * 1.타입 매개변수: PairClass는 K와 V라는 타입 매개변수를 사용하여, 인스턴스를 생성할 때 타입을 지정할 수 있습니다.
         *    이로 인해, PairClass는 모든 타입의 키-값 쌍을 처리할 수 있습니다.
         * 2. 재사용성 높음: 동일한 클래스 하나로 다양한 데이터 타입을 처리할 수 있습니다.
         *    Integer-String, String-Double, Double-Boolean 등 여러 타입의 조합을 처리하는 데 하나의 클래스를 사용합니다.
         * 3. 유연성 높음: 제네릭을 사용하면 필요에 따라 다양한 타입을 지원하는 객체를 생성할 수 있으므로,
         *     코드의 유연성과 확장성이 크게 향상됩니다.
         *
         * 차이점 요약:
         * - 유연성: 제네릭을 사용한 PairClass는 타입을 동적으로 지정할 수 있어 유연성이 뛰어나지만,
         *   IntString과 StringDouble은 특정 타입에 고정되어 있어 유연성이 부족합니다.
         * - 재사용성: PairClass는 재사용성이 높고, 다양한 데이터 타입을 처리할 수 있지만,
         *   IntString과 StringDouble은 각각의 타입에 대해 별도의 클래스를 만들어야 하므로 재사용성이 낮습니다.
         * - 코드 중복: 제네릭을 사용하지 않은 클래스들은 동일한 구조의 코드가 반복되지만,
         *   제네릭을 사용하면 이러한 코드 중복을 줄일 수 있습니다.
         */
    }
}
