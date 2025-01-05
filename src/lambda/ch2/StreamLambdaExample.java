package lambda.ch2;

public class StreamLambdaExample {
    public static void main(String[] args) {
        Greeting greeting = (name1) -> {
            System.out.println("안녕하세요, " + name1 + "님!");
        };
        greeting.sayHello("타노스");

        Greeting greeting2 = name -> System.out.println("안녕하세요, " + name + "님!");

        greeting2.sayHello("김철수"); // 출력: 안녕하세요, 김철수님!

    }
}

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}