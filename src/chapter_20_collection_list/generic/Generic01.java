package chapter_20_collection_list.generic;

/*
 * Class Name      : Generic01
 * Author          : adam9e96
 * Created Date    : 2024-01-25
 * Updated Date    : 2024-08-16
 * Version         : 1.0
 * Description     : 제네릭(Generic) 사용법을 연습하는 예제 클래스
 * Summary:
 * - 제네릭(Generic)을 사용하지 않고 Object 타입을 사용하는 경우 발생하는 문제점과
 *   제네릭을 사용했을 때의 장점을 비교하기 위해 작성된 코드.
 * Usage:
 * - 이 클래스는 주어진 코드에서 제네릭을 적용하는 방법을 배우고자 하는 개발자를 위한 예제
 * - main 메서드를 실행하여, Object 타입과 제네릭 타입 사용의 차이점을 확인할 수 있다.
 * Dependencies:
 * - 이 클래스는 추가적인 외부 라이브러리에 의존하지 않습니다.
 * Known Issues:
 * - 현재 제네릭 사용 예시가 포함되어 있지 않으므로, Generic02에 포함될 예정입니다.
 * Notes:
 * - 제네릭(Generic)은 C++의 템플릿(template)에서 발전한 개념입니다.
 *   C++과 달리, 자바에서는 모든 데이터 타입을 처리하기 위해 `Object`를 사용할 수 있지만,
 *   형 변환이 필요해서 좀 귀찮을 수 있습니다. 그래서 제네릭을 더 많이 사용하게 됩니다.
 * - 제네릭은 정해지지 않은 타입을 파라미터로 받고,
 *   실제 사용할 때 그 파라미터를 구체적인 타입으로 대체하는 기능을 제공합니다.
 */

/**
 * ObjectData 클래스는 모든 데이터 타입을 저장할 수 있는 Object 타입을 사용하는 클래스
 */
class ObjectData {
    private Object data = null; // 데이터 타입으로 Object를 지정하여 모든 데이터 타입을 저장 가능

    /**
     * 데이터를 반환하는 메서드
     *
     * @return 현재 저장된 데이터
     */
    public Object getData() {
        return data;
    }

    /**
     * 데이터를 설정하는 메서드
     *
     * @param data 설정할 데이터
     */
    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic01 {
    public static void main(String[] args) {
        // 문자열 데이터를 저장할 ObjectData 객체
        ObjectData stringCommonData = new ObjectData();
        // 정수 데이터를 저장할 ObjectData 객체
        ObjectData integerCommonData = new ObjectData();

        // 문자열 데이터 설정
        stringCommonData.setData("abc");
        // 정수 데이터 설정
        integerCommonData.setData(100);

        // 저장된 데이터를 출력
        System.out.println("stringCommonData : " + stringCommonData.getData()); // 출력: stringCommonData : abc
        System.out.println("integerCommonData : " + integerCommonData.getData()); // 출력: integerCommonData : 100

        // 데이터 타입이 Object라서 String으로 직접 받을 수 없음
        // String tmp = stringCommonData.getData(); // 컴파일 오류 발생
        String tmp2 = (String) stringCommonData.getData(); // 형 변환을 통해 문자열 데이터로 가져옴

        /*
         * Object 타입을 사용하면 형 변환을 해야 해서 불편할 수 있습니다.
         * 또한, 속도도 느려질 수 있어서 자바에서는 Object 타입을 잘 사용하지 않습니다.
         *
         * 이런 문제를 해결하기 위해 자바에서는 제네릭(Generic)을 사용합니다.
         * 제네릭을 사용하면 형 변환 없이도 타입 안정성을 확보할 수 있으며,
         * 더 안전하고 유연한 코드를 작성할 수 있습니다.
         */
    }
}
