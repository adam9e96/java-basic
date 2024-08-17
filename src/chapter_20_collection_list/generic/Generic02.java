package chapter_20_collection_list.generic;

/*
 * Class Name      : Generic02
 * Author          : adam9e96
 * Created Date    : 2024-01-25
 * Updated Date    : 2024-08-16
 * Version         : 1.0
 * Description     : 제네릭(Generic) 사용법을 연습하는 두 번째 예제 클래스
 * Summary:
 * - 이 클래스는 제네릭(Generic)을 사용하여 다양한 타입의 데이터를 안전하고 유연하게 처리하는 방법을 보여준다.
 * - `Generic01` 클래스에서는 `Object` 타입을 사용했지만, 여기서는 제네릭을 사용하여 형 변환의 불편함을 제거하고,
 * 타입 안정성을 높일 수 있다.
 * Usage:
 * - 이 클래스는 제네릭을 적용하여 코드의 유연성과 타입 안전성을 유지하는 방법을 배우고자 하는 개발자를 위한 예제
 * Dependencies:
 * - 이 클래스는 추가적인 외부 라이브러리에 의존하지 않습니다.
 * Known Issues:
 * - 현재 특별한 이슈는 보고되지 않았습니다.
 * Notes:
 * - 제네릭(Generic)은 호출하는 쪽에서 타입을 지정할 수 있도록 해줍니다. 클래스나 메서드의 필드나 매개변수의 자료형을 미리 고정하지 않고,
 * 호출 시에 지정할 수 있어 코드의 재사용성과 안전성이 높아집니다.
 */

/**
 * CommonData<T> 클래스는 제네릭을 사용하여, 다양한 타입의 데이터를 처리할 수 있는 범용적인 클래스
 *
 * @param <T> 타입 파라미터를 의미하며, 호출하는 쪽에서 실제 사용할 타입을 지정합니다.
 */
class CommonData<T> {
    private T data = null; // 데이터 타입으로 T를 지정. Type의 약자이며, T는 어떤 타입이든 될 수 있음.

    /**
     * 데이터를 반환하는 메서드
     *
     * @return 현재 저장된 데이터
     */
    public T getData() {
        return data;
    }

    /**
     * 데이터를 설정하는 메서드
     *
     * @param data 설정할 데이터
     */
    public void setData(T data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        // 호출하는 쪽에서 타입을 지정하여 사용할 수 있다.
        CommonData<String> stringCommonData = new CommonData<>(); // String 타입으로 지정
        CommonData<Integer> integerCommonData = new CommonData<>(); // Integer 타입으로 지정
        // 타입을 지정하면 생성자에서는 타입을 생략할 수 있다.

        // 데이터 설정
        stringCommonData.setData("abc");
        integerCommonData.setData(100);

        // 설정된 데이터 출력
        System.out.println("stringCommonData : " + stringCommonData.getData()); // 출력: stringCommonData : abc
        System.out.println("integerCommonData : " + integerCommonData.getData()); // 출력: integerCommonData : 100

        // 제네릭을 사용하면 별도의 형 변환 없이 데이터를 바로 사용할 수 있다.
        String tmp1 = stringCommonData.getData();
        System.out.println(tmp1); // 출력: abc
    }
}
