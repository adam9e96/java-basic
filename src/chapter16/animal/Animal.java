package chapter16.animal;
// 상속을 이용한 다형성 (Polymorphism through Inheritance):
public class Animal {
    public void sound(){
        System.out.println("동물 소리를 내다.");
    }
    public static void main(String[] args) {
    Animal mypet = new Dog();
    mypet.sound();
    /*
    myPet은 Animal 타입이지만 실제로는 Dog 객체를 참조하고 있으므로 sound() 메서드 호출시 Dog 클래스의 메서드가 실행된다.
     */
    Animal mypet2 = new Cat();
    mypet2.sound();
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("개 소리를 내다.");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("고양이 소리를 내다");
    }
}

