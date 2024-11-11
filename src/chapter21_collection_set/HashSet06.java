package chapter21_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * {@code MemberShip} 클래스는 이름과 나이를 가진 멤버를 나타냅니다.
 * 이 클래스는 {@code hashCode()} 및 {@code equals()} 메서드를 재정의하여
 * 동일한 이름과 나이를 가진 멤버가 동일하게 취급되도록 하며,
 * 이를 통해 중복 없이 {@code HashSet}에 저장될 수 있습니다.
 * <p>
 * {@code hashCode()} 및 {@code equals()}를 재정의함으로써,
 * 이 클래스는 {@code HashSet}과 같은 해시를 사용하는 컬렉션에서 올바르게 동작할 수 있도록 합니다.
 * </p>
 *
 * @author
 * @version 2024-01-26
 */
class MemberShip {

    /**
     * 멤버의 이름을 나타냅니다.
     */
    public String name;

    /**
     * 멤버의 나이를 나타냅니다.
     */
    public int age;

    /**
     * 지정된 이름과 나이로 새로운 {@code MemberShip} 객체를 생성합니다.
     *
     * @param name 멤버의 이름
     * @param age  멤버의 나이
     */
    public MemberShip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 객체에 대한 해시 코드를 반환합니다.
     * 해시 코드는 멤버의 이름과 나이를 기반으로 계산됩니다.
     * <p>
     * 이 메서드는 동일한 이름과 나이를 가진 두 멤버가 동일한 해시 코드를 가지도록 하여,
     * {@code HashSet}에서 동일하게 취급될 수 있도록 합니다.
     * </p>
     *
     * @return 이 객체에 대한 해시 코드 값
     */
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    /**
     * 일부 다른 객체가 이 객체와 "동일한지"를 나타냅니다.
     * {@code equals} 메서드는 null이 아닌 객체 참조에 대해 동등 관계를 구현합니다.
     * <p>
     * 두 {@code MemberShip} 객체는 동일한 이름과 나이를 가질 때 동등하다고 간주됩니다.
     * </p>
     *
     * @param obj 비교할 참조 객체
     * @return 이 객체가 obj 매개변수와 동일한 경우 {@code true}; 그렇지 않은 경우 {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MemberShip) {
            MemberShip memberShip = (MemberShip) obj;
            return memberShip.name.equals(this.name) && (memberShip.age == this.age);
        } else {
            return false;
        }
    }
}

/**
 * 이 클래스는 동일한 이름과 나이를 가진 MemberShip 객체를
 * HashSet에 중복 없이 저장하는 예제를 보여줍니다.
 * <p>
 * {@code MemberShip} 클래스에서 {@code hashCode()}와 {@code equals()} 메서드를 재정의하여,
 * 이름과 나이가 동일한 객체들이 같은 객체로 간주되도록 하였습니다.
 * 이를 통해 동일한 이름과 나이를 가진 두 객체가 HashSet에 중복 저장되지 않습니다.
 * </p>
 *
 * @version 2024-01-26
 */
public class HashSet06 {
    public static void main(String[] args) {
        Set<MemberShip> set = new HashSet<>();

        // 인스턴스는 다르지만 내부 데이터가 동일하므로 중복되지 않도록 저장됨
        MemberShip memberShip1 = new MemberShip("홍길동", 30);
        MemberShip memberShip2 = new MemberShip("홍길동", 30);

        System.out.println("해시코드 s1 : " + memberShip1.hashCode());
        System.out.println("해시코드 s1 : " + memberShip2.hashCode());

        set.add(memberShip1);
        set.add(memberShip2);

        // set의 목적은 중복된 값을 저장하지 않는 것입니다.
        // 위에서 두 개의 객체가 추가되었지만, 내부 데이터가 동일하므로 실제로는 하나만 저장됩니다.

        System.out.println("총 객체수: " + set.size());  // 결과: 1
        // hashCode()와 equals() 메서드를 재정의함으로써,
        // 동일한 이름과 나이를 가진 객체는 중복되지 않고 하나만 저장됩니다.
    }
}

/*
기본적으로 HashSet은 객체의 주소값을 기준으로 중복 여부를 판단합니다.
하지만, 이 예제에서는 객체의 내부 값(이름과 나이)을 기준으로 중복 여부를 판단하도록
hashCode()와 equals() 메서드를 재정의하였습니다.
*/
