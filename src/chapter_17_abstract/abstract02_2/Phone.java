package chapter_17_abstract.abstract02_2;

/**
 * ===========================================================
 * fileName       : Phone
 * date           : 2024-01-22
 * description    : 추상클래스 연습:2-2
 * Phone 추상 클래스
 * ===========================================================
 */
public abstract class Phone {
    // 필드 선언
    String owner;

    // 생성자 선언
    Phone(String owner) {
        this.owner = owner;
    }
    // 메소드 선은
    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}

class SmartPhone extends Phone {
    // 생성자 선언
    SmartPhone(String owner){
        // Phone 생성자 호출
        super(owner);
    }

    // 메소드 선언
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
