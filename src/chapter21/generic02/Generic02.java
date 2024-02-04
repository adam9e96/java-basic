package chapter21.generic02;

/**
 * ===========================================================
 * fileName       : Generic02
 * date           : 2024-01-25
 * description    : 제네릭 연습2
 * ===========================================================
 */
/* 제네릭은 호출한 쪽에서 타입을 지정하도록 하는 형식임. 처음에는 T로 해놓음 그냥.
    GenericTypeTest
    제네릭(Generic) : 일반화, 범용화라는 의미로,
    클래스나 메서드에서 사용하는 필드나 매개변수의  자료형(클래스형)을 호출하는 쪽에서 지정하도록 하는 기능.

    일반적인 방식으로는 클래스에서 미리 데이터 타입을 지정해야 하지만 제네릭을 사용하면 호출하는 쪽에서 데이터 타입을 지정.
 */
// 모든타입이 T로 선언해놓고 호출한쪽에서 타입을 지정하면 지정한 타입으로 힙메모리에 객체를 만들때 지정한 타입(ex:String)으로 생성이 됨.
// new 키워드에 <>는 적을 필요는 없음 뒤쪽에는 중복이기 때문에 적어도 되고 안적어도 됨 안적는 쪽을 선호함

class CommonData<T> {
    private T data; // 데이터 타입으로 T를 지정. Type 의 약자. 클래스 선언에서 <> 사이에 다른 문자를 넣어도 됨.

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        CommonData<String> stringCommonData = new CommonData<String>(); // 호출하는 쪽에서 타입을 지정
        CommonData<Integer> integerCommonData = new CommonData<>();
        // 선언하면서 타입을 지정하면 생성자에서는 타입을 생략 가능.

        stringCommonData.setData("abc");
        integerCommonData.setData(100);

        System.out.println("stringCommonData : " + stringCommonData.getData()); // stringCommonData : abc
        System.out.println("integerCommonData : " + integerCommonData.getData());   // integerCommonData : 100

        String tmp1 = stringCommonData.getData();
        System.out.println(tmp1);
    }
}
