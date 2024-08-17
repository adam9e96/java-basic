package chapter_21_collection_set.hashSet03.HashSetTest;/*
 * ===========================================================
 * fileName       : HashSetTest
 * date           : 2024-01-28
 * description    :
 * ===========================================================
 */

import java.util.HashSet;
import java.util.Set;

class MemberShip {
    // hashCode() 와 equals() 메서드 재정의
    public String name;
    public int age;

    public MemberShip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MemberShip){
            MemberShip memberShip = (MemberShip) obj;
            return memberShip.name.equals(this.name) && (memberShip.age == this.age);
        } else{
            return false;
        }
    }
}
public class HashSetTest {
    public static void main(String[] args) {
        Set<MemberShip> set = new HashSet<>();

//        set.add(new MemberShip("갤럭시",24));
//        set.add(new MemberShip("갤럭시",24));

        System.out.println(set.size());
        MemberShip memberShip1 = new MemberShip("갤럭시S",24);
        MemberShip memberShip2 = new MemberShip("갤럭시S",24);
        set.add(memberShip1);
        set.add(memberShip2);

        System.out.println("총 객체 수: " + set.size());
    }
}
