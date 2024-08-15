package chapter_21_collection_map.hashSet03;/*
 * ===========================================================
 * fileName       : MemberShip
 * date           : 2024-01-26
 * description    : Meber 객체를 중복 없이 저장하는 HashSet
  hashCode()와 equals() 메소드를 재정의 하지 않으면 저장된 객체가 2개ode()

 * ===========================================================
 */

public class MemberShip {
    // hashCode() 와 equals() 메서드 재정의
    public String name;
    public int age;

    public MemberShip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 추가된 코드

    //    // 주소 값말고 안에 값을 검사할려면
    @Override   // 이거 실행은 내가 하는게아님. set이 알아서 하는거임 add 메서드 실행시 자기각 알아서 hashCode() equals() 돌림
    public int hashCode() { // hashCode와 equals 는 Object의 메서드임
        // name과 age 값이 같으면 동일한 hashcode 반환
        return name.hashCode() + age;   // String 의 hashCode() 이용   // 홍길동 이름하고 나이하고 똑같은 값을 반환함 name에서 해쉬코드를 들고 오면 해당하는 문자의 해쉬코드를 가져옴. 글자 자체의 해쉬코드를 가져와서 문자열이 동일하면 같다고 보는거임
    }   // 원래의 hashCOde는 주소값을 이런함. 지금까지는 객체 주속값을 반환했었음.

    @Override
    public boolean equals(Object obj) { // name과 age값이 같으면 true 리턴
        // name 과 age 값이 같으면 true 반환  // 해당클래스가 동일한 클래스인지
        if (obj instanceof MemberShip) {    // Object타입이라 아무거나 다 올수 있으므로 MemberShip객체인지 확인 하는거임
            MemberShip memberShip = (MemberShip) obj;   // 맞다면 MemberShip타입을 변환. name과 age를 사용못해서 다운 캐스팅
            return memberShip.name.equals(this.name) && (memberShip.age == this.age);
            // 혹시 아다리가 맞아서 될 수 있으므로 age== age로 한번 더 검사하는거임
        } else {              // ㄴ name과 나이 따로 비교해서 함. 아다리 맞을 수 있기 떄문
            return false;
        }
    }
}
