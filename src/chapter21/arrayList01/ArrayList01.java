package chapter21.arrayList01;

import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================================
 * fileName       : ArrayList01
 * date           : 2024-01-25
 * description    : ArrayList연습_1
 * List 컬렉션에서 가장 많이 사용됨.
 * ArrayList에 객체를 추가하면 내부 배열에 객체가 저장된다.
 * 예제 설명
 * ArrayList를 만들고 몇 가지 문자열을 추가한 후, 반복문을 사용하여 모든 요소를 출력하고
 * 특정위치의 요소를 얻으며, 마지막으로 요소를 제거한 후 ArrayList의 크기를 출력하는 예제
 * Q. 일반 배열과의 차이점
 * A. ArrayList는 제한없이 객체를 추가할 수 있다.
 * 일반 배열은 크기가 고정되어 있고 요소를 추가하거나 제거할 때 크기를 조정해야 하지만,
 * ArrayList는 동적으로 크기를 조정할 수 있다는 점 등을 언급할 수 있습니다.
 * ===========================================================
 */
public class ArrayList01 {
    // String 객체를 저장하는 ArrayList
    public static void main(String[] args) {
//      List<String> list = new ArrayList<>();    // <> 안에 부분을 제네릭이라고 함.
//      제네릭을 지정안해도되는데 성능상 문제가 있어서(모든걸 넣을수있도록하게됨) // ArrayList03 참고

        // 문자열을 저장하는 ArrayList 생성
        List<String> smartphoneBrands = new ArrayList<>();

        // ArrayList에 문자열 추가         // 인덱스 번호
        smartphoneBrands.add("갤럭시");  // 0
        smartphoneBrands.add("아이폰");  // 1
        smartphoneBrands.add("낫싱");   // 2
        smartphoneBrands.add("샤오미");  // 3
        smartphoneBrands.add("화웨이");  // 4

        // ArrayList 특정 인덱스에 값 추가
        smartphoneBrands.add(3, "레노버");

        // ArrayList에 저장된 배열 출력
        // ArrayList의 모든 요소 출력
        for (String string : smartphoneBrands) {
            System.out.print(string + " ");
        }
        System.out.println();

        // ArrayList에서 특정 위치의 요소 얻기
        String str = smartphoneBrands.get(2);
        System.out.println("스마트폰 브랜드 3번째 위치 : " + str);

        // ArrayList에서 요소 제거
        smartphoneBrands.remove(1);   // 2번쨰 위치 제거
        System.out.println("스마트폰 2번째 인덱스 값 제거 : " + smartphoneBrands);  // 아이폰 제거

        smartphoneBrands.remove("갤럭시");
        System.out.println("갤럭시 제거 : " + smartphoneBrands);
        System.out.println("갤럭시를 제거한 후 ArrayList의 모든 요소 출력 : ");
        for (String smartphone : smartphoneBrands) {
            System.out.print(smartphone + " ");
        }
        System.out.println();
        // ArrayList의 크기 출력
        System.out.println("ArrayList의 크기: " + smartphoneBrands.size());

        // 테스트코드
        System.out.println(smartphoneBrands);
        /*
        ArrayList 클래스는 자체적으로 toString() 메서드를 구현하고 있다.
        그래서 `System.out.println(stringList);`을 호출하면 내부적으로 ArrayList의 toString() 메서드가 호출되어서 
        ArrayList의 모든 요소를 문자열로 반환합니다. 
        그 결과로 모든 요소가 출력되게 됩니다.
        
        따라서 명시적으로 for문을 사용하지 않아도 `System.out.println(stringList);`을 호출하면 ArrayList에 있는 모든 요소가 출력됩니다. 
        이것은 ArrayList 클래스의 내부 동작과 관련이 있습니다.
        */

    }
}
