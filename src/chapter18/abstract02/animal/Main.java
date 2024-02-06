package chapter18.abstract02.animal;

/**
 * ===========================================================
 * fileName       : Main.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-2
 * 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스를 추상 클래스라고함
 * 추상 클래스를 이용하여 다형성을 이용해보자.
 * ===========================================================
 */
public class Main {
    public static void main(String[] args) {
//         Animal animal = new Animal(); // 추상클래스 단독으로는 객체 생성이 안됨.
//         대신 추상 클래스를 이용하여 다형성을 활용할 수있음..

        // 다형성을 이용한 객체 배열 생성
        Animal[] animals = {    // Animal 클래스의 배열인 animals를 생성하고 그 안에 다양한 동물 객체를 저장한다.
                new Dog("바둑이", "삽살개"), // 개
                new Cat("아롱이", 7), // 고양이
                new Dog("백두", "진돗개"), // 개
        }; // 콤바로 연결해줘야됨.
        // 이 배열은 다형성을 활용하여 Animal 타입으로 선언되었지만 실제로는
        // DOg와 Cat 개체를 참조하고 있다.

        for (Animal animal : animals) {
            animal.introduce(); // animal 가 참조되고 있는 인스턴스의 형에 따라서
            animal.bark();
            System.out.println(); // 메소드가 실행된다.
        }
        // 다형성의 활용
        // 배열은 Animal 타입으로 선언되었지만, 각 요소는 실제로 Dog또는 Cat 객체를 참조하고 있다.

    }
}
