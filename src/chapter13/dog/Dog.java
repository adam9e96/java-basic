package chapter13.dog;

public class Dog {
    /*
    강아지를 나타내는 Dog 클래스를 작성한다.

    # 필드
    name : 강아지의 이름. 인스턴스 멤버
    breed : 강아지의 종류. 예를 들면 "요크셔테리어", 인스턴스 멤버
    age : 강아지의 나이. 인스턴스 멤버

    # 메서드
    toString() : 강아지의 정보를 문자열로 반환
    Dog(name, age) : 강아지의 이름과 나이를 초기화
    Dog(name, breed, age) : 강아지의 이름과 종류, 나이를 초기화
    breaking() : 짖음
    setName(), getName() ... : 각 속성에 대한 접근자와 설정자 메서드
     */
    private String name;
    private String breed;
    private int age;


    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed ,'" + breed + "', age =" + age + "}";
    }

    Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void breaking() {
        System.out.println("멍멍!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

}
