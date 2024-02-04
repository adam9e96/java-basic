package chapter21.generic01;

/**
 * ===========================================================
 * fileName       : Generic01
 * date           : 2024-01-25
 * description    : 제네릭 연습1
 * ===========================================================
 */
/*
    제네릭은 C++의 템플릿이 발전한 형태.
    C++과는 달리 제네릭 대신 `Object`를 사용하면 모든 데이터 타입을 사용할 수 있지만,
    경우에따라 형 변환 해줘야 해야 되서 제니릭을 선호.

    제네릭이란 결정되지 않은 타입을 파라미터로 처리하고
    실제 사용할 때 파라미터를 구체적인 타입을 대체시키는 기능
 */
class ObjectData {  // 모든 타입의 조상은 `Object`이므로  Object 타입을 잡을 수 있다.
    private Object data;    // 클래스의 데이터 타입이 Object 이라서 모든 데이터 타입을 사용 가능.

    public Object getData() {
        return data;
    }

    public void setData(Object data) { // 여러개의 타입을 담아야 한다면 `Object` 타입으로 하면 하나만 써도 됨
        this.data = data;
    }
}

public class Generic01 {
    public static void main(String[] args) {
        ObjectData stringCommonData = new ObjectData();
        ObjectData integerCommonData = new ObjectData();

        stringCommonData.setData("abc");    // 클래스의 데이터 타입이 Object 라서 모든 데이터 타입이 사용 가능.
        integerCommonData.setData(100);

        System.out.println("stringCommonData : " + stringCommonData.getData());   // stringCommonData : abc
        System.out.println("integerCommonData : " + integerCommonData.getData()); // integerCommonData : 100

//        String tmp = stringCommonData.getData();    // 담을 수 있는 타입은 `String` 인데 받아야 되는 타입이 `Object`라서 안됨.
        String tmp = (String) stringCommonData.getData();    // 담을 수 있는 타입은 `String` 인데 받아야 되는 타입이 `Object`라서 안됨.
        // 해결은 간단한데 이 과정 자체가 불편하다는 거임. Object를 잘 사용 안하는 이유가 1. 이런 형변환 2. 속도가 느린 문제 등 때문에 안함
        // 자바에서는 Object 타입을 잘 사용안하지만 코틀린은 많이 사용함..

//        String tmp1 = "123";
//            tmp1 = "123"; // <-- 코틀린은 타입을 적지 않아도 타입추론이라 해서 Object로 받아들림
        // 그래서 Object 문제를 해결하기 위해서 자바에서는 제네릭을 사용함        
    }
}
