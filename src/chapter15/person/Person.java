package chapter15.person;

public class Person { // 사람 클래스
    void breath() {
        System.out.println("숨쉬기");
    }

    void eat() {
        System.out.println("밥먹기");
    }

    void say() {
        System.out.println("말하기");
    }
}

class Student extends Person { // 사람 클래스를 상속한 학생 클래스
    void learn() {
        System.out.println("배우기");
    } // 상속을 받은 자식 클래스는 부모 클래스의 멤버를 물려받아 총 4개의 메서드를 사용가능함.
}

class Teacher extends Person { // 사람 클래스를 상속한 선생 클래스
    void teach() {
        System.out.println("가르치기");
    }
}