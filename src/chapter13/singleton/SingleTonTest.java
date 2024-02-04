package chapter13.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
        /*
        생성자의 접근제한자가 private 여서 실행이 안됨.
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
         */
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        singleton2.as();
        singleton1.sum2(10,5);
    }
}
