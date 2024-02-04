package test.chapter18.abstract02;

public abstract class Animal { // 동물 클래스
    private String name; // 이름
    public Animal(String name){
        this.name = name;
    }
    public Animal(){

    }

    public String getName() {
        return name;
    }
    public abstract void bark();
    public abstract String toString(); // 문자열 표현을 반환

    public void introduce() {
        System.out.println(toString()+ "입니다.");
        bark();
    }
}
