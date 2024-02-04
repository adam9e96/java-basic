package test.chapter18.adstract01;

public abstract class Pokemon {
    protected String name;

    public String getName() {
        return this.name;
    }

    public abstract void attack();

    public abstract void sound();
}
