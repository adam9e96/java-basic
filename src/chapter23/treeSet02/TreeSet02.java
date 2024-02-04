package chapter23.treeSet02;/*
 * ===========================================================
 * fileName       : treeSet02
 * date           : 2024-01-29
 * description    :
 TreeSet에 저장되는 객체와 TreeMap에 저장되는 키 객체는 저장과 동시에 `오름차순`으로 정렬된다.
 어떤 객체든 정렬될 수 있는 것은 아니고 객체가 Comparable 인터페이스를 구현하고 있어야 가능하다.
 Integer, Double, String 타입은 모두 Comparable 을 구현하고 있기 때문에 상관없지만,
 사용자 정의 객체를 저장할 때는 반드시 Comparable 을 구현하고 있어야 한다.
 * ===========================================================
 */

import java.util.Comparator;
import java.util.TreeSet;
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;   // String 클래스의 compareTo() 메서드를 반대로.
    }
}
public class TreeSet02 {
    public static void main(String[] args) {

        // TreeSet 생성자에 Comparator 를 구현한 객체를 매개변수로 전달함.
        // String 클래스를 수정할 수 없으니 Treeset 생성자에 넘김
        TreeSet<String> set= new TreeSet<>(new MyCompare());
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);    // 기본 정렬은 오름차순

    }
}
