package test.chapter18.abstract02;

public class Cat extends Animal {
    private int age;

    public Cat(String name,int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("냐옹!");
    }

    @Override
    public String toString() {
        return age + "인" + getName();
    }
}
