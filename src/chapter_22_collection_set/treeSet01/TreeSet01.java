package chapter_22_collection_set.treeSet01;/*
 * ===========================================================
 * fileName       : TreeSet01
 * date           : 2024-01-29
 * description    :
 * ===========================================================
 */

import java.util.Comparator;
import java.util.TreeSet;

class MyCompareInt implements Comparator<Integer>{  // Comparator 구현 클래스 생성:
    @Override
    public int compare(Integer o1, Integer o2) {    // Comparator 추상 메소드 (재정의)
        return o1.compareTo(o2); //* -1;   // Integer 클래스의 compareto() 메서드를 반대로.
        // 음수 리턴하면 a, b를 비교 할 떄 b 가 크다고 본다.
        // 0이면 첫번 쨰 값 리턴
        // 양수 리턴 혹은 o1.compareTo(o2) 원래대로 리턴
        // o1.compareTo(o2) 원래 `Integer`에 있는 정렬 기준
    }
}
/*
MyCompareInt는 Comparator<Integer> 인터페이스를 구현한 사용자 정의 비교 클래스.
compare 메서드를 구현하여 두 정수를 비교하고, o1.compareTo(o2) * -1은 기존 비교 방법의 반대로 정렬하도록 합니다.
 */

// 정렬 기준을 정하기 위한 메소드를 만들고 TreeSet을 생성할때 넘겨줌s
public class TreeSet01 {
    public static void main(String[] args) {    // TreeSet에 사용자 정의 Comparator 적용:
        TreeSet<Integer> score = new TreeSet<>(new MyCompareInt());   // Integer 의 경우도 결과값을 정렬할 수 있다.
//        Scanner scanner = new Scanner(System.in);
        score.add(90);
        score.add(100);
        score.add(85);
        score.add(65);
        score.add(50);
        score.add(75);
        score.add(90);  // 얘는 중복이라 저장이 안된다.

        System.out.println(score);  // [50, 65, 75, 85, 90, 100] 오름차순으로 정렬이 됨

        Integer value = null;    // int value = 0; 으로 해도 상관은 없다.
        value = score.first(); // first() : 가장 작은 값 반환
        print("가장 낮은 점수", value);
        value = score.last(); // last() : 가장 큰 값
        print("가장 높은 점수", value);
        value = score.lower(85);    // lower() : 제공된 값보다 작은 값 중 가장 큰 값 (인자값 미포함)
        print("85바로 이전 점수", value);
        value = score.higher(85);
        print("85 바로 다음 점수", value); // higher() : 제공한 값보다 큰 값 중  근접한  값
        value = score.ceiling(85); // ceiling() : 제공된 값과 동일한 객체가 있으면 리턴, 없다면 주어진 객체의 바로 위에 객체를 리턴
        print("85 ", value); //
        value = score.floor(85); // floor() : 주어진 객체와 동등한 객체가 있다면 리턴, 없다면 주어진 객체 바로 아래의 객체를 리턴
        print("85 ", value); //




        while (!score.isEmpty()) {
            value = score.pollLast();    // pollLast() : 가장 큰 값을 반환 후 삭제
            print("현재 가장 높은 점수", value);
        }

    }

    public static void print(String s, Integer value) {
        System.out.println(s + " : " + value);
    }

}
