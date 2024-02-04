package chapter15.extendsConstructor;

/**
 * ===========================================================
 * fileName       : Child
 * date           : 2024-01-24
 * description    : Extend 생성자 생성 순서 연습 -1
 * ===========================================================
 */
public class Child extends Parent {
    public String name;

    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }
    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
