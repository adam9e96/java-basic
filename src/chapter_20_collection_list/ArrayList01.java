package chapter_20_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * ===========================================================
 * date           : 2024-01-25
 * <p>
 * List 컬렉션에서 가장 많이 사용됨.
 * ArrayList에 객체를 추가하면 내부 배열에 객체가 저장된다.
 * <p>
 * 예제 설명:
 * ArrayList를 만들고 몇 가지 문자열을 추가한 후, 반복문을 사용하여 모든 요소를 출력하고
 * 특정 위치의 요소를 얻으며, 마지막으로 요소를 제거한 후 ArrayList의 크기를 출력하는 예제
 * <p>
 * Q. 일반 배열과의 차이점
 * A. ArrayList는 제한 없이 객체를 추가할 수 있다.
 * 일반 배열은 크기가 고정되어 있고 요소를 추가하거나 제거할 때 크기를 조정해야 하지만,
 * ArrayList는 동적으로 크기를 조정할 수 있다는 점 등이 차이점이다.
 * ===========================================================
 */

public class ArrayList01 {
    // String 객체를 저장하는 ArrayList
    public static void main(String[] args) {
        // 문자열을 저장하는 ArrayList 생성
        List<String> smartphoneBrands = new ArrayList<>();

        // ArrayList에 문자열 추가
        smartphoneBrands.add("갤럭시");  // 인덱스 0
        smartphoneBrands.add("아이폰");  // 인덱스 1
        smartphoneBrands.add("낫싱");   // 인덱스 2
        smartphoneBrands.add("샤오미");  // 인덱스 3
        smartphoneBrands.add("화웨이");  // 인덱스 4

        // ArrayList 특정 인덱스에 값 추가
        smartphoneBrands.add(3, "레노버");  // 인덱스 3에 "레노버" 추가

        // ArrayList의 모든 요소 출력
        for (String brand : smartphoneBrands) {
            System.out.print(brand + " ");
        }
        System.out.println();
        System.out.println();

        // ArrayList에서 특정 위치의 요소 얻기
        String brandAtIndex2 = smartphoneBrands.get(2);
        System.out.println("스마트폰 브랜드 3번째 위치: " + brandAtIndex2);
        System.out.println();

        // ArrayList에서 요소 제거 (인덱스 사용)
        smartphoneBrands.remove(1);   // 인덱스 1의 요소 제거 (아이폰 제거)
        System.out.println("스마트폰 2번째 인덱스 값 제거: " + smartphoneBrands);
        System.out.println();

        // ArrayList에서 요소 제거 (값 사용)
        smartphoneBrands.remove("갤럭시");
        System.out.println("갤럭시 제거: " + smartphoneBrands);
        System.out.println("갤럭시를 제거한 후 ArrayList의 모든 요소 출력: ");
        for (String brand : smartphoneBrands) {
            System.out.print(brand + " ");
        }
        System.out.println();
        System.out.println();

        // ArrayList의 크기 출력
        System.out.println("ArrayList의 크기: " + smartphoneBrands.size());
        System.out.println();

        // 테스트 코드: ArrayList의 모든 요소 출력 (toString() 메서드 활용)
        System.out.println(smartphoneBrands);
        System.out.println();

        /*
        ArrayList 클래스는 자체적으로 toString() 메서드를 구현하고 있다.
        그래서 `System.out.println(smartphoneBrands);`을 호출하면 내부적으로 ArrayList의 toString() 메서드가 호출되어서
        ArrayList의 모든 요소를 문자열로 반환합니다.
        그 결과로 모든 요소가 출력됩니다.

        따라서 명시적으로 for문을 사용하지 않아도 `System.out.println(smartphoneBrands);`을 호출하면 ArrayList에 있는 모든 요소가 출력됩니다.
        이것은 ArrayList 클래스의 내부 동작과 관련이 있습니다.
        */
    }
}
