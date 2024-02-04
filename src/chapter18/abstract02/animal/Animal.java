package chapter18.abstract02.animal;
/**
 * ===========================================================
 * fileName       : Animal.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-2
 * 추상클래스도 필ㄷ, 메서드를 선언할 수 있다.
 * ===========================================================
 */
public abstract class Animal { // 동물 클래스
    private String name;    // 이름


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void bark(); // 짖는다 // 추상 메서드

    public abstract String toString(); // 문자열 표현을 반환    // 추상 메서드

    public void introduce() {   // 일반 메서드.
        System.out.println(toString() + "입니다. ");
        bark();
    }
}

class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("냐옹");
    }

    @Override
    public String toString() {
        return age + "인 " + getName();
    } // 고양이 클래스

}

class Dog extends Animal {
    private String type;

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return type + "인 " + getName();
    }
}