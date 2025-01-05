package lambda.ch2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello, World");
        runnable.run();

        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
    }
}
