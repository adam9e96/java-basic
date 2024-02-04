package test.chapter18.abstract02;

public class Dog extends Animal {
    private String type;

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("월월");
    }

    @Override
    public String toString() {
        return this.type + "인 " + getName();
    }
}
