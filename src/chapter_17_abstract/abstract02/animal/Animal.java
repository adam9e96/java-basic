package chapter_17_abstract.abstract02.animal;
/**
 * ===========================================================
 * fileName       : Animal.java
 * date           : 2024-01-22
 * description    : 추상 클래스 연습-2
 * 추상클래스도 필드, 메서드를 선언할 수 있다.
 * 동물클래스와 고양이와 개를 나타나는 클래스를 추상클래스 및 구현 클래스로 정의하라.
 * 추상클래스에는 name이라는 필드를 가지고 있다.
 * 추상메소드로는 bark(), toString(), introduce() 추상 메소드가 있다.
 *
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

class Cat extends Animal {  // 구현 클래스 Cat // Aniaml 클래스를 상속받음
    private int age;    // age라는 추가적인 필드 선언

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }
    // bark()와 toString() 메소드를 구현하여 고양이의 짖는 소리와 문자열출력을 제공한다.
    @Override
    public void bark() {
        System.out.println("냐옹");
    }

    @Override
    public String toString() {
        return age + "인 " + getName();
    } // 고양이 클래스

}

class Dog extends Animal {  // Animal 클래스를 상속받는다.
    private String type;    // type라는 추가적인 필드를 선언한다.

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    // bark()와 toString() 메소드를 구현하여 개의 짖는 소리와 문자열출력을 제공한다.
    @Override
    public void bark() {
        System.out.println("멍멍");
    }

    @Override
    public String toString() {
        return type + "인 " + getName();
    }
}