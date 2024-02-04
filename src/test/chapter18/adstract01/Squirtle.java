package test.chapter18.adstract01;

public class Squirtle extends Pokemon {
    public Squirtle() {
        this.name = "꼬부기";
    }

    @Override
    public void attack() {
        System.out.println("꼬부기 물대포!");
    }

    @Override
    public void sound() {
        System.out.println("꼬북 꼬북");
    }
}
