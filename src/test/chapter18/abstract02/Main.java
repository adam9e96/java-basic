package test.chapter18.abstract02;

public class Main {
    public static void main(String[] args) {
    Animal[] animals = {
            new Dog("바둑이","시고르자브종"),
            new Cat("마루쉐",8),
            new Dog("백두산","시베리안허스키"),
    };
        for (Animal animal :animals) {
            animal.introduce();
            System.out.println();
        }

    }
}
