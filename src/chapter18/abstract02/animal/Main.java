package chapter18.abstract02.animal;

/**
 * ===========================================================
 * fileName       : Main.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-2
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
//         Animal animal = new Animal(); // 추상클래스 단독으로는 객체 생성이 안됨.
//         추상 클래스로 다형성에 이용 가능
        Animal[] animals = {
                new Dog("바둑이", "삽살개"), // 개
                new Cat("아롱이", 7), // 고양이
                new Dog("백두", "진돗개"), // 개
        }; // 콤바로 연결해줘야됨.

        for (Animal animal : animals) {
            animal.introduce(); // animal 가 참조되고 있는 인스턴스의 형에 따라서
            animal.bark();
            System.out.println(); // 메소드가 실행된다.
        }
    }
}
