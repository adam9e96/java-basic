package test.chapter18.adstract01;

public class Pikachu extends Pokemon {
    public Pikachu() {
        this.name = "피카추";

    }


    @Override
    public void attack() {
        System.out.println("전광석화!");
    }

    @Override
    public void sound() {
        System.out.println("피카피카");
    }
}
