package chapter_17_abstract.abstract01;
/**
 * ===========================================================
 * fileName       : Main.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-1
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();    // 반복되는 코드라 경고 발생.

        System.out.println("이 포켓몬은 " + pikachu.getName());
        pikachu.attack();
        pikachu.sound();

        Squirtle squirtle = new Squirtle();
        System.out.println("이 포켓몬은 " + squirtle.getName());
        squirtle.attack();
        squirtle.sound();

        Pokemon pikachu2 = new Pikachu();   // 부모 타입 변수명 = 자식 객체
        pikachu2.attack();                  // 업캐스팅
        pikachu2.sound();

    }
}
