package chapter15.parent;

public class TestParent {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        /*
        x = 10
        this.x = 10
        suuper.x = 10
         */
    }
}
