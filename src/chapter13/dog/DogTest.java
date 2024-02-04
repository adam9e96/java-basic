package chapter13.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("york","치와와",2);
        System.out.println(dog); // Dog{name='york', breed='치와와',age2}
        dog.breaking(); // 멍멍!!
    }
}
