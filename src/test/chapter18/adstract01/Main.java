package test.chapter18.adstract01;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        System.out.println("이 포켓몬은 " +pikachu.getName());
        pikachu.attack();
        pikachu.sound();

        Squirtle squirtle = new Squirtle();
        System.out.println("이 포켓몬은 " +squirtle.getName());
        squirtle.attack();
    }
}
