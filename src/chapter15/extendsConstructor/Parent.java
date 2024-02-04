package chapter15.extendsConstructor;

/**
 * ===========================================================
 * fileName       : Parent
 * date           : 2024-01-24
 * description    : Extend 생성자 생성 순서 연습 -1
 * ===========================================================
 */
public class Parent {
    public String nation;

    public Parent(){
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }

}
