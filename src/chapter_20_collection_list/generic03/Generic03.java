package chapter_20_collection_list.generic03;

/**
 * ===========================================================
 * fileName       : Generic03
 * date           : 2024-01-25
 * description    : 제네릭 연습 -3
 * ===========================================================
 * // MultipleGenericTypeTest todo 약자와 의미정도만 알아두자
 * // 제네릭 타입 클래스 : 클래스의 객체를 생성할 때 매개변수를 사용해 특정 타입을 전달하여 이를 기반으로
 * // 클래스의 객체가 생성 및 작동하도록 지원하는 것.
 * // 어떤 문자를 사용해도 되나 미리 지정된 타입이 있음. 가급적 타입에 맞게 문자를 사용하는 것이 가독성을 높임.
 * // E : Element의 약자. 컬레션 프레임워크를 사용할 때 각 객체를 지칭하는 의미로 사용.
 * // K : Key의 약자. 키와 값이라는 쌍으로 이루어진 형태에서 '키'의 의미로 사용.
 * // V : Value의 약자. 키와 값이라는 쌍으로 이루어진 형태에서 '값'의 의미로 사용.
 * // T : Type의 약자. 자료형이나 클래스의 의미로 사용.
 * // 제네릭에서는 기본 자료형(boolean, byte, char, int등)을 타입으로 사용할 수 없어서 여기서는 래퍼 Wrapper 클래스를 의미.
 * // N : Number의 약자. 수치 계열의 의미로 사용. 여러 개를 사용할 때 각 타입 매개 변수 뒤에 2, 3, 4등의 숫자를 붙여 사용.
 */
class IntString { // todo 클래스룸에 올려줄테니 집에서 해봐라. 제네릭을 쓸려고 공부하는게 아님. 직접 만드는 쪽은 거의 없음
    private Integer key;    // todo 제네릭을 숙지해두면 좋기야 함.
    private String value;

    public IntString(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("key: " + key + ", value: " + value);
    }
}

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

class PairClass<K, V> { // 제네릭을 사용하지 않으면 위의 두 개의 클래스를 따로 만들어야 하지만, 제네릭을 사용하면 하나만 만들면 됨.
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
        PairClass<Integer, String> pairClass1 = new PairClass<>(1, "홍길동");
        PairClass<String, Double> pairClass2 = new PairClass<>("pi", 3.141592);
        pairClass1.display();   // key: 1 , value:홍길동
        pairClass2.display();   // key: pi, value: 3.141592
    }
}
// todo 제네릭 3,4,5 파일 올라왔다 클래스룸. 집에서 해볼것
//  - 이거 다음이 컬렉션 파트. 컬렉션에 제네릭이 나와서 가볍게 배우는거
/*
    todo 13. 컬렉션 프레임워크 - pdf 봐라
        - 리스트, set 알아야됨.
        add, remove는 추가및 삭제를 했는지 결과값으로 boolean.
        배열은 foreach를 많이 쓴다.
        [배열과 비슷하게 객체를 인덱스로 관리함]<-- 컬렉션
        리스트 중복허용, 순서 있다
        셋은 중복 불허용, 순서 없다
 */